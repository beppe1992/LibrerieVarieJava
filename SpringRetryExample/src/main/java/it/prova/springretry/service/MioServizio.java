package it.prova.springretry.service;

import java.sql.SQLException;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MioServizio {

	private static int count = 1;

	@Retryable
	public void simpleRetry() throws Exception {

		System.out.println("Chiamata al servizio numero: " + count);

		// alla prima chiamata vado in errore
		if (count == 1) {
			count++;
			System.out.println("VADO IN ERRORE");
			throw new Exception("Errore Generico");
		}

		count++;
	}

	@Retryable(value = { SQLException.class }, maxAttempts = 2)
	public void simpleParameterRetry() throws Exception {

		System.out.println("Chiamata al servizio numero: " + count);

		// alla prima chiamata vado in SQLException
		if (count == 1) {
			count++;
			System.out.println("VADO IN SQLException");
			throw new SQLException("Errore SQL");
		}

		// alla seconda chiamata vado in Exception quindi il test va in errore
		if (count == 2) {
			count++;
			System.out.println("VADO IN Exception");
			throw new Exception("Errore Generico");
		}

		count++;
	}

	@Retryable(maxAttempts = 3)
	public void simpleRetryWithRecover() throws Exception {

		System.out.println("Chiamata al servizio numero: " + count);

		// alla prima, seconda e terza chiamata vado in errore
		if (count == 1 || count == 2 || count == 3) {
			count++;
			System.out.println("VADO IN ERRORE");
			throw new IllegalArgumentException(
					"Errore IllegalArgumentException");
		}

		count++;
	}

	@Recover
	public void recoverIllegal(IllegalArgumentException exception) {
		System.out
				.println("Gestisco qui il caso in cui il test vada in errore 3 volte");
	}
}

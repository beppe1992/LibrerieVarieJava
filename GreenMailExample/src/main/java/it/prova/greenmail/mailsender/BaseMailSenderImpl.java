package it.prova.greenmail.mailsender;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Classe di invio mail
 * 
 */
public class BaseMailSenderImpl {

	private JavaMailSender mailSender;

	private SimpleMailMessage message;

	private String headerMessage;

	private String corpoDelTesto;

	private String footerMessage;

	private static final String NEW_LINE = System.getProperty("line.separator");

	/**
	 * Invia la mail. Prima di farlo prepara il testo della mail aggiungendo le
	 * varie parti nell'ordine che segue se non sono null o "":
	 * <ul>
	 * <li>headerMessage</li>
	 * <li>corpoDelTesto</li>
	 * <li>footerMessage</li>
	 * </ul>
	 */
	public void sendMail() {
		StringBuilder sbTemp = new StringBuilder();

		sbTemp.append(headerMessage);
		sbTemp.append(NEW_LINE);

		sbTemp.append(corpoDelTesto);
		sbTemp.append(NEW_LINE);

		sbTemp.append(footerMessage);
		sbTemp.append(NEW_LINE);

		message.setText(sbTemp.toString());

		mailSender.send(message);
	}

	public void setHeaderMessage(String headerMessage) {
		this.headerMessage = headerMessage;
	}

	public void setFooterMessage(String footerMessage) {
		this.footerMessage = footerMessage;
	}

	public SimpleMailMessage getMessage() {
		return message;
	}

	public void setMessage(SimpleMailMessage message) {
		this.message = message;
	}

	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setCorpoDelTesto(String corpoDelTesto) {
		this.corpoDelTesto = corpoDelTesto;
	}

}

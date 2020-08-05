package it.prova.greenmail;

import it.prova.greenmail.mailsender.BaseMailSenderImpl;

import java.io.IOException;

import javax.mail.Message;
import javax.mail.MessagingException;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icegreen.greenmail.util.GreenMail;
import com.icegreen.greenmail.util.ServerSetupTest;

@ContextConfiguration(locations = { "classpath:mailService.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class GreenMailTest {

	@Autowired
	private BaseMailSenderImpl mailSender;

	@Autowired
	private JavaMailSenderImpl javaMailSender;

	private GreenMail mailServer;

	@Before
	public void setUp() {
		// inizializzo il server delle mail
		mailServer = new GreenMail(ServerSetupTest.SMTP);
		mailServer.start();

		// setto la porta
		javaMailSender.setPort(ServerSetupTest.SMTP.getPort());
	}

	@After
	public void tearDown() {
		// stoppo il server
		mailServer.stop();
	}

	@Test
	public void send() throws Exception {
		mailSender.sendMail();

		mailChek();
	}

	private void mailChek() throws MessagingException, IOException {
		// recupero i messaggi inviati
		Message[] messages = mailServer.getReceivedMessages();

		// verifico il numero di mail inviate (una al destinatario, una al cc)
		Assert.assertThat(messages.length, Matchers.is(2));

		// recupero le varie parti della mail inviata.
		Assert.assertThat(messages[0].getFrom()[0].toString(),
				Matchers.is("giuseppe.giordano@prova.it"));
		Assert.assertThat(messages[0].getHeader("To")[0].toString(),
				Matchers.is("email.destinatario@prova.it"));
		Assert.assertThat(messages[0].getHeader("Cc")[0].toString(),
				Matchers.is("email.cc@prova.it"));
		Assert.assertThat(messages[0].getSubject(),
				Matchers.is("OGGETTO MAIL PROVA"));
		Assert.assertTrue(String.valueOf(messages[0].getContent()).contains(
				"TESTA"));
		Assert.assertTrue(String.valueOf(messages[0].getContent()).contains(
				"CORPO"));
		Assert.assertTrue(String.valueOf(messages[0].getContent()).contains(
				"CODA"));
	}

}

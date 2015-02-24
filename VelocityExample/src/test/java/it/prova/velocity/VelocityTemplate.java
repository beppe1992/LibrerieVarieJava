package it.prova.velocity;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

public class VelocityTemplate {

	@Test
	public void templateEmail() throws Exception {
		/* first, get and initialize an engine */
		VelocityEngine ve = new VelocityEngine();
		ve.init();
		/* organize our data */
		ArrayList<String> list = new ArrayList<String>();
		list.add("linea 1");

		list.add("");

		list.add("linea 3");

		/* add that list to a VelocityContext */
		VelocityContext context = new VelocityContext();
		context.put("lines", list);
		context.put("header", "Questo e' l'Header");
		context.put("footer", "Fine");
		context.put("text", "Messaggio");

		/* get the Template */
		Template t = ve.getTemplate("src/main/resources/template/email.vm");
		/* now render the template into a Writer */
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		/* use the output in your email body */

		System.out.println((writer.toString()));
	}

}

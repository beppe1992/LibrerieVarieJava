package it.prova.mailtemplate.freemarker;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;

import freemarker.template.Configuration;

public class FreemarkerTemplate {

	@Test
	public void templateEmail() throws Exception {

		Configuration cfg = new Configuration();

		/* organize our data */
		ArrayList<String> list = new ArrayList<String>();
		list.add("linea 1");

		list.add("");

		list.add("linea 3");

		/* add that list to a VelocityContext */
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("lines", list);
		data.put("header", "Questo e' l'Header");
		data.put("footer", "Fine");
		data.put("text", "Messaggio");

		/* get the Template */
		freemarker.template.Template t = cfg
				.getTemplate("src/main/resources/template/freemarker/email.vm");

		/* now render the template into a Writer */
		StringWriter writer = new StringWriter();
		t.process(data, writer);
		/* use the output in your email body */

		System.out.println((writer.toString()));
	}

}

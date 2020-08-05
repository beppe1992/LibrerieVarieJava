package it.prova.twip;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.sf.twip.Assume;
import net.sf.twip.AutoTwip;
import net.sf.twip.NotNull;
import net.sf.twip.TwiP;
import net.sf.twip.Values;

@RunWith(TwiP.class)
public class TestParametriciConObj {

	public static class Person {

		private int age;
		private String name;

		public Person(int i, String name) {
			this.age = i;
			this.name = name;
		}

	}

	@AutoTwip
	public static final Person[] MY_TYPES = { new Person(1, "Simone"),
			new Person(25, "Giuseppe"), new Person(66, "Emanuele") };

	@Test
	public void myTestConObj(Person person) {
		System.out
				.println("Chiamato metod omyTestConObj con una persona di anni "
						+ person.age + " e nome " + person.name);
	}
}

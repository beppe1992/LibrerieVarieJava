package it.prova.twip;

import org.junit.Test;
import org.junit.runner.RunWith;

import net.sf.twip.Assume;
import net.sf.twip.NotNull;
import net.sf.twip.TwiP;
import net.sf.twip.Values;

@RunWith(TwiP.class)
public class TestParametrici {

	public static final String[] MY_STRINGS = { "A", "B", "C", "", null };

	@Test
	public void myTestWithBoolean(boolean flag1) {
		System.out.println("Chiamato metodo myTestWithBoolean con " + flag1);
	}

	@Test
	public void myTestWithInteger(Integer numero) {
		System.out.println("Chiamato metodo myTestWithInteger con " + numero);
	}

	@Test
	public void myTestWithArrayDiParametri(@Values("MY_STRINGS") String string) {
		System.out.println("Chiamato metodo myTestWithArrayDiParametri con "
				+ string);
	}

	@Test
	public void myTestNotNull(@NotNull String string) {
		System.out.println("Chiamato metodo myTestNotNull con " + string);
	}

	@Test
	public void myTestNotZeroInteger(@Assume("!= 0") Integer parametro) {
		System.out.println("Chiamato metodo myTestNotZeroInteger con " + parametro);
	}

}

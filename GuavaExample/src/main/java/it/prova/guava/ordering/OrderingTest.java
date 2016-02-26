package it.prova.guava.ordering;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.google.common.collect.Ordering;

/**
 * La classe Ordering è utile a recuperare alcune informazioni relative
 * all'ordinamento di una lista
 * 
 * @author arx50011
 * 
 */
public class OrderingTest {

	@Test
	public void orderingTest() {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(new Integer(5));
		numbers.add(new Integer(2));
		numbers.add(new Integer(15));
		numbers.add(new Integer(51));
		numbers.add(new Integer(53));
		numbers.add(new Integer(35));
		numbers.add(new Integer(45));
		numbers.add(new Integer(32));
		numbers.add(new Integer(43));
		numbers.add(new Integer(16));

		// visualizzo la lista
		System.out.println("Input List: ");
		System.out.println(numbers);

		System.out.println("======================");
		Ordering<Integer> ordering = Ordering.natural();
		System.out.println("List is sorted: " + ordering.isOrdered(numbers));
		System.out.println("Minimum: " + ordering.min(numbers));
		System.out.println("Maximum: " + ordering.max(numbers));
	}
}

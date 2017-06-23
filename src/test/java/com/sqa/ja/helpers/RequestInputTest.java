/**
 * File Name: RequestInputTest.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 21, 2017
 */
package com.sqa.ja.helpers;

import org.junit.*;

/**
 * RequestInputTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class RequestInputTest {

	@Test
	public void testRequestBooleanString() {
		String question = "Java is an Object Oriented Language?";
		boolean response = AppBasics.requestBoolean(question);
		if (response) {
			System.out.println("Good job!");
		} else {
			System.out.println("Smarten up!");
		}
	}

	@Test
	public void testRequestInputByte() {
		String question = "How many toes on your feet?";
		byte response = AppBasics.requestByte(question);
		System.out.println("You have " + response + " toes on your feet.");
	}

	@Test
	public void testRequestInputChar() {
		String question = "What letter grade do you want?";
		char response = AppBasics.requestChar(question, "", 'M');
		System.out.println("Looks like you are aiming for a(n) " + response + "+");
	}

	@Test
	public void testRequestInputDouble() {
		String question = "How old are you?";
		double response = AppBasics.requestDouble(question);
		if (response >= 18) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("Grow up");
		}
	}

	@Test
	public void testRequestInputFloat() {
		String question = "How much money are you carryinng?";
		float response = AppBasics.requestFloat(question);
		if (response > 10.00) {
			System.out.println("You are rich!");
		} else {
			System.out.println("Poor you...");
		}
	}

	@Test
	public void testRequestInputInt() {
		String question = "How old are you?";
		int response = AppBasics.requestInt(question);
		if (response >= 18) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("Grow up");
		}
	}

	@Test
	public void testRequestInputLong() {
		String question = "How old are you?";
		long response = AppBasics.requestLong(question);
		if (response >= 18) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("Grow up");
		}
	}

	@Test
	public void testRequestInputShort() {
		String question = "How old are you?";
		short response = AppBasics.requestShort(question);
		if (response >= 18) {
			System.out.println("You are an adult!");
		} else {
			System.out.println("Grow up");
		}
	}

	@Test
	public void testRequestInputString() {
		String question = "What day is it?";
		String response = AppBasics.requestString(question);
		if (response.equalsIgnoreCase("wednesday")) {
			System.out.println("Good job!");
		} else {
			System.out.println("Smarten up!");
		}
	}
}

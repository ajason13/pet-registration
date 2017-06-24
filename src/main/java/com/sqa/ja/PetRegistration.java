/**
 * File Name: RegisterPet.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 22, 2017
 */
package com.sqa.ja;

import com.sqa.ja.helpers.*;

/**
 * RegisterPet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration {

	private static String appName = "Pet Registration";

	private final static double REG_COST = 45.00;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		registerPets();
		AppBasics.farewellUser(name);
	}

	private static void registerPets() {
		String registerQuestion = "How many pets do you want to register?";
		String petNameQuestion = "What is pet ";
		String yearQuestion = "How many years do you want to register ";
		int[] registerYears;
		String[] petNames;
		char[] petSex;
		double[] pricePerPet;
		double totalPrice = 0;
		System.out.println("The base price to register one pet is $45 per year.");
		int numOfPets =
				AppBasics.requestIntWithinRange(registerQuestion, 1, 5, "You can only register 5 pets at a time");
		petNames = new String[numOfPets + 1];
		petNames[0] = "Pet Names\tSex\tYears\tPrice";
		petSex = new char[numOfPets + 1];
		pricePerPet = new double[numOfPets + 1];
		registerYears = new int[numOfPets + 1];
		for (int i = 1; i <= numOfPets; i++) {
			petNames[i] = AppBasics.requestString(petNameQuestion + i + "'s name?");
			petSex[i] = AppBasics.requestChar(petNames[i] + "'s gender?", "Must be acceptable gender", 'M', 'F');
			registerYears[i] = AppBasics.requestIntWithinRange(yearQuestion + petNames[i] + "?", 1, 10,
					"You can only register " + petNames[i] + " from 1 - 10 years.");
			pricePerPet[i] = REG_COST * registerYears[i];
			totalPrice += pricePerPet[i];
		}
		System.out.println("\n" + petNames[0]);
		for (int i = 1; i <= numOfPets; i++) {
			System.out
					.println(petNames[i] + "\t\t" + petSex[i] + "\t" + registerYears[i] + "\t$" + pricePerPet[i] + "0");
		}
		System.out.println("\nTotal Price = $" + totalPrice + "0\n");
	}
}

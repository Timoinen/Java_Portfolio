/******************************
Name: laskin	
Creator: Pekka Timonen
Date: 25.6.2018
Desc: Ohjelma toimii yksinkertaisena laskimena.
******************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat*/
import java.util.*;

// Toteutettava luokka.
public class laskin {

	// Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.
	public static void main(String[] args) {
		
		// Esitellään ja luodaan muuttujia.
		double lukuA;
		double lukuB;
		int operator;

		// Luodaan olio syötteiden lukemista varten.
		Scanner lukija;
		Locale.setDefault(Locale.ENGLISH);
		lukija = new Scanner(System.in);

		// Kysytään tietoja käyttäjältä.
		System.out.println("Welcome to seriously limited calculator");
		System.out.println("Enter first operand:");
		lukuA = lukija.nextDouble();
		System.out.println("Enter second operand:");
		lukuB = lukija.nextDouble();
		System.out.println("Select the operator (1 = add, 2 = subtract, 3 = multiply, 4 = divide):");
		operator = lukija.nextInt();

		// Tarkastellaan luettuja lukuja ja tulostetaan laskutoimituksen tulos.
		switch(operator) {
			case 1: System.out.println("The result of calculation is: "  + (lukuA + lukuB));
					break;
			case 2: System.out.println("The result of calculation is: " + (lukuA - lukuB));
					break;
			case 3: System.out.println("The result of calculation is: " + (lukuA * lukuB));
					break;
			case 4: System.out.println("The result of calculation is: " + (lukuA / lukuB));
					break;
			// Mikäli operaattoriluku ei ole väliltä 1-4, ilmoitetaan tämä käyttäjälle.
			default: System.out.println("You didn't give the right operator. Try again.");
					 break;								
		}



	}
}
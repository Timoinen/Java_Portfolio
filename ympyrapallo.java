/******************************
Name: ympyrapallo	
Creator: Pekka Timonen
Date: 24.6.2018
Desc: Ohjelma laskee ympyrän pinta-alan tai pallon tilavuuden
******************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat*/
import java.util.*;

// Toteutettava luokka.
public class ympyrapallo {

	// Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.

	public static void main(String[] args) {
		
		// Esitellään ja luodaan muuttujia.

		double sade;
		double pinta_ala = 0.0;
		double tilavuus = 0.0;
		double pii = Math.PI;
		int valinta;

		// Luodaan olio syötteiden lukemista varten.
		Scanner lukija;
		Locale.setDefault(Locale.ENGLISH);
		lukija = new Scanner(System.in);

		// Kysytään tietoja käyttäjältä.
		System.out.println("Onko kyse pallosta vai ympyrästä? (1=Ympyrä, 2=Pallo)");
		valinta = lukija.nextInt();

		if (valinta == 1) {
			System.out.println("Valitsit ympyrän. Syötä ympyrän säde.");
			sade = lukija.nextDouble();

			// Suoritetaan laskutoimitus.
			pinta_ala = pii * (sade * sade);

			// Tulostetaan vastaus käyttäjälle.
			System.out.println("Ympyrän pinta-ala on: " + pinta_ala);
		}

		if (valinta == 2) {
			System.out.println("Valitsit pallon. Syötä pallon säde.");
			sade = lukija.nextDouble();

			//Suoritetaan laskutoimitus.
			tilavuus = (4 * pii * (sade * sade * sade))/ 3;

			// Tulostetaan vastaus käyttäjälle
			System.out.println("Pallon tilavuus on: " + tilavuus);
		}


	}
}
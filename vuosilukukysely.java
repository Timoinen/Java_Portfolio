/******************************
Name: vuosilukukysely	
Creator: Pekka Timonen
Date: 27.6.2018
Desc: Ohjelma kyselee käyttäjältä vuosilukuja, 
kunnes käyttäjä syöttää luvun -1. Vuosiluvun perusteella ohjelma 
tulostaa kyseisen vuoden jokaisen kuukauden päivien lukumäärän.
Ohjelma osaa huomioida myös karkausvuoden.
******************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat*/
import java.util.*;

// Toteutettava luokka.
public class vuosilukukysely {

	// Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.
	public static void main(String[] args) {
		
		// Esitellään ja luodaan muuttujia.
		int vuosiluku = 0;
		int tammikuu = 31;
		int helmikuu = 28;
		int karkausHelmikuu = 29;
		int maaliskuu = 31;
		int huhtikuu = 30;
		int toukokuu = 31;
		int kesäkuu = 30;
		int heinäkuu = 31;
		int elokuu = 31;
		int syyskuu = 30;
		int lokakuu = 31;
		int marraskuu = 30;
		int joulukuu = 31;

		// Luodaan olio syötteiden lukemista varten.
		Scanner lukija;
		Locale.setDefault(Locale.ENGLISH);
		lukija = new Scanner(System.in);

		// Kysytään tietoja käyttäjältä.
		System.out.println("Kun annat minulle vuoden, tulostan kyseisen vuoden jokaisen kuukauden paivien lukumaaran.");
		System.out.println("Anna vuosi(lopeta ohjelma syottamalla -1):");
		vuosiluku = lukija.nextInt();

		// Jos käyttäjä haluaa lopettaa heti, ei mennä toistoon ollenkaan.
		while (vuosiluku != -1)	{
		
			System.out.println("Vuonna " + vuosiluku + ":");

			//Tarkastetaan onko kyseessä karkausvuosi
			if ( (vuosiluku % 400 == 0) || (vuosiluku % 4 == 0 && vuosiluku % 100 != 0))
			{
					System.out.println("1.kuukausi sisaltaa " + tammikuu + " paivaa");
					System.out.println("2.kuukausi sisaltaa " + karkausHelmikuu + " paivaa");
			}
			else
			{
					System.out.println("1.kuukausi sisaltaa " + tammikuu + " paivaa.");
					System.out.println("2.kuukausi sisaltaa " + helmikuu + " paivaa.");
			}
				System.out.println("3.kuukausi sisaltaa " + maaliskuu + " paivaa.");
				System.out.println("4.kuukausi sisaltaa " + huhtikuu + " paivaa.");
				System.out.println("5.kuukausi sisaltaa " + toukokuu + " paivaa.");
				System.out.println("6.kuukausi sisaltaa " + kesäkuu + " paivaa.");
				System.out.println("7.kuukausi sisaltaa " + heinäkuu + " paivaa.");
				System.out.println("8.kuukausi sisaltaa " + toukokuu + " paivaa.");
				System.out.println("9.kuukausi sisaltaa " + syyskuu + " paivaa.");
				System.out.println("10.kuukausi sisaltaa " + lokakuu + " paivaa.");
				System.out.println("11.kuukausi sisaltaa " + marraskuu + " paivaa.");
				System.out.println("12.kuukausi sisaltaa " + joulukuu + " paivaa.");

				System.out.println("Anna vuosi(lopeta ohjelma syottamalla -1):");
				vuosiluku = lukija.nextInt();
		} 
			

	}
}
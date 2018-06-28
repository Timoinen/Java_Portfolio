/******************************
Name: viikonpaivat		
Creator: Pekka Timonen
Date: 8.6.2018
Desc: Kysyy käyttäjältä viikonpäivän ja millä kielellä käyttäjä haluaa ohjelman tulostavan sen
******************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat*/
import java.util.*;

// Toteutettava luokka.
public class viikonpaivat {

	// Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.
	public static void main(String[] args) {
		
		// Esitellään ja luodaan muuttujia ja taulukkomuuttujia.
		int kieliValinta;
		int paivaValinta;
		String kaannostaulukko[][] = new String[3][7];

		// Luodaan käännostaulukko Suomenkielelle:

		kaannostaulukko[0] [0] = "1. viikonpäivä on suomeksi Maanantai";
		kaannostaulukko[0] [1] = "2. viikonpäivä on suomeksi Tiistai";
		kaannostaulukko[0] [2] = "3. viikonpäivä on suomeksi Keskiviikko";
		kaannostaulukko[0] [3] = "4. viikonpäivä on suomeksi Tostai";
		kaannostaulukko[0] [4] = "5. viikonpäivä on suomeksi Perjantai";
		kaannostaulukko[0] [5] = "6. viikonpäivä on suomeksi Lauantai";
		kaannostaulukko[0] [6] = "7. viikonpäivä on suomeksi Sunnuntai";

		// Luodaan käännöstaulukko Englanninkielelle:

		kaannostaulukko[1] [0] = "1. viikonpäivä on englanniksi Monday";
		kaannostaulukko[1] [1] = "2. viikonpäivä on englanniksi Tuesday";
		kaannostaulukko[1] [2] = "3. viikonpäivä on englanniksi Wednesday";
		kaannostaulukko[1] [3] = "4. viikonpäivä on englanniksi Thursday";
		kaannostaulukko[1] [4] = "5. viikonpäivä on englanniksi Friday";
		kaannostaulukko[1] [5] = "6. viikonpäivä on englanniksi Saturday";
		kaannostaulukko[1] [6] = "7. viikonpäivä on englanniksi Sunday";

		// Luodaan käännöstaulukko Saksankielelle:

		kaannostaulukko[2] [0] = "1. viikonpäivä on saksaksi Montag";
		kaannostaulukko[2] [1] = "2. viikonpäivä on saksaksi Dienstag";
		kaannostaulukko[2] [2] = "3. viikonpäivä on saksaksi Mittwoch";
		kaannostaulukko[2] [3] = "4. viikonpäivä on saksaksi Donnerstag";
		kaannostaulukko[2] [4] = "5. viikonpäivä on saksaksi Freitag";
		kaannostaulukko[2] [5] = "6. viikonpäivä on saksaksi Samstag";
		kaannostaulukko[2] [6] = "7. viikonpäivä on saksaksi Sonntag";
		
		// Luodaan olio syötteiden lukemista varten.
		Scanner lukija;
		lukija = new Scanner(System.in);

		// Kysytään tietoja käyttäjältä.
		System.out.println("Millä kielellä haluat tulostuksen (1=Suomi, 2=Englanti, 3=Saksa)?");
		kieliValinta = lukija.nextInt();

		System.out.println("Minkä päivän nimen haluat tietää (1=maanantai, ..., 7=sunnuntai)?");
		paivaValinta = lukija.nextInt();

		// Tulostetaan vastaus käyttäjälle.

		System.out.println(kaannostaulukko[kieliValinta - 1] [paivaValinta - 1]);

	}
}
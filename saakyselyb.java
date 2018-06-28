/******************************
Name: saakysely
Creator: Pekka Timonen
Date: 31.5.2018
Kuvaus: Kysyy käyttäjältä seitsemän viikonpäivän sademäärät 
ja tulostaa ne näytölle
******************************/

//Tuodaan kirjasto
import java.util.*;

//Toteutettava luokka
public class saakyselyb {

	//Luodaan vakio
	public static final int paivienVakioLkm = 7;

	//Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.
	public static void main(String[] args) {

		// Esitellään ja luodaan taulukkomuuttujia
		int[] paivienVakioLkmTaul = new int[7]; // Muutin sinun taulukkosi nimeä, niin säästyn käännösvirheiltä. Ylipäänsä ei tulisi määritellä/käyttää samannimisenä kuin ylempänä määritelty vakio on
		// viikon päivien lukumäärä on  vakio, taulukossa on näin vakiomäärän verran alkioita
		int[] paivienSadeMaarat = new int[paivienVakioLkm]; // tässä vakion (7) käyttö, tätä haettiin. Jos ohjelmaa pitäisi muuttaa kysymään kahden viikon päivien sademäärät, riittäisi 
		// vakion arvon muuttaminen ->14. Kääntämisen jälkeen ohjelma toimisi ilman mitään muita muutoksia(minun tavallani toistorakenteen avulla tehtynä)

		// Luodaan olio syötteiden lukemista varten
		Scanner lukija;
		Locale.setDefault(Locale.ENGLISH);
		lukija = new Scanner(System.in);

		// Kokeillaan lukea syötteitä
		try {
			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna maanantain sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [0] = lukija.nextInt();

			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna tiistain sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [1] = lukija.nextInt();

			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna keskiviikon sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [2] = lukija.nextInt();

			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna torstain sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [3] = lukija.nextInt();

			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna perjantain sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [4] = lukija.nextInt();

			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna lauantain sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [5] = lukija.nextInt();

			// Kysytään viikonpäivän sademäärä
			System.out.println("Anna sunnuntain sademäärä milleinä:");

			// Luetaan käyttjän antama sademäärä
			paivienVakioLkmTaul [6] = lukija.nextInt();
			
			// hyödynnän toistorakennetta, kun kysyn sademäärät. ma-su vaatisi lisäkooda, joten käytän päivän järjestysnumeroa 1-7.
			//  tulostus onnistuisi vastaavalla tavalla
			for (int i = 0; i < paivienVakioLkm; i++) { // tässäkin hyödynnän vakiota, i saa arvot 0-6, joita hyödynnän taulukkoa läpikäydessä
				System.out.println("Anna viikon " + (i + 1) + ". päivän sademäärä milleinä:");
				paivienSadeMaarat [i] = lukija.nextInt();
			}
		}

		// Jos syötteiden lukemisessa tapahtui virhe, pyritään ottamaan se kiinni.
		catch (InputMismatchException e) {
			// Kerrotaan käyttäjälle mitä tapahtui.
			System.out.println("Virhe syötteiden lukemisessa");
			// Poistutaan ohjelmasta.
			System.exit(0);
		}

		// Syötteiden luku onnistui, kerrotaan tulokset käyttäjälle.
		System.out.println("Maanantain sademäärä oli: " + paivienVakioLkmTaul [0] + "mm");
		System.out.println("Tiistain sademäärä oli: " + paivienVakioLkmTaul [1] + "mm");
		System.out.println("Keskiviikon sademäärä oli: " + paivienVakioLkmTaul [2] + "mm");
		System.out.println("Torstain sademäärä oli: " + paivienVakioLkmTaul [3] + "mm");
		System.out.println("Perjantain sademäärä oli: " + paivienVakioLkmTaul [4] + "mm");
		System.out.println("Launtain sademäärä oli: " + paivienVakioLkmTaul [5] + "mm");
		System.out.println("Sunnuntain sademäärä oli: " + paivienVakioLkmTaul [6] + "mm");
		
	}
}
/******************************
Name: kuukausitulot		
Creator: Pekka Timonen
Date: 13.6.2018
Desc: Kysyy käyttäjältä 12. kuukauden tulot ja laskee sekä tulostaa näytölle tuloista 
yhteenlasketun vuositulon, keskitulon ja suurimman kuukausikohtaisen tulon.
******************************/

/* Otetaan mukaan kirjastot, jotka sisältävät tarvittavat valmiit luokat*/
import java.util.*;

// Toteutettava luokka.
public class kuukausitulot {

	// Luodaan vakio.
	public static final int vakioKuukausiLkm = 12;

	// Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.
	public static void main(String[] args) {

		// Esitellään ja luodaan muuttujia ja taulukkomuuttujia.
		int[] kuukausiTulot = new int [vakioKuukausiLkm];
		
		// Luodaan olio syötteiden lukemista varten
		Scanner lukija;
		Locale.setDefault(Locale.ENGLISH);
		lukija = new Scanner(System.in);

		// Ilmoitetaan käyttäjälle syöttämään kuukausikohtaiset tulot.
		System.out.println("Syötä kuukausikohtaiset tulot.");

		// Kysytään käyttäjältä tietoja.
		for (int i = 0; i < vakioKuukausiLkm; i++) {
			System.out.println("Anna " + (i + 1) + ". kuukauden tulo:");
			kuukausiTulot [i] = lukija.nextInt();
		}

		// Lasketaan kuukausitulot yhteen.
		double kokonaisTulot = 0;

		for(int i : kuukausiTulot) {
			kokonaisTulot += i;
		}

		// Lasketaan tulojen keskiarvo.
		double keskiTulot = kokonaisTulot / vakioKuukausiLkm;

		// Lasketaan suurin kuukausikohtainen tulo.
		double suurinTulo = kuukausiTulot[0];

		for (int i = 0; i < kuukausiTulot.length; i++ ) {
			if (kuukausiTulot[i] > suurinTulo) {
				suurinTulo = kuukausiTulot[i];
			}
		}

		// Tulostetaan kokonaistulot, keskitulot ja suurin kuukausitulo.
		System.out.println("Kokonaistulot ovat " + kokonaisTulot);
		System.out.println("Keskiarvoinen kuukausikohtainen tulo on " + keskiTulot);
		System.out.println("Suurin kuukausikohtainen tulo on " + suurinTulo);


		
	}
}
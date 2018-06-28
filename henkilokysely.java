/******************************
Name: henkilokysely
Creator: Pekka Timonen
Date: 21.5.2018
Kuvaus: Kysyy henkilöltä tietoja
******************************/

// Tuodaan kirjasto
import java.util.*;

//Toteutettava luokka
public class henkilokysely {

	//Toteutettava luokka sisältää vain pääohjelman, jota kutsutaan ohjelman käynnistyessä.
	public static void main(String[] args) {
		
		//Esitellään ja alustetaan tarvittavat muuttujat.
		byte ika = 0;
		float pituus = 0;
		short paino = 0;
		String kortti =" ";

		// Esitellään Scanner olio syötteiden lukua varten.
		Scanner lukija;

		// Luodaan valmiin Scanner-luokan mukainen olio syötteiden lukua varten.
		lukija = new Scanner(System.in);

		// Kokeillaan lukea syötteitä.
		try {
			// Pyydetään syöttämään ikä
			System.out.println("Syötä ikäsi:");

			// Luetaan käyttäjän antama ikä byte -muodossa.
			ika = lukija.nextByte();

			// Pyydetään syöttämään pituus metreinä.
			System.out.println("Syötä pituutesi metreinä käyttämällä pilkkua erottimena");

			// Luetaan käyttäjän antama ikä float -muodossa.
			pituus = lukija.nextFloat();

			//Pyydetään syöttämään paino
			System.out.println("Syötä painosi");

			// Luetaan käyttäjän antama paino short -muodossa.
			paino = lukija.nextShort();

			// Kysytään omistaako henkilö ajokortin.
			System.out.println("Omistatko ajokortin? k/e?");

			// Luetaan käyttäjän antama vastaus string -muodossa.
			kortti = lukija.next();
		}
		// Jos syötteiden lukemisessa tapahtui virhe, pyritään ottamaan se kiinni.
		catch (InputMismatchException e) {
			// Kerrotaan käyttäjälle mitä tapahtui.
			System.out.println("Virhe syötteiden lukemisessa");
			// Poistutaan ohjelmasta.
			System.exit(0);
		}

		// Syötteiden luku onnistui, kerrotaan tulokset käyttäjälle.
		System.out.println("Ikäsi on " + ika);
		System.out.println("Pituutesi on " + pituus);
		System.out.println("Painosi on " + paino);
		System.out.println("Omistatko ajokortin " + kortti);

	}

}
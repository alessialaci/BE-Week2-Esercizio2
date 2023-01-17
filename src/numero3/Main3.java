package numero3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Rubrica r1 = new Rubrica();
		
		Scanner in = new Scanner(System.in);
		int selezione;

		do {
			System.out.println("Scegli un'opzione:");
			System.out.println("1 - Aggiungi contatto");
			System.out.println("2 - Elimina contatto");
			System.out.println("3 - Ricerca contatto tramite numero");
			System.out.println("4 - Ricerca contatto tramite nome");
			System.out.println("5 - Mostra rubrica");
			System.out.println("0 - Esci");

			selezione = in.nextInt();
			switch(selezione) {
			case(0):
				break;
			case(1):
				r1.creaContatto();
				break;
			case(2):
				r1.eliminaContatto();
				break;
			case(3):
				r1.recuperaContattoDaTelefono();
				break;
			case(4):
				r1.recuperaContattoDaNome();
			break;
			case(5):
				r1.stampaContatti();
			break;
			default:
				System.out.println("valore errato!");
				break;
			}
		} while(selezione != 0);

		in.close();
	}

}

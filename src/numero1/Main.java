package numero1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Set<String> words = new HashSet<>();
		Set<String> duplicateWords = new HashSet<>();
		
		System.out.println( "Inserire il numero di parole da inserire: " );
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println( "Inserire la parola " + (i + 1) );
			String word = scan.next();
			if ( !words.add(word) ) {
				duplicateWords.add(word);
			}
		}
		
		System.out.println( "Parole duplicate: " + duplicateWords );
		System.out.println( "Numero di parole distinte: " + words.size() );
		System.out.println( "Elenco delle parole distinte: " + words );

		scan.close();
		
	}
	
}

package numero3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rubrica {
	
	Scanner scan = new Scanner(System.in);
	Map<String, String> contatti = new HashMap<>();
	String nome;
	String telefono;
	
	public void creaContatto() {
		System.out.println("Inserire nome del nuovo contatto");
		nome = scan.nextLine();
		
		System.out.println("Inserire numero del nuovo contatto");
		telefono = scan.nextLine();
		
		contatti.put(nome, telefono);
	}
	
	public void eliminaContatto() {
		System.out.println("Inserire nome contatto da cancellare:");
		String nomeCanc = scan.nextLine();
		
		if(contatti.containsKey(nomeCanc)) {
			contatti.remove(nomeCanc);
			System.out.println("Contatto cancellato");
		} else {
			System.out.println("Contatto non trovato");
		}
	}
	
	public void recuperaContattoDaTelefono() {
		System.out.println("Inserire il numero del contatto da cercare:");
		String numeroContatto = scan.nextLine();
		
		for (Map.Entry<String, String> entry : contatti.entrySet()) {
			if (entry.getValue().equals(numeroContatto)) {
				System.out.println("Contatto trovato: " + entry.getKey() + " " + entry.getValue());
			}
		}
	}
	
	public void recuperaContattoDaNome() {
		System.out.println("Inserire il numero del contatto da cercare:");
		String nomeContatto = scan.nextLine();
		
		for(Map.Entry<String, String> entry: contatti.entrySet()) {
			if(entry.getKey().equals(nomeContatto)) {
				System.out.println("Contatto trovato: " + entry.getKey() + " " + entry.getValue());
			}
		}
	}
	
	public void stampaContatti() {
		if(!contatti.isEmpty()) {
			for(Map.Entry<String, String> entry: contatti.entrySet()) {
				System.out.println("Nome: " + entry.getKey() + " - Numero: " + entry.getValue());
			}
		} else {
			System.out.println("La lista è vuota");
		}
	}
	
	
}

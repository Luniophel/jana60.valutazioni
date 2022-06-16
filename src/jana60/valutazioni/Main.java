package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Variabili
		int nStudents;										//Numero studenti presenti nella lista AKA grandezza dell'array studentList
		Scanner scan = new Scanner(System.in);				//Scanner per prendere input dall'utente
		
		//Raccolta del numero di studenti per creare l'array
		System.out.print("Inserire il numero di studenti da valutare: ");
		nStudents = scan.nextInt();
		
		//Dichiarazione dell'array con numero di studenti scelto dall'utente
		Studente[] studentList = new Studente[nStudents];
		
		//Chiusura dello scanner
		scan.close();
	}

}

package jana60.valutazioni;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//VARIABILI
		//Numero studenti presenti nella lista AKA grandezza dell'array studentList
		int nStudents;	
		//Scanner per prendere input dall'utente
		Scanner scan = new Scanner(System.in);				
		
		//Raccolta del numero di studenti per creare l'array
		System.out.print("Inserire il numero di studenti da valutare: ");
		nStudents = Integer.parseInt(scan.nextLine());
		
		//Dichiarazione dell'array con numero di studenti scelto dall'utente
		Studente[] studentList = new Studente[nStudents];
		
		//Compilazione per ogni slot dell'array fino al suo valore massimo nStudents
		for(int i = 0; i < nStudents; i++) {
	
			//CASI DI TESTING
			//Disattivare le variabili temp1 e temp2 con input dall'utente, dopodiché attivarne una sola per volta
			//CaseTest01 - Assenze > 50 - Se corretto, dovrebbe restituire BOCCIATO
//			int temp1 = 51;
//			int temp2 = 3;
			//CaseTest02 - 25 <= Assenze <= 50 - Se corretto, dovrebbe restituire PROMOSSO
//			int temp1 = 30;
//			int temp2 = 3;
			//CaseTest03 - Assenze < 25 - Se corretto, dovrebbe restituire BOCCIATO
//			int temp1 = 10;
//			int temp2 = 1;
			//FINE CASI DI TESTING
			
			//Richieste dei dati all'utente utilizzando 2 variabili temporanee
			System.out.print("\nInserire la percentuale d'assenze dello studente: ");
			int temp1 = Integer.parseInt(scan.nextLine());
			System.out.print("Inserire la valutazione media dello studente: ");
			float temp2 = Float.parseFloat(scan.nextLine());

			//Salvataggio dei dati nella posizione [i] dell'array
			studentList[i] = new Studente(i, temp1, temp2);
				
		}
		//Struttura Header della lista
		System.out.println("_____________________");
	
		//Stampa della lista completa di studenti per ID univoco, con annessi promozione/bocciatura e numero totale di promozioni
		int nGraduated = 0;
		for(int i = 0; i < nStudents; i++) {
			
			System.out.format("%1s %2o %1s %1s %8s %1s %1s", "|", studentList[i].studentID, "|", " ", studentList[i].calcIfGraduate(), " ", "|");
			System.out.println("");
			
			//Contatore che mantiene il numero totale di studenti promossi
			if (studentList[i].calcIfGraduate().equals("Promosso")) {
				++nGraduated;
			}
			
		}
		
		//Print finale che stampa su schermo il numero totale di studenti promossi
		System.out.println("_____________________");
		System.out.format("%12s %1s %2o", "TOT.PROMOSSI", " ", nGraduated);
	
		//Chiusura dello scanner
		scan.close();
	}

}

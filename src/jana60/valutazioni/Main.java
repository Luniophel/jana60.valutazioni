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
			
			//Metodo che controlla e sistema valori potenzialmente errati, prima che vengano utilizzati nel calcolo delle successive lines
			studentList[i].setStudentAbsencePerc(studentList[i].studentAbsencePerc);
			studentList[i].setStudentAverageGrades(studentList[i].studentAverageGrades);
			
			//Struttura della tabella che verrà stampata su console con annessi dati
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

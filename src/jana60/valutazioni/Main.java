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
		nStudents = scan.nextInt();
		
		//Dichiarazione dell'array con numero di studenti scelto dall'utente
		Studente[] studentList = new Studente[nStudents];
		
		//Compilazione per ogni slot dell'array fino al suo valore massimo nStudents
		//Dopo la compilazione, procedere con calcolo promozione calcIfGraduate per ogni iterazione
		for(int i = 0; i < nStudents; i++) {
			
			//Variabili temporanee per calcolo dei risultati nel ciclo
			int temp1;
			float temp2;
			//CASI DI TESTING
			//CaseTest01 - Assenze > 50 - Se corretto, dovrebbe restituire BOCCIATO
//			temp1 = 51;
//			temp2 = 3;
			//CaseTest02 - 25 <= Assenze <= 50 - Se corretto, dovrebbe restituire PROMOSSO
			temp1 = 30;
			temp2 = 3;
			//CaseTest03 - Assenze < 25 - Se corretto, dovrebbe restituire BOCCIATO
//			temp1 = 10;
//			temp2 = 1;
			
			studentList[i] = new Studente(i, temp1, temp2);
				
		}
		//Stampa della lista completa di studenti per ID univoco, con annessi promozione/bocciatura e numero totale di promozioni
		for(int i = 0; i < nStudents; i++) {
			
			System.out.println(studentList[i].calcIfGraduate());
			
		}

		
		//Chiusura dello scanner
		scan.close();
	}

}

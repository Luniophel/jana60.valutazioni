package jana60.valutazioni;


public class Studente {
	//ATTRIBUTES
	int studentID, studentAbsencePerc;
	float studentAverageGrades;
	
	//CONSTRUCTORS
	Studente(int studentID, int studentAbsencePerc, float studentAverageGrades){
		
		this.studentID = studentID;
		this.studentAbsencePerc = studentAbsencePerc;
		this.studentAverageGrades = studentAverageGrades;
		
	}
	
	//METHODS
	//Metodo che calcola se lo studente è stato promosso o bocciato, basandosi sui dati di percentuale assenze e media dei voti
	String calcIfGraduate() {
		
		if	((studentAbsencePerc >= 25 && studentAbsencePerc <= 50) && studentAverageGrades > 2) {
			return "Promosso";
		}
		else if	(studentAbsencePerc < 25 && studentAverageGrades >= 2) {
			return "Promosso";
		}
		else {
			return "Bocciato";
		}
		
	}
	//Metodo che corregge eventuali errori nell'inserimento del valore, che deve essere tra 0 e 100, estremi compresi
	void setStudentAbsencePerc(int studentAbsencePerc) {
		if(studentAbsencePerc > 100) {
			this.studentAbsencePerc = 100;
		}
		else if (studentAbsencePerc < 0) {
			this.studentAbsencePerc = 0;
		}
	}
	//Metodo che corregge eventuali errori nell'inserimento del valore, che deve essere tra 0 e 5, estremi compresi
		void setStudentAverageGrades(float studentAverageGrades) {
			if(studentAverageGrades > 5) {
				this.studentAverageGrades = 5;
			}
			else if (studentAverageGrades < 0) {
				this.studentAverageGrades = 0;
			}
		}
	

}

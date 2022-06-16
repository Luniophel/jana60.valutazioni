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
		
		if	((studentAbsencePerc >= 25 || studentAbsencePerc <= 50) && studentAverageGrades > 2) 
		{
			return "Promosso";
		}
		if	(studentAbsencePerc < 25 && studentAverageGrades >= 2) 
		{
			return "Promosso";
		}
		else 
		{
			return "Bocciato";
		}
		
	}

}

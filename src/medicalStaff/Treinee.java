package medicalStaff;

import main.StaffClass;

//Class responsible for encapsulating the attributes for Treinees;
//Extends the abstract class 'StaffClass';
public class Treinee extends StaffClass {

	public Treinee() {

	}

	// Contructor of the class;
	// Receives the attributes name, staffNumber, salary and occupation from
	// 'MedFactory' class;
	public Treinee(String name, int staffNumber, int salary, String occupation) {
		super(name, staffNumber, salary, occupation);
		this.name = name;
		this.staffNumber = staffNumber;
		this.salary = salary;
		this.occupation = occupation;
	}

}

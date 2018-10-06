class Students {
	int qualified;
	int vacancies;
	int unresvacancies;
	int bcvacancies;
	int scvacancies;
	int stvacancies;
	int subject1,subject2,subject3,totalmarks;
	String name, dateofbirth, reservation;
	Students(String name, String dateofbirth, int subject1, int subject2, int subject3, int totalmarks, String reservation) {
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		this.totalmarks = totalmarks;
		this.reservation = reservation;
	}
	Students(int qualified, int vacancies, int unresvacancies, int bcvacancies, int scvacancies, int stvacancies) {
		this.qualified = qualified;
		this.vacancies = vacancies;
		this.unresvacancies = unresvacancies;
		this.bcvacancies = bcvacancies;
		this.scvacancies = scvacancies;
		this.stvacancies = stvacancies;
	}
	String getname() {
		return this.name;
	}
	String getdateofbirth() {
		return this.dateofbirth;
	}
	int getsubject1() {
		return this.subject1;
	}
	int getsubject2() {
		return this.subject2;
	}
	int getsubject3() {
		return this.subject3;
	}
	int gettotalmarks() {
		return this.totalmarks;
	}
	String getreservation() {
		return this.reservation;
	}
	int getqualified() {
		return this.qualified;
	}
	int getvacancies() {
		return this.vacancies;
	}
	int getunresvacancies() {
		return this.unresvacancies;
	}
	int getbcvacancies() {
		return this.bcvacancies;
	}
	int getscvacancies() {
		return this.scvacancies;
	}
	int getstvacancies() {
		return this.stvacancies;
	}
}
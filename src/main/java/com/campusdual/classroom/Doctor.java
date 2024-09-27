package com.campusdual.classroom;

public class Doctor extends Person {

	protected String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}
	public void getDetails(){
		StringBuilder sb = new StringBuilder();
		sb.append(this.name);
		sb.append(" ");
		sb.append(this.surname);
		sb.append(" ");
		sb.append(this.specialization);
		System.out.println(sb);

	}
}

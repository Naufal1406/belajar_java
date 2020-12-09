package belajar_java;

public class Main {

//	public static int total;
	
	public static void main(String[] args) {	
		
	Person person = new Person("Mochamad", "Farid Naufal", "Cirebon");
	Student student = new Student("Mochamad", "Farid Naufal", "Cirebon", "45151");
	
	//MENGGUNAKAN METHOD YANG ADA DI INTERFACE
	student.studentRegistration();
	student.learningPlan();
	
	
	System.out.println("\n======================================");
	System.out.println("DATA DIRI MAHASISWA");
	System.out.println(person.fullName());
	System.out.println(person.location());
//	System.out.println(student.getSchedule());
	System.out.println(student.totalSks());
	
	
	//LOGIC PENGECEKKAN JUMLAH SKS YANG DIINPUTKAN USER
	if(student.getTotal() < 144) {
		System.out.println("\n-- SELAMAT BERJUANG !!--");
		System.out.println(person.fullName());
	} else {
		System.out.println("\n-- SELAMAT KAMU SUDAH MENDAPATKAN GELAR !!--");
		System.out.println(student.fullName());
	}
	}
}

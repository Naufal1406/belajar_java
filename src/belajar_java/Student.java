package belajar_java;

import java.util.Arrays;
import java.util.Scanner;

public class Student extends Person implements StudentData {
	public int total; 
	private String studentID;
	
	Scanner scanner = new Scanner(System.in);
	
	public Student(String firstName, String lastName, String domisili, String studentID) {
		super(firstName, lastName, domisili);
		// TODO Auto-generated constructor stub
		this.studentID = studentID;
	}
	
	//METHOD OVERRIDING  YANG ADA DI SUPERCLASS YAITU fullName dengan title
	@Override
	public String fullName() {
		// TODO Auto-generated method stub
		return super.fullName() + " S.T";
	}

	//GETTER UNTUK MENGOPER VALUE DARI INPUTAN USER BIAR BISA DIAKSES DI SEMUA CLASS
	//TOTAL SKS YANG DIINPUTKAN UNTUK MENENTUKAN ADA TITLE ATAU TIDAK
	public int getTotal() {
		return total;
	}
	
	//METHOD UNTUK MENDAPATKAN NILAI DARI StudentID (GETTER)
	public String getStudentID() {
		return studentID;
	}
	
	//METHOD UNTUK MENGINPUTKAN TOTAL SKS DARI USER
	public String totalSks() {
		System.out.println("Banyak SKS keseluruhan : ");
		total = scanner.nextInt();
		return "Total SKS yang sudah diambil sebanyak " + this.total + " SKS";
		
	}

	//METHOD TOTAL SKS YANG SEDANG DIAMBIL DI SEMESTER INI (INPUTAN USER)
	private int totalCredit;

	@Override
	public void learningPlan() {
		// TODO Auto-generated method stub
		int i = 0;
				
		//MENDEKLARASI JUMLAH 
		System.out.print("Berapa mata kuliah yang diambil semester ini : ");
		totalCredit = scanner.nextInt();
		
		//DEKLARASI ARRAY KOSONG
		String[] lecturer = new String[totalCredit];
		String[] courseName = new String[totalCredit];
		int[] credit = new int[totalCredit];
		String[] room = new String[totalCredit];
		
		//LOOPING UNTUK MENGISI ARRAY
		for(i = 0 ; i < totalCredit ; i++){
			//Menggunakan Array masing-masing untuk menyimpan data Dosen, Matakuliah dan Bobot 
			System.out.println("Mata kuliah ke - " + (i+1));
			System.out.print("Nama Dosen\t\t: ");
			lecturer[i] = scanner.next();
					
			System.out.print("Nama Mata Kuliah\t: ");
			courseName[i] = scanner.next();
			
			System.out.print("Bobot SKS\t\t: ");
			credit[i] = scanner.nextInt();
			
			System.out.print("Ruangan \t\t: ");
			room[i] = scanner.next();
			System.out.println();
		}
//		System.out.println("\n======================================");
//		System.out.println("DAFTAR DOSEN, MATAKULIAH DAN BOBOT");
//		System.out.print("Daftar nama dosen mata kuliah : ");
//		System.out.println(Arrays.toString(lecturer));
//		System.out.print("Daftar nama mata kuliah : ");
//		System.out.println(Arrays.toString(courseName));
//		System.out.print("Daftar bobot sks masing-masing mata kuliah : ");
//		System.out.println(Arrays.toString(credit));
//		System.out.print("Daftar ruangan masing-masing mata kuliah : ");
//		System.out.println(Arrays.toString(room));
		
		System.out.println("\n======================================");
		System.out.println("DAFTAR DOSEN, MATAKULIAH DAN BOBOT");
		for(i = 0 ; i < totalCredit ; i++) {
			System.out.println((i+1) + ".\tNama Dosen\t\t: " + lecturer[i]);
			System.out.println("\tNama Mata Kuliah\t: " + courseName[i]);
			System.out.println("\tBobot SKS\t\t: " + credit[i]);
			System.out.println("\tRuangan\t\t\t: " + room[i]);
			System.out.println();
		}
	}
	
	@Override
	public void studentRegistration() {
		// TODO Auto-generated method stub
		Person person = new Person("Mochamad", "Farid Naufal");
		Student student = new Student("Mochamad", "Farid Naufal", "Cirebon", this.studentID );
		System.out.println("Nama Mahasiswa\t\t: "+ person.fullName());
		System.out.println("Nomor Induk Mahasiswa\t: " + student.getStudentID());
	}
}

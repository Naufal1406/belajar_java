package belajar_java;

public class Person {
	private String firstName;
	private String lastName;
	private String domisili;
	
	//MENGGUNAKAN METODE CONSTRUCTOR OVERLOADING
	//CONSTRUCTOR TANPA PARAMETER == TANPA CONSTRUCTOR
	public Person() {
	}
		
	//CONTRUCTOR DENGAN 2 PARAMETER
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//CONSTRUCTOR DENGAN 3 PARAMETER
	public Person(String firstName, String lastName, String domisili) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.domisili = domisili;
	}
	
	//SETTER DAN GETTER (ENCAPSULATION)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}
	//METHOD MEMBUAT FULL NAME
	public String fullName() {
		return firstName + " " + lastName;
	}
	
	//METHOD MENAMBAHKAN DOMISILI/ASAL
	public String location() {
		return "Saya berdomisili di " + domisili;
	}
}

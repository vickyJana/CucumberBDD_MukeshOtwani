package oct202022;

public class Trainer {

	 String[] Trainer1info = { "Mukesh", "Testing", "mukesh@gmail.com", "1" };

	String[] Trainer2info = { "Hitesh", "Dev", "mukesh@gmail.com", "2" };

	String[] Trainer3info = { "Mukesh", "DevOps", "mukesh@gmail.com", "3" };

	public Trainer(String string, String string2, String string3, int i) {

		trainer1();
		trainer2();
		trainer3();

	}

	public Trainer(String[] trainer1info2) {
		trainer1();
		trainer2();
		trainer3();
	}

	// // Task 1- Create a class name as “Trainer” which will have 4 fields name,
	// department , email, id. Trainer can teach Selenium, DevOps, Web Development.
//		Note- use method, constructor 
//
//		Trainer details are 
//		Trainer 1 – “Mukesh” ,”Testing”,mukesh@gmail.com, 1
//		Trainer 2 – “Hitesh” ,”Dev”,mukesh@gmail.com, 2
//		Trainer 1 – “Mukesh” ,”DevOps”,mukesh@gmail.com, 3
//
//		Trainer 1 can teach Selenium, Trainer 2 can teach Web Development, Trainer 3 can teach DevOps.
	public static void main(String[] args) {
		
		Trainer stringTrainer= new Trainer(null);

		Trainer trainer1 = new Trainer(null, null, null, 0);

		// Trainer trainer1 = new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
//
//		// System.out.println(trainer1);
//
//		Trainer trainer2 = new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
//
//		// System.out.println(trainer2);
//
//		Trainer trainer3 = new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);

		// System.out.println(trainer3);

	}

	public void trainer1() {

		String name = "Mukesh";
		String department = "Testing";
		String email = "mukesh@gmail.com";
		int id = 1;
		
		

		System.out.println("Trainer1 details are " + name + " " + department + " " + email + " " + id);
	}

	public void trainer2() {
		String name = "Hitesh";
		String department = "Dev";
		String email = "mukesh@gmail.com";
		int id = 2;

		System.out.println("Trainer2 details are " + name + " " + department + " " + email + " " + id);
	}

	public void trainer3() {
		String name = "Mukesh";
		String department = "DevOps";
		String email = "mukesh@gmail.com";
		int id = 3;

		System.out.println("Trainer3 details are " + name + " " + department + " " + email + " " + id);
	}

}

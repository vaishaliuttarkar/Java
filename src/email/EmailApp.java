package email;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//making object also called as class instance for constructor
		Email emp1 = new Email("Vaishali", "Uttarkar");
		//Email emp2 = new Email("Varsha", "Uttarkar");
        //emp1.setalternatemail("vs@gmail.com");
       // System.out.println(emp1.getalternatemail());
		System.out.println(emp1.showInfo());
	}

}

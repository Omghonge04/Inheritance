package Inheriitancecode;

public class Main {
	 public static void main(String[] args) {
	        Manager m = new Manager();

	        m.work();
	        System.out.println("Salary: " + m.salary);

	       
	        m.manager();
	        System.out.println("Bonus: " + m.bonus);
	    }
}

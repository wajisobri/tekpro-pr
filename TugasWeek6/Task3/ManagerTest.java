package TugasWeek6.Task3;

public class ManagerTest {
	public static void main (String[] args){
		Employee[] staff = new Employee[3];
		staff[2] = new Manager("Antonio Rossi", 2000000, 1, 10, 1989);
		staff[0] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
		staff[1] = new Manager("Isabel Vidal", 3000000, 1, 11, 1993);
		int i;
		// for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
		for (i = 0; i < 3; i++) staff[i].print();
		
	 	System.out.println("\nShell Sorted:");
	 	Sorting.shell_sort(staff);
	 	for (i = 0; i < staff.length; i++) staff[i].print();
	}
}
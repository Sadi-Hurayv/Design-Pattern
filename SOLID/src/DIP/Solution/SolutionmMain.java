/**
 * 
 */
package DIP.Solution;

/**
 * @author shuvra
 *
 */
public class SolutionmMain {
	
	public static void main(String[] args) {
		Address adr = new Address("Laxmipur", "3700");
		Student stu = new Student("Shekh", adr);
		stu.studentDetails();
	}

}

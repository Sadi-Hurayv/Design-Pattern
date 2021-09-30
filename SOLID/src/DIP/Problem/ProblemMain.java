/**
 * 
 */
package DIP.Problem;

/**
 * @author shuvra
 *
 *		High level modules should not depend upon low level modules. 
 *		Both should depend upon abstractions.
 */
public class ProblemMain {
	
	public static void main(String[] args) {
		Student stu = new Student("Shuvra","Laxmipur", "3700");
		stu.studentDetails();
	}

}

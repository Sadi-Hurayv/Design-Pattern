/**
 * 
 */
package LSP.Problem;

/**
 * @author shuvra
 *	if class A is a subtype of class B, then we should be able to replace B with A without disrupting the behavior of our program.
 */
public class ProblemMain {
	
	public static void main(String[] args) {
		
		Duck duck = new Duck("Jenny");
		duck.eat();
		duck.fly();
		
		Ostrich ostrich = new Ostrich("Jeck");
		ostrich.eat();
		ostrich.fly(); // This shouldn't be here because ostrich can't fly.
	}

}

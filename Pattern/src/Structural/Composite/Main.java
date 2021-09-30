/**
 * 
 */
package Structural.Composite;

/**
 * @author shuvra
 *
 */
public class Main {
	
	public static void main(String[] args) {
		GeneralManager gm = new GeneralManager("GM-001","Sayma Nawal");
		
		SalseManager sm = new SalseManager("SM-101", "MoonMoon Das");
		JuniorSalseManager jsm = new JuniorSalseManager("JSM-102", "Saifur Rahman");
		
		AccountManager am = new AccountManager("AM-201", "Nishat Tasnim");
		JuniorAccountManager jam = new JuniorAccountManager("JAM-202", "Al Jaber");
		
		gm.addEmployee(sm);
		gm.addEmployee(am);
		
		sm.addEmployee(jsm);
		am.addEmployee(jam);
		
		gm.printDetails();
	}

}

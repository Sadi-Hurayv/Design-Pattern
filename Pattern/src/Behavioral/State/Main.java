package Behavioral.State;

public class Main {
	
	public static void main(String[] args) {
		Context con = new Context();
		con.execute();
		
		Start strt = new Start();
		Stop stp = new Stop();
		Hold hld = new Hold();
		
		con.setState(strt);
		con.execute();
		
		con.setState(hld);
		con.execute();
		
		con.setState(stp);
		con.execute();
	}
}

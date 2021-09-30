package Behavioral.ChainOfResponsiblity;

public interface Chain {
	public void setNext(Chain nextInChain);
	public void process (Dimension request);
	
}

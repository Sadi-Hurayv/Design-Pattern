/**
 * 
 */
package Behavioral.ChainOfResponsiblity;

import java.util.Arrays;

/**
 * @author shuvra
 *
 */

public class ThreeDimension implements Chain{
	
	Chain nextInChain;
	@Override
	public void setNext(Chain nextInChain) {
		// TODO Auto-generated method stub
		this.nextInChain=nextInChain;
	}

	@Override
	public void process(Dimension request) {
		// TODO Auto-generated method stub
		if(request.getCoordinate().length==3) {
			System.out.println("Three Dimension: " + Arrays.toString(request.getCoordinate()));
		}
		else {
			if(this.nextInChain==null) {
				System.out.println("Last Node");
			}
			else {
				nextInChain.process(request);
			}
		}
	}
}

/**
 * 
 */
package Behavioral.Observer.Cricketex;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author shuvra
 *
 */
public class CricketData implements Subject{
	
	private int run;
	private int wicket;
	private float over;
	
	private ArrayList<Observer> ObserverList;
	
	public CricketData(){
		ObserverList = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer obj) {
		// TODO Auto-generated method stub
		ObserverList.add(obj);
	}

	@Override
	public void unregister(Observer obj) {
		// TODO Auto-generated method stub
		ObserverList.remove(obj);
	}

	@Override
	public void observerNotify() {
		// TODO Auto-generated method stub
		for(Iterator<Observer> it = ObserverList.iterator(); it.hasNext();) {
			Observer O = it.next();
			O.update(run, wicket, over);
		}
	}
	
    // get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 90;
    }
  
    // get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 2;
    }
  
    // get latest overs from stadium
    private float getLatestOvers()
    {
        // return 90 for simplicity
        return (float)10.2;
    }
    
    public void dataChanged() {
    	run = getLatestRuns();
        wicket = getLatestWickets();
        over = getLatestOvers();
        
        observerNotify();
    }

}

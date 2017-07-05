package Condicion;

import java.util.Observable;
import java.util.Observer;

public class ConditionObserver implements Observer {

	private Observable ov = null;

	public ConditionObserver(Observable ov) {
		this.ov = ov;
	}
	
	@Override
	public void update(Observable obs, Object arg) {
		if (obs == ov) {
			System.out.println(arg);
		}
	}

}

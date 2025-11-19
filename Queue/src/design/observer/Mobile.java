package design.observer;

import desingn.observer.Observer;

public class Mobile implements Observer{
	
	private String mobileOwner;

	
	public Mobile(String mobileOwner) {		
		this.mobileOwner = mobileOwner;
	}


	@Override
	public void update(float temperature) {
		System.out.println("mobile ("+ mobileOwner + " ) recived update : Tempreture = "+ temperature);
	}


	
	



	

}

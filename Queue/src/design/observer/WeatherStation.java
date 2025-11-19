package design.observer;

import java.util.ArrayList;
import java.util.List;

import desingn.observer.Observable;
import desingn.observer.Observer;
public class WeatherStation implements Observable {
	 private float temperature;
	  private List<Observer> observers;

	    public WeatherStation() {
	        observers = new ArrayList<>();
	    }

	    
	    @Override
	    public void notifyObservers() {
	        for (Observer o : observers) {
	            o.update(temperature);
	        }
	    }

	    public void setTemperature(float temperature) {
	        System.out.println("WeatherStation: New Temperature = " + temperature);
	        this.temperature = temperature;
	        notifyObservers();
	    }

		@Override
		public void removeObserver(Observer o) {
			 observers.remove(o);
			
		}

		@Override
		public void addObserver(Observer o) {
			// TODO Auto-generated method stub
			 observers.add(o);
		}

}

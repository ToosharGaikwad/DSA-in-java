package design.observer;
import desingn.observer.Observable;
import design.observer.*;

public class MainApp {

	public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        Mobile mobile1 = new Mobile("Tushar");
        Mobile mobile2 = new Mobile("Rahul");

        station.addObserver(mobile1);
        station.addObserver(mobile2);

        station.setTemperature(30.5f);
        station.setTemperature(28.0f);

        station.removeObserver(mobile2);

        station.setTemperature(25.0f);
	}

}

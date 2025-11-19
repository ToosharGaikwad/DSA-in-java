package desingn.observer;

public interface Observable {
	public void notifyObservers();
	 public void removeObserver(Observer o) ;
	 public void addObserver(Observer o) ;
	 

}

package fan.study.patterns.behavioral.observer;

public interface Subject {

	public void attach(Observer observer);
	
	public void detach(Observer observer);
	
	public void notifyAllObserver();
}

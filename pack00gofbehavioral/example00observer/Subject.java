package pack00gofbehavioral.example00observer;

// Subject(to be observed) Interface
public interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
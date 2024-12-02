package behavioral;
import java.util.ArrayList;
import java.util.List;

// Subject(to be observed) Interface
interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}

// Concrete Subject 
class WeatherStation implements Subject {
  // Observers for displaying
  private List<Observer> observers = new ArrayList<>();
  private String weather;

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update(weather);
    }
  }

  public void setWeather(String newWeather) {
    this.weather = newWeather;

    notifyObservers();
  }
}

// Observer Interface
interface Observer {
  void update(String weather);
}

// Concrete Observer
class PhoneDisplay implements Observer {
  private String weather;

  @Override
  public void update(String weather) {
    this.weather = weather;

    display();
  }

  private void display() {
    System.out.println("Phone Display: Weather updated - " + weather);
  }
}

// Concrete Observer
class TVDisplay implements Observer {
  private String weather;

  @Override
  public void update(String weather) {
    this.weather = weather;

    display();
  }

  private void display() {
    System.out.println("TV Display: Weather updated - " + weather);
  }
}

// Usage Class
public class _1_Observer {
  public static void main(String[] args) {
    // Subject to be observed
    WeatherStation weatherStation = new WeatherStation();

    // Observers
    Observer phoneDisplay = new PhoneDisplay();
    Observer tvDisplay = new TVDisplay();

    // Add observers to subject
    weatherStation.addObserver(phoneDisplay);
    weatherStation.addObserver(tvDisplay);

    // Simulating weather change
    weatherStation.setWeather("Sunny");
    weatherStation.setWeather("Rainy");
  }
}


/* 
Output

Phone Display: Weather updated - Sunny
TV Display: Weather updated - Sunny

Phone Display: Weather updated - Rainy
TV Display: Weather updated - Rainy
*/
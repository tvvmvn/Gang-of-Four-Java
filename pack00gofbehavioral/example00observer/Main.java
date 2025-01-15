package pack00gofbehavioral.example00observer;

// Usage Class
public class Main {
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
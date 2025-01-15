package pack00gofbehavioral.example00mediator;

// Main 
public class Main {
  public static void main(String[] args) {
    // Mediator (airport control tower)
    AirTrafficControlTower controlTower = new AirportControlTower();
 
    // Colleagues (commercial airplanes)
    Airplane airplane1 = new CommercialAirplane(controlTower);
    Airplane airplane2 = new CommercialAirplane(controlTower);
 
    // Set up the association between colleagues and mediator
    airplane1.requestTakeoff();
    airplane2.requestLanding();
  }
}


/* 
Output

Commercial Airplane: Requesting takeoff clearance.
Commercial Airplane: Requesting landing clearance.
*/
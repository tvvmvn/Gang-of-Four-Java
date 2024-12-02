package behavioral;
// Colleague(to be mediated) Interface 
interface Airplane {
  void requestTakeoff();
  void requestLanding();
  void notifyAirTrafficControl(String message);
}
 
// Mediator Interface
interface AirTrafficControlTower {
  void requestTakeoff(Airplane airplane);
  void requestLanding(Airplane airplane);
}

// Concrete Colleague
class CommercialAirplane implements Airplane {
  private AirTrafficControlTower mediator;
 
  public CommercialAirplane(AirTrafficControlTower mediator) {
    this.mediator = mediator;
  }
 
  @Override
  public void requestTakeoff() {
    mediator.requestTakeoff(this);
  }
 
  @Override
  public void requestLanding() {
    mediator.requestLanding(this);
  }
 
  @Override
  public void notifyAirTrafficControl(String message) {
    System.out.println("Commercial Airplane: " + message);
  }
}
 
// Concrete Mediator
class AirportControlTower implements AirTrafficControlTower {
  @Override
  public void requestTakeoff(Airplane airplane) {
    
    // Logic for coordinating takeoff..

    // if ok, notify other planes to take off
    airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
  }
 
  @Override
  public void requestLanding(Airplane airplane) {
    
    // Logic for coordinating landing..

    // if ok, notify other planes to land
    airplane.notifyAirTrafficControl("Requesting landing clearance.");
  }
}
 
// Main 
public class _1_Mediator {
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
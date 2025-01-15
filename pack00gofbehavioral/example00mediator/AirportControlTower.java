package pack00gofbehavioral.example00mediator;

// Concrete Mediator
public class AirportControlTower implements AirTrafficControlTower {
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

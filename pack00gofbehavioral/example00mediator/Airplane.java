package pack00gofbehavioral.example00mediator;

// Colleague(to be mediated) Interface 
public interface Airplane {
  void requestTakeoff();
  void requestLanding();
  void notifyAirTrafficControl(String message);
}
 

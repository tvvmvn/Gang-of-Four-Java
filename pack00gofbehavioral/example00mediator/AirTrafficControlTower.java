package pack00gofbehavioral.example00mediator;

// Mediator Interface
public interface AirTrafficControlTower {
  void requestTakeoff(Airplane airplane);
  void requestLanding(Airplane airplane);
}
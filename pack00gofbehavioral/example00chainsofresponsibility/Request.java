package pack00gofbehavioral.example00chainsofresponsibility;

// Request Class
public class Request {
  
  private Priority priority;

  public Request(Priority priority) {
    this.priority = priority;
  }

  public Priority getPriority() {
    return priority;
  }
}

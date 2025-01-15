package pack00gofbehavioral.example00chainsofresponsibility;

// Main Class
public class Main {
  public static void main(String[] args) {
    // Create each handlers.
    SupportHandler level1Handler = new Level1SupportHandler();
    SupportHandler level2Handler = new Level2SupportHandler();
    SupportHandler level3Handler = new Level3SupportHandler();

    // Set chains of handler
    level1Handler.setNextHandler(level2Handler);
    level2Handler.setNextHandler(level3Handler);

    // Requests to be handled
    Request request1 = new Request(Priority.BASIC);
    Request request2 = new Request(Priority.INTERMEDIATE);
    Request request3 = new Request(Priority.CRITICAL);

    // Send requests to chains
    level1Handler.handleRequest(request1);
    level1Handler.handleRequest(request2);
    level1Handler.handleRequest(request3);
  }
}


/* 
Output

Level 1 Support handled the request.
Level 2 Support handled the request.
Level 3 Support handled the request.
*/
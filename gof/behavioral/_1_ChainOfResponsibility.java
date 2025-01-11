package behavioral;

// Handler Interface
interface SupportHandler {
  void handleRequest(Request request);
  void setNextHandler(SupportHandler nextHandler);
}

// Concrete Handler: Level1SupportHandler
class Level1SupportHandler implements SupportHandler {
  private SupportHandler nextHandler;

  public void setNextHandler(SupportHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handleRequest(Request request) {
    if (request.getPriority() == Priority.BASIC) {
      System.out.println("Level 1 Support handled the request.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    }
  }
}

// Concrete Handler: Level2SupportHandler
class Level2SupportHandler implements SupportHandler {
  private SupportHandler nextHandler;

  public void setNextHandler(SupportHandler nextHandler) {
    this.nextHandler = nextHandler;
  }

  public void handleRequest(Request request) {
    if (request.getPriority() == Priority.INTERMEDIATE) {
      System.out.println("Level 2 Support handled the request.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    }
  }
}

// Concrete Handler: Level3SupportHandler
class Level3SupportHandler implements SupportHandler {
  public void handleRequest(Request request) {
    if (request.getPriority() == Priority.CRITICAL) {
      System.out.println("Level 3 Support handled the request.");
    } else {
      System.out.println("Request cannot be handled.");
    }
  }

  public void setNextHandler(SupportHandler nextHandler) {
    // No next handler for Level 3
  }
}

// Request Class
class Request {
  private Priority priority;

  public Request(Priority priority) {
    this.priority = priority;
  }

  public Priority getPriority() {
    return priority;
  }
}

// Priority Enum
enum Priority {
  BASIC, 
  INTERMEDIATE, 
  CRITICAL
}

// Main Class
public class _1_ChainOfResponsibility {
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
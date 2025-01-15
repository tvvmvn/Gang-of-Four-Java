package pack00gofbehavioral.example00chainsofresponsibility;

// Handler Interface
public interface SupportHandler {
  
  void handleRequest(Request request);
  void setNextHandler(SupportHandler nextHandler);
}

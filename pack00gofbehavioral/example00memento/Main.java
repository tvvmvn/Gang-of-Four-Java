package pack00gofbehavioral.example00memento;

// Main
public class Main {
  public static void main(String[] args) {
    Document document = new Document("A");
    History history = new History();

    // Create first document memento
    history.addMemento(document.createMemento());

    // Add some content
    document.write("B");
    history.addMemento(document.createMemento());

    // Add more content
    document.write("C");
    history.addMemento(document.createMemento());

    // Restore to previous state from: [A, AB, ABC]
    document.restoreFromMemento(history.getMemento(1));

    // Print document content
    System.out.println(document.getContent());
  }
}


/* 
Output

AB
*/
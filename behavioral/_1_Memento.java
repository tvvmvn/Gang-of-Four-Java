package behavioral;
import java.util.ArrayList;
import java.util.List;

// Originator
class Document {
  private String content;

  public Document(String content) {
    this.content = content;
  }

  public void write(String text) {
    this.content += text;
  }

  public String getContent() {
    return this.content;
  }

  public DocumentMemento createMemento() {
    return new DocumentMemento(this.content);
  }

  public void restoreFromMemento(DocumentMemento memento) {
    this.content = memento.getSavedContent();
  }
}

// Memento
class DocumentMemento {
  private String content;

  public DocumentMemento(String content) {
    this.content = content;
  }

  public String getSavedContent() {
    return this.content;
  }
}

// Caretaker
class History {
  // Document mementos
  private List<DocumentMemento> mementos;

  public History() {
    this.mementos = new ArrayList<>();
  }

  public void addMemento(DocumentMemento memento) {
    this.mementos.add(memento);
  }

  public DocumentMemento getMemento(int index) {
    return this.mementos.get(index);
  }
}

// Main
public class _1_Memento {
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
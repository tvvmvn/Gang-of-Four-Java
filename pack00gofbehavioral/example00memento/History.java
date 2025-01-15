package pack00gofbehavioral.example00memento;
import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History {
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

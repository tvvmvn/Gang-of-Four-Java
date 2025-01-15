package pack00gofstructural.example00flyweight;

// Client
public class Main {
  public static void main(String[] args) {
    
    IconFactory iconFactory = new IconFactory();

    // Get file icons from factory
    Icon fileIcon1 = iconFactory.getIcon("file");
    Icon fileIcon2 = iconFactory.getIcon("file");
    
    // Draw file icons at different positions
    fileIcon1.draw(100, 100);
    fileIcon2.draw(150, 150);

    // Get folder icons from factory
    Icon folderIcon1 = iconFactory.getIcon("folder");
    Icon folderIcon2 = iconFactory.getIcon("folder");
    
    // Draw folder icons at different positions
    folderIcon1.draw(200, 200);
    folderIcon2.draw(250, 250);
  }
}


/* 
Output

Drawing document icon with image document.png at position (100, 100)
Drawing document icon with image document.png at position (150, 150)

Drawing folder icon with color blue and image folder.png at po...
*/
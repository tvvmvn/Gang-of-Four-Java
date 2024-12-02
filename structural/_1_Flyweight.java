package structural;
import java.util.HashMap;
import java.util.Map;

// Flyweight Interface
interface Icon {
// Method to draw the icon at given coordinates (extrinsic state)
  void draw(int x, int y);  
}

// Concrete Flyweight: FileIcon
class FileIcon implements Icon {
// Intrinsic state: type and image of file icon
  private String type;  
  private String imageName; 

  public FileIcon(String type, String imageName) {
    this.type = type;
    this.imageName = imageName;
  }

  @Override
  public void draw(int x, int y) {
    System.out.println("Drawing " + type + " icon with image " + imageName + " at position (" + x + ", " + y + ")");
  }
}

// Concrete Flyweight: FolderIcon
class FolderIcon implements Icon {
  // Intrinsic state: color and image of folder icon
  private String color;  
  private String imageName;

  public FolderIcon(String color, String imageName) {
    this.color = color;
    this.imageName = imageName;
  }

  @Override
  public void draw(int x, int y) {
    System.out.println("Drawing folder icon with color " + color + " and image " + imageName + " at position (" + x + ", " + y + ")");
  }
}

// Flyweight Factory: IconFactory
class IconFactory {
  // It stores icons like document, folder, app, etc.
  private Map<String, Icon> iconCache = new HashMap<>();

  // to manage creation and retrieval of flyweight objects
  public Icon getIcon(String key) {
    if (iconCache.containsKey(key)) {
      // Check if the icon already exists in the cache and
      // return existing data to save memory.
      return iconCache.get(key);
    } else {
      // Create a new icon based on the key (type of icon)
      Icon icon;

      // create file icon
      if (key.equals("file")) {
        icon = new FileIcon("document", "document.png");
      // create folder icon
      } else if (key.equals("folder")) {
        icon = new FolderIcon("blue", "folder.png");
      } else {
        throw new IllegalArgumentException("Unsupported icon type: " + key);
      }
      
      // Store the created icon in the cache to reuse.
      iconCache.put(key, icon);

      return icon;
    }
  }
}

// Client
public class _1_Flyweight {
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
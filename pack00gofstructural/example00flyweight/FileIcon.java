package pack00gofstructural.example00flyweight;

// Concrete Flyweight: FileIcon
public class FileIcon implements Icon {
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
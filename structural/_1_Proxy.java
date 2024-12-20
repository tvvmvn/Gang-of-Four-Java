package structural;
// Subject
interface Image {
  void display();
}

// RealSubject
class RealImage implements Image {
  private String filename;

  public RealImage(String filename) {
    this.filename = filename;
    loadImageFromDisk();
  }

  private void loadImageFromDisk() {
    System.out.println("Loading image: " + filename);
  }

  public void display() {
    System.out.println("Displaying image: " + filename);
  }
}

// Proxy
class ProxyImage implements Image {
  private String filename;
  // Real image for caching
  private RealImage realImage;

  public ProxyImage(String filename) {
    this.filename = filename;
  }

  public void display() {
    if (realImage == null) {
      realImage = new RealImage(filename);
    }

    // Some tasks for authencation, validation in here..
    
    realImage.display();
  }
}

// Client code
public class _1_Proxy {
  public static void main(String[] args) {
    Image image = new ProxyImage("example.jpg");

    // Image will be loaded from disk only when display() is called
    image.display();

    // Image will not be loaded again, as it has been cached in the Proxy
    image.display();
  }
}


/* 
Output

Loading image: example.jpg
Displaying image: example.jpg
Displaying image: example.jpg
*/

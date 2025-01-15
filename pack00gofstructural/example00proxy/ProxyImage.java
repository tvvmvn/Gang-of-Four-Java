package pack00gofstructural.example00proxy;

// Proxy
public class ProxyImage implements Image {
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

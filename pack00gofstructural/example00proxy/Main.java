package pack00gofstructural.example00proxy;

// Client code
public class Main {
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

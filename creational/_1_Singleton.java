package creational;

class Singleton {
  // static attribute
  private static Singleton instance;
  
  private Singleton() {
    System.out.println("Singleton is Instantiated.");
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    
    return instance;
  }

  public static void doSomething() {
    System.out.println("Somethong is Done.");
  }
}

public class _1_Singleton {
  public static void main(String[] args) {
    Singleton.getInstance().doSomething();
  }
}


/*
Output

Singleton is Instantiated.
Somethong is Done.
*/
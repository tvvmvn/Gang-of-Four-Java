package pack00relationships.example00association;

public class Address {
  
  public String city;
  public String street;

  public Address(String city, String street) {
    this.city = city;
    this.street = street;
  }

  public String toString() {
    return String.format("Address[city='%s', street='%s']", city, street);
  }
};

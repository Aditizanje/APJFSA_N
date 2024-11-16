package Javaprogram;

public class thiskeyword {
	// Employee class
    String name;
    int age;
    Address address;

   // Constructor
   public thiskeyword(String name, int age, Address address) {
       this.name = name;
       this.age = age;
       this.address = address;
   }

   // Overloaded constructor
   public thiskeyword(String name, int age) {
       this(name, age, new Address("Unspecified", "Unspecified")); // Passing this to another constructor
   }

   // Method to display employee details
   public void displayDetails() {
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       address.displayAddress(); // Using this implicitly
   }

   // Inner class Address
   public static class Address {
        String city;
        String state;

       public Address(String city, String state) {
           this.city = city;
           this.state = state;
       }

       public void displayAddress() {
           System.out.println("City: " + city + ", State: " + state);
       }
   }

   // Main method
   public static void main(String[] args) {
       // Create Employee object with address
   	thiskeyword emp1 = new thiskeyword("Aditi Zanje", 21, new thiskeyword.Address("New York", "NY"));

       // Create Employee object without address
   	thiskeyword emp2 = new thiskeyword("Anuja Salunkhe", 21);

       // Display employee details
       System.out.println("Employee 1 Details:");
       emp1.displayDetails();

       System.out.println("\nEmployee 2 Details:");
       emp2.displayDetails();
   }

}
/* OUTPUT:
 * Employee 1 Details:
Name: Aditi Zanje
Age: 21
City: New York, State: NY

Employee 2 Details:
Name: Anuja Salunkhe
Age: 21
City: Unspecified, State: Unspecified
*/

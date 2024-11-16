package Javaprogram;

public class Address {
	    // Attributes
	    private String street;
	    private String city;
	    private String state;
	    private String zipCode;

	    // Constructor to initialize all attributes
	    public Address(String street, String city, String state, String zipCode) {
	        this.street = street;
	        this.city = city;
	        this.state = state;
	        this.zipCode = zipCode;
	    }

	    // Getter methods for each attribute
	    public String getStreet() {
	        return street;
	    }

	    public String getCity() {
	        return city;
	    }

	    public String getState() {
	        return state;
	    }

	    public String getZipCode() {
	        return zipCode;
	    }

	    // Method to display the full address
	    public void displayAddress() {
	        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + zipCode);
	    }

	    // Main method to test the Address class
	    public static void main(String[] args) {
	        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
	        address.displayAddress(); // Display the address
	    }
	}
/*OUTPUT:
         Address: 123 Main St, Springfield, IL - 62701*/




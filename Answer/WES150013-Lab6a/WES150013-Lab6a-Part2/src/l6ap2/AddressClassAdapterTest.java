/**
 * This one is using class adapter pattern
 */
package l6ap2;
public class AddressClassAdapterTest {
    public static void main(String[] args) {
        String name = "Google";
        String address = "1600 Amphitheatre Parkway";
        String zip = "94043";
        String state = "CA";
        String type = "US";
        
        System.out.println("Using USAddressValidator");
        Customer customer = new Customer(address, name, zip, state, type);
        printOutput(customer);
        
        System.out.println("\nUsing CAAddressValidator via adapter");
        type = "Canada";
        customer = new Customer(address, name, zip, state, type);
        printOutput(customer);
    }
    
    public static void printOutput(Customer customer){
        System.out.println("Customer Name: "+customer.getName());
        System.out.println("Address: "+customer.getAddress());
        System.out.println("Zip/PostalCode: "+customer.getZip());
        System.out.println("StateProvince: "+customer.getState());
        System.out.println("Address Type: "+customer.getType());
        if(customer.isValidAddress()){
            System.out.println("Result: Valid customer data");
        }
        else{
            System.out.println("Result: Invalid customer data");
        }
    }
    
}

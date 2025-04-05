package Class;

public class Cashier extends User {
    public Cashier(String username, String password, String userRole, String name, String mobileNumber, String address, String status) {
        super(username, password, userRole, name, mobileNumber, address, status);
    }
    @Override
    public void AbstractMethod() {
        System.out.println("Cashier specific behavior: View product details, search stock details, and search product details.");
    }
}





package Class;

public class Manager extends User {

    public Manager(String username, String password, String userRole, String name, String mobileNumber, String address, String status) {
        super(username, password, userRole, name, mobileNumber, address, status);
    }

    @Override
    public void AbstractMethod() {
        System.out.println("Manager specific behavior: Manage products, categories, and accounts.");
    }
}

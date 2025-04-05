package Class;

public abstract class User {
    
    protected String username;
    protected String password;
    protected String userRole;
    protected String name;
    protected String mobileNumber;
    protected String address;
    protected String status;
    
    public User(String username, String password, String userRole, String name, String mobileNumber, String address, String status) {
        this.username = username;
        this.password = password;
        this.userRole = userRole;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getStatus() {
        return status;
    }
    
    public abstract void AbstractMethod();
}


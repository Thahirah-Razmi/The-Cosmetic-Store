package Class;

public class Product {
    private int productPk;
    private String name;
    private int quantity;
    private double price;
    private String description;
    private int categoryFk;

    public Product(int productPk, String name, int quantity, double price, String description, int categoryFk) {
        this.productPk = productPk;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;
        this.categoryFk = categoryFk;
    }

    // Getters and setters
    public int getProductPk() {
        return productPk;
    }

    public void setProductPk(int productPk) {
        this.productPk = productPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCategoryFk() {
        return categoryFk;
    }

    public void setCategoryFk(int categoryFk) {
        this.categoryFk = categoryFk;
    }
}


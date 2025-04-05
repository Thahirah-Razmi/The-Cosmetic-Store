package Class;

public class Category {
    private int categoryPk;
    private String name;

    public Category(int categoryPk, String name) {
        this.categoryPk = categoryPk;
        this.name = name;
    }

    public int getCategoryPk() {
        return categoryPk;
    }

    public void setCategoryPk(int categoryPk) {
        this.categoryPk = categoryPk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}


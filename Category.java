public class Category {

    private String name;
    private int id;
    private Integer noOfItems;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setItems(int noOfItems) {
        this.noOfItems = noOfItems;
    }

    public int getItems() {
        return this.noOfItems;
    }
}
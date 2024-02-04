public class CameraView {

    private String image;
    private Category category;
    private int noOfObjects;
    private Colour colourGradient;

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return this.image;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return this.category;
    }

    public void setObjects(int noOfObjects) {
        this.noOfObjects = noOfObjects;
    }

    public int getObjects() {
        return this.noOfObjects;
    }

    public void setColour(Colour colourGradient) {
        this.colourGradient = colourGradient;
    }

    public Colour getColour() {
        return this.colourGradient;
    }
}
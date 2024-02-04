public class TestCameraView {
    public static void main(String[] args) {
        CameraView c = new CameraView();

        c.setImage("red");
        System.out.println(c.getImage());

        Category ct = new Category();
        ct.setName("education");

        Colour cl = new Colour();
        cl.setBlue(35);

        CameraView obj2 = new CameraView();
        obj2.setCategory(ct);
        System.out.println(obj2.getCategory());

        CameraView obj3 = new CameraView();
        obj3.setColour(cl);
        System.out.println(obj3.getColour());
    }
}
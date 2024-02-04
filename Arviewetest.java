public class Arviewetest {
    public static void main(String[] args) {
        Item it = new Item();
        it.Setname("Kittipat2547");
        System.out.println(it.Getname());

        Colour cl = new Colour();
        cl.setBlue(33);
        System.out.println(cl.getBlue());

        Arview obj1 = new Arview();
        obj1.Setitem(it);
        System.out.println(obj1.Getitem());

        Arview obj2 = new Arview();
        obj2.Setcolour(cl);
        System.out.println(obj2.Getcolour());

        Arview obj3 = new Arview();
        obj3.Setthreedobject("Nooooooooo");
        System.out.println(obj3.Getthreedobject());

    }
}

public class Arview {
    private Item item;
    private String threedobject;
    private Colour colour;
    private int dimention;

    public void Setitem(Item it){
        this.item = it;
    }
    public Item Getitem(){
        return item;
    }
    
    public void Setthreedobject(String st){
        this.threedobject = st;
    }
    public String Getthreedobject(){
        return threedobject;
    }

    public void Setcolour(Colour cl){
        this.colour = cl;
    }
    public Colour Getcolour(){
        return colour;
    }

    public void Setdimention(int dm){
        this.dimention = dm;
    }
    public int Getdimention(){
        return dimention;
    }
}   
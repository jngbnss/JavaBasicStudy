package javaBasic.extends1.ex;

public class Album extends Item {
   private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}

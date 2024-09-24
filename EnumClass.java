enum Laptops{
    MacBooks(1000), ThinkPads(200), Surface(300), NotePads(500);

    private int price;

    private  Laptops(){
        price = 50;
    };

    private  Laptops(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    

}


public class EnumClass {
    public static void main(String[] args) {
        // Laptops[] laps = Laptops.values();

        
        for(Laptops laps : Laptops.values()){
            System.out.println("Laptops" + laps+ " : " + "$"+laps.getPrice());

        }
}
    
}

class callMethod{

    public void playMusic(){
        System.out.println("Play Music!");
    }

    public String check(int cost){
        if(cost>=10)return "Pen";
        return "Nothing";
    }
}


public class createMethod{
    public static void main(String[] args) {
        callMethod extra = new callMethod();
        extra.playMusic();
        String str = extra.check(9);
        System.out.println(str);
        
    }
}
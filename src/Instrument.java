public class Instrument {
    private String type;
    private int age;
    private String brand;
    public Instrument(String type, int age, String brand){
        this.type = type;
        this.age = age;
        this.brand = brand;
    }
    public void playSolo(){
        System.out.println("You play solo in front of the crowd. You stole the show!");
    }
    public void playAccompaniment(){
        System.out.println("You play with your friend as an accompanist. The crowd cheers!");
    }
    public void clean(){
        System.out.println("You give your instrument a good wipe down.");
    }
}

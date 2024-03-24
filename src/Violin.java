public class Violin extends Instrument{
    private int Strings;
    private int numOfFineTuners;

    public Violin(String type, int age, String brand, int Strings, int numOfFineTuners){
        super(type, age, brand);
        this.Strings = Strings;
        this.numOfFineTuners = numOfFineTuners;
    }
    public void tune(){
        System.out.println("You play with the pegs until the Strings are fully tuned.");
    }
}

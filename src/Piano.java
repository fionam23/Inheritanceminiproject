public class Piano extends Instrument {
    private int Octaves;
    public Piano(String type, int age, String brand, int Octaves){
        super(type, age, brand);
        this.Octaves = Octaves;
    }
    public void pedal(){
        System.out.println("Your foot is now on the pedal.");
    }
}

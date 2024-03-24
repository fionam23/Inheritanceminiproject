public class Main {
    public static void main(String[] args) {
        Violin myViolin = new Violin("String", 10, "Yamaha", 4, 1);
        Piano myPiano = new Piano("Percussion", 37, "Steinway", 7);
        myPiano.pedal();
        myViolin.tune();
        myPiano.playSolo();
        myViolin.playAccompaniment();
        myPiano.clean();

    }
}
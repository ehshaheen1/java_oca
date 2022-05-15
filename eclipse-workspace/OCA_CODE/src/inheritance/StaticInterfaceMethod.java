package inheritance;

public class StaticInterfaceMethod implements PlayingMusicInstruments{

    // static interface methods can be accessed only through the interface name

    public static void main(String[] args) {

    	StaticInterfaceMethod d = new StaticInterfaceMethod();
        d.playingDrums();
        d.playingKeyboard();
//        d.playingGuitar();      // does not compile

        PlayingMusicInstruments.playingGuitar();

    }
}



interface PlayingMusicInstruments {
    default void playingDrums () {System.out.println("Playing drums!");}
    default void playingKeyboard () {System.out.println("Playing keyboard!");}
    static void playingGuitar() {System.out.println("Playing guitar!");}
}

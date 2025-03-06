interface Playable {
    void play();
}

abstract class Guitar implements Playable {
    public void play() {
        System.out.println("playing Guitar");
    }
}

abstract class Piano implements Playable {
    public void play() {
        System.out.println("playing piano");
    }
}
class GuitarEx extends Guitar{
}
class PianoEx extends Piano{
}
public class Interface {
    public static void main(String[] args) {
        Playable p = new GuitarEx();
        Playable p1 = new PianoEx();
        p.play();
        p1.play();
    }
}

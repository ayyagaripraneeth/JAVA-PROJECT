interface Playable {
    void play();
}

class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}

class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}

class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing basketball");
    }
}

public class PlayableSports {
    public static void main(String[] args) {
        Playable[] games = {new Football(), new Volleyball(), new Basketball()};
        for (Playable game : games) {
            game.play();
        }
    }
}

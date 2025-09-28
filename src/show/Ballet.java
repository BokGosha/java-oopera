package show;

import person.Choreographer;
import person.Director;
import person.MusicAuthor;

public class Ballet extends MusicalShow {

    private final Choreographer choreographer;

    public Ballet(String title, int duration, Director director, String librettoText, MusicAuthor musicAuthor, Choreographer choreographer) {
        super(title, duration, director, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }
}

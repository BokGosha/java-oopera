package show;

import person.Director;
import person.MusicAuthor;

public class Opera extends MusicalShow {

    private final int choirSize;

    public Opera(String title, int duration, Director director, String librettoText, MusicAuthor musicAuthor, int choirSize) {
        super(title, duration, director, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }
}

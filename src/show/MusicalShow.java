package show;

import person.Director;
import person.MusicAuthor;

public class MusicalShow extends Show {

    private final MusicAuthor musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, String librettoText, MusicAuthor musicAuthor) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Вывод текста либретто!");

        System.out.println("Название спектакля: " + this.title);

        System.out.println(librettoText);
    }
}

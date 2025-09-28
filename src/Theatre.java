import person.*;
import show.Ballet;
import show.Opera;
import show.Show;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Брэд", "Питт", Gender.MALE, 180);
        Actor actor2 = new Actor("Леонардо", "ДиКаприо", Gender.MALE, 183);
        Actor actor3 = new Actor("Марго", "Робби", Gender.FEMALE, 168);

        Director director = new Director("Квентин", "Тарантино", Gender.MALE, 1);

        Choreographer choreographer = new Choreographer("Юрий", "Григорович", Gender.MALE);

        MusicAuthor musicAuthor = new MusicAuthor("Ханс", "Циммер", Gender.MALE);

        Show show = new Show("Снегопад", 130, director);
        Ballet ballet = new Ballet("Щелкунчик", 105, director, "В рождественскую ночь юная Мари получает в подарок странного Щелкунчика. В волшебном сне она видит, как игрушка оживает и ведёт борьбу с Мышиным королём. В финале Щелкунчик превращается в прекрасного принца, унося Мари в сказочное королевство сладостей.", musicAuthor, choreographer);
        Opera opera = new Opera("Снегурочка", 120, director, "В далёком царстве Берендеев, где зима длится полгода, живёт прекрасная девушка Снегурочка. Дочь Мороза и Весны, она не знает любви, но жаждет познать это чувство. Её судьба переплетается с судьбой простого пастуха Леля и купца Мизгиря, что приводит к трагическому финалу.", musicAuthor, 2);

        show.addActor(actor1);
        show.addActor(actor2);

        ballet.addActor(actor3);

        opera.addActor(actor1);

        show.printActors();
        ballet.printActors();
        opera.printActors();

        show.changeActor(actor3, "Питт");
        show.printActors();

        ballet.changeActor(actor2, "Питт");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}

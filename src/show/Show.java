package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {

    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void printDirector() {
        System.out.println("Вывод директора!");

        System.out.println(director);
    }

    public void printActors() {
        System.out.println("Вывод списка актёров!");

        System.out.println("Название спектакля: " + this.title);

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        System.out.println("Добавление актёра!");

        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)) {
                System.out.println("Этот актёр уже добавлен в спектакль");
                return;
            }
        }

        listOfActors.add(newActor);
    }

    public void changeActor(Actor newActor, String surname) {
        System.out.println("Замена актёра!");

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                actor.setName(newActor.getName());
                actor.setSurname(newActor.getSurname());
                actor.setGender(newActor.getGender());

                return;
            }
        }

        System.out.println("Такого актёра нет в спектакле");
    }
}

package show;

import person.Actor;
import person.Director;

import java.util.ArrayList;

public class Show {

    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirector() {
        System.out.println("Вывод директора!");

        System.out.println(director);
    }

    public void printActors() {
        System.out.println("Вывод списка актёров!");

        System.out.println("Название спектакля: " + title);

        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor newActor) {
        System.out.println("Добавление актёра!");

        if (isActorExist(newActor)) {
            System.out.println("Этот актёр уже добавлен в спектакль");
        } else {
            listOfActors.add(newActor);
        }
    }

    private boolean isActorExist(Actor newActor) {
        return listOfActors.contains(newActor);
    }

    public void changeActor(Actor newActor, String surname) {
        System.out.println("Замена актёра!");

        for (Actor actor : listOfActors) {
            if (actor.getSurname().equals(surname)) {
                setNewActor(actor, newActor);

                return;
            }
        }

        System.out.println("Такого актёра нет в спектакле");
    }

    private void setNewActor(Actor actor, Actor newActor) {
        actor.setName(newActor.getName());
        actor.setSurname(newActor.getSurname());
        actor.setGender(newActor.getGender());
    }
}

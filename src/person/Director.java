package person;

public class Director extends Person {

    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return "Директор: " +
                this.getName() + ' ' +
                this.getSurname() + ' ';
    }
}

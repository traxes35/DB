
package netflix;

public class actors {
        private int actors_id;
        private String name;
        private String surname;

    public actors(int actors_id, String name, String surname) {
        this.actors_id = actors_id;
        this.name = name;
        this.surname = surname;
    }

    public int getActors_id() {
        return actors_id;
    }

    public void setActors_id(int actors_id) {
        this.actors_id = actors_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}

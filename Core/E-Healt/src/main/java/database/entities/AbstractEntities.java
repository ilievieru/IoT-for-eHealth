package database.entities;

public class AbstractEntities {

    int id;

    public AbstractEntities(){
        System.out.println("Entity created");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

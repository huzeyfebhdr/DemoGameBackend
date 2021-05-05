package Entity;

public class Campaign {
    int id;
    String name;
    int oran;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOran() {
        return oran;
    }

    public void setOran(int oran) {
        this.oran = oran;
    }

    public Campaign(int id, String name, int oran) {
        this.id = id;
        this.name = name;
        this.oran = oran;
    }
}

package univ;

public class Course {

    private int id;
    private String name;
    private float hours;

    public Course(int id, String name, float hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public float getHours() {
        return hours;
    }
}

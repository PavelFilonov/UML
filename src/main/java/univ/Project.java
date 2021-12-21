package univ;

import java.util.Date;

public class Project {

    private String name;
    private Date start;
    private Date end;

    public Project(String name, Date start, Date end) {
        this.name = name;
        this.start = start;
        this.end = end;
    }

    public void start() {
        System.out.println("Starting project...");
    }

    public String getName() {
        return name;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}

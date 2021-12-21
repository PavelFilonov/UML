package univ;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String name;
    private List<Institute> institutes = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public void addInstitute(Institute institute) {
        institutes.add(institute);
    }

    public void removeInstituteByName(String name) {
        for (Institute institute: institutes) {
            if (institute.getName().equals(name)) {
                institutes.remove(institute);
                break;
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Institute> getInstitutes() {
        return List.copyOf(institutes);
    }

    @Override
    public String toString() {
        return "univ.Faculty{" +
                "name='" + name + '\'' +
                ", institutes=" + institutes +
                '}';
    }
}

package univ;

public class Participation {

    private int hours;
    private ResearchAssociate researchAssociate;
    private Project project;

    public Participation(int hours, ResearchAssociate researchAssociate, Project project) {
        this.hours = hours;
        this.researchAssociate = researchAssociate;
        this.project = project;
    }

    public int getHours() {
        return hours;
    }

    public ResearchAssociate getResearchAssociate() {
        return researchAssociate;
    }

    public Project getProject() {
        return project;
    }
}

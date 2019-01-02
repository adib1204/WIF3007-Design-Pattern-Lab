package l9;

public class Candidate {
    private final String NAME, CERTIFICATION, WORK_LOCATION;

    public Candidate(String NAME, String CERTIFICATION, String WORK_LOCATION) {
        this.NAME = NAME;
        this.CERTIFICATION = CERTIFICATION;
        this.WORK_LOCATION = WORK_LOCATION;
    }

    public String getNAME() {
        return NAME;
    }

    public String getCERTIFICATION() {
        return CERTIFICATION;
    }
    
    public String getWORK_LOCATION() {
        return WORK_LOCATION;
    }
}

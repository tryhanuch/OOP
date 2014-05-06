package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public abstract class SchoolClass {
    private String number;
    private ArrayList<Learner> learners;

    protected SchoolClass(String number, ArrayList<Learner> learners) {
        this.number = number;
        this.learners = learners;
    }

    public abstract int oLevel();

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Learner> getLearners() {
        return learners;
    }

    public void setLearners(ArrayList<Learner> learners) {
        this.learners = learners;
    }
}

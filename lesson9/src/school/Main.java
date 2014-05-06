package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Learner> learnersMath = new ArrayList<Learner>();
        learnersMath.add(new Learner("Kolia", new int[]{5, 5, 5}, new int[]{5, 5, 5}, new int[]{5, 5, 5}));
        learnersMath.add(new Learner("Kolia", new int[]{5, 5, 5}, new int[]{5, 5, 5}, new int[]{5, 5, 5}));
        learnersMath.add(new Learner("Kolia", new int[]{5, 5, 5}, new int[]{5, 5, 5}, new int[]{5, 5, 5}));

        ArrayList<Learner> learnersMusic = new ArrayList<Learner>();
        learnersMusic.add(new Learner("Kolia", new int[]{15, 15, 15}, new int[]{15, 15, 15}, new int[]{15, 15, 15}));
        learnersMusic.add(new Learner("Kolia", new int[]{15, 15, 15}, new int[]{15, 15, 15}, new int[]{15, 15, 15}));
        learnersMusic.add(new Learner("Kolia", new int[]{15, 15, 15}, new int[]{15, 15, 15}, new int[]{15, 15, 15}));

        ArrayList<Learner> learnersHistory = new ArrayList<Learner>();
        learnersHistory.add(new Learner("Kolia", new int[]{30, 30, 30}, new int[]{30, 30, 30}, new int[]{30, 30, 30}));
        learnersHistory.add(new Learner("Kolia", new int[]{30, 30, 30}, new int[]{30, 30, 30}, new int[]{30, 30, 30}));
        learnersHistory.add(new Learner("Kolia", new int[]{30, 30, 30}, new int[]{30, 30, 30}, new int[]{30, 30, 30}));

        SchoolClass sc0 = new MathematicalClass("11-B", learnersMath);
        SchoolClass sc1 = new MusicClass("11-A", learnersMusic);
        SchoolClass sc2 = new HistoricalClass("11-D", learnersHistory);

        ArrayList<SchoolClass> schoolClasses = new ArrayList<SchoolClass>();
        schoolClasses.add(sc0);
        schoolClasses.add(sc1);
        schoolClasses.add(sc2);

        School school = new School("Liceum", schoolClasses);
        school.schoolOlevel();

    }
}

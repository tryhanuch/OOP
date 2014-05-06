package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public class MusicClass extends SchoolClass {
    protected MusicClass(String number, ArrayList<Learner> learners) {
        super(number, learners);
    }

    @Override
    public int oLevel() {
        int result = 0;
        for (int i = 0; i < getLearners().size(); i++) {
            for (int j = 0; j < getLearners().get(i).getMusicMarks().length; j++) {
                result += getLearners().get(i).getMusicMarks()[j];
            }
            result = result / getLearners().get(i).getMusicMarks().length;
        }
        result = result / getLearners().size();
        System.out.println("Средняя успеваемость в музыкальном классе -"+result+" балл(ов).");
        return result;
    }
}

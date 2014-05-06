package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public class MathematicalClass extends SchoolClass {
    protected MathematicalClass(String number, ArrayList<Learner> learners) {
        super(number, learners);
    }

    @Override
    public int oLevel() {
        int result = 0;
        for (int i = 0; i < getLearners().size(); i++) {
            for (int j = 0; j < getLearners().get(i).getMathematicsMarks().length; j++) {
                result += getLearners().get(i).getMathematicsMarks()[j];
            }
            result = result / getLearners().get(i).getMathematicsMarks().length;
        }
        result = result / getLearners().size();
        System.out.println("Средняя успеваемость в математическом классе -"+result+" балл(ов).");
        return result;
    }
}

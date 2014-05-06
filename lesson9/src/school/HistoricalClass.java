package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public class HistoricalClass extends SchoolClass {
    protected HistoricalClass(String number, ArrayList<Learner> learners) {
        super(number, learners);
    }

    @Override
    public int oLevel() {
        int result = 0;
        for (int i = 0; i < getLearners().size(); i++) {
            for (int j = 0; j < getLearners().get(i).getHistoryMarks().length; j++) {
                result += getLearners().get(i).getHistoryMarks()[j];
            }
            result = result / getLearners().get(i).getHistoryMarks().length;
        }
        result = result / getLearners().size();
        System.out.println("Средняя успеваемость в историческом классе -"+result+" балл(ов).");
        return result;
    }
}

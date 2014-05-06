package school;

import java.util.ArrayList;

/**
 * Created by tish on 01.03.14.
 */
public class Learner {
    private String firstName;
//    private String secondName;
//    private int age;
    private int[] historyMarks;
    private int[] musicMarks;
    private int[] mathematicsMarks;

    public Learner(String firstName,
                   int[] historyMarks, int[] musicMarks, int[] mathematicsMarks) {
        this.firstName = firstName;
//        this.secondName = secondName;
//        this.age = age;
        this.historyMarks = historyMarks;
        this.musicMarks = musicMarks;
        this.mathematicsMarks = mathematicsMarks;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    public String getSecondName() {
//        return secondName;
//    }
//
//    public void setSecondName(String secondName) {
//        this.secondName = secondName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public int[] getHistoryMarks() {
        return historyMarks;
    }

    public void setHistoryMarks(int[] historyMarks) {
        this.historyMarks = historyMarks;
    }

    public int[] getMusicMarks() {
        return musicMarks;
    }

    public void setMusicMarks(int[] musicMarks) {
        this.musicMarks = musicMarks;
    }

    public int[] getMathematicsMarks() {
        return mathematicsMarks;
    }

    public void setMathematicsMarks(int[] mathematicsMarks) {
        this.mathematicsMarks = mathematicsMarks;
    }
}

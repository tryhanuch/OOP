package company;

/**
 * Created by tish on 08.02.14.
 */
public class Admin extends User {
    int beardLength;
    String beer;
    String admOS;

    public Admin(String firstName, String lastName, int age, int salary, int beardLength, String beer, String admOS) {
        super(firstName, lastName, age, salary);
        this.beardLength = beardLength;
        this.beer = beer;
        this.admOS = admOS;
    }

    public int getBeardLength() {
        return beardLength;
    }

    public void setBeardLength(int beardLength) {
        this.beardLength = beardLength;
    }

    public String getBeer() {
        return beer;
    }

    public void setBeer(String beer) {
        this.beer = beer;
    }

    public String getAdmOS() {
        return admOS;
    }

    public void setAdmOS(String admOS) {
        this.admOS = admOS;
    }
}

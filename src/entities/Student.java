package entities;

public class Student {
    public String name;
    public double n1;
    public double n2;
    public double n3;

    public double grades() {
        return this.n1 + this.n2 + this.n3;
    }

    public String finalGrade() {
        return "FINAL GRADE = " + grades();
    }

    public double missPoints() {
        return 80.00 - grades();
    }

    public String passOrNot() {

        finalGrade();

        if (grades() >= 80.00) {
            return "PASS";
        } else {
            return "FAILED"
                    + " MISSING "
                    + missPoints()
                    + " POINTS";
        }
    }
}

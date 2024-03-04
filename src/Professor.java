public class Professor extends DeptEmployee{
    int numberOfPublications;

    public Professor(String name, double salary, int aYear, int aMonth, int aDay) {
        super(name, salary, aYear, aMonth, aDay);
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}

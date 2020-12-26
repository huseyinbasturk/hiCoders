package jam101.week05.schoolRegistration;

public class ThirdGrade extends School {
    static int counter;
    public ThirdGrade(int age) {
        this.age = age;
    }

    {
        this.counter++;
        super.totalSize++;
    }
}

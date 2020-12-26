package jam101.week05.schoolRegistration;

public class SecondGrade extends School {
    static int counter;
    public SecondGrade(int age) {
        this.age = age;
    }

    {   this.counter++;
        super.totalSize++;
    }
}

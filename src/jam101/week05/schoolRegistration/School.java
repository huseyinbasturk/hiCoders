package jam101.week05.schoolRegistration;

public abstract class School {
    String name;
    String lastName;
    int age;
    String schoolNumber;
    static int totalSize;

    /*
    School classibi abstract yaparak kullanicinin burda object uretmesini engellemek istedim,
    uretilen objeler her sinifin kendi clasinda olacak ve buradaki fieldler inherit edilerek, code duplication i azaltmaya calistim,
    sub classlar bu program icin counter disinda baska bir fonksiyon ifa etmiyor, ama sablon olarak boyle bir yapi olusturulabilir,
    yani her sinifin kenidne ozgu fieldlari olusturulabilir..
   */
    public String generateSchoolNumber() {
       //string manipulation ile okul numarasini olusturur
       schoolNumber = name.substring(0,2).toUpperCase() + lastName.substring(lastName.length()-3).toUpperCase() + age;
       return schoolNumber;
    }


    public String display() {
        //kayit gorunumu
        return schoolNumber + ", " + name.substring(0,1).toUpperCase()+name.substring(1) + " " + lastName.toUpperCase() +" -> " + getClass().getSimpleName();

    }
}

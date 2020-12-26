package jam101.week05.schoolRegistration;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<School> schoolList = new ArrayList<>();

    public static void main(String[] args) {
        //okul kapasitesi 10, kapasite dolana kadar kayit yapacak
        while (School.totalSize< 10) {
            register(init());
        }
        System.out.println("The school reached the full capacity");
        printAllSchool();

    }

    public static int init() {
        System.out.print("Please enter the age: ");
        int age = sc.nextInt();
        sc.nextLine();
        if(age >= 6 && age <=10) {
            if (capacityCheck(age))
                return age;
            else return -1;
        } else {
            System.out.println("Oo..oo...You are in the wrong school.");
            return 0;
        }
    }

    //girilen yas araliginda siniflarda yer olup olmadigini kontrol ediyor,
    public static boolean capacityCheck(int age) {
        boolean flag = false;
        switch(age) {
            case 6:
                if(FirstGrade.counter < 2)
                    flag = true;
                break;
            case 7:
                if(SecondGrade.counter < 2)
                    flag = true;
                break;
            case 8:
                if(ThirdGrade.counter < 2)
                    flag = true;
                break;
            case 9:
                if(FourthGrade.counter < 2)
                    flag = true;
                break;
            case 10:
                if(FifthGrade.counter < 2)
                    flag = true;
                break;

        }

        return flag;
    }

    public static void register(int age) {
    //capacity check true dondururse kayit islemi buradan devam edecek, objeler subclasslarda olusacak
        switch(age) {
            case 6:
                School firstGradeStudent = new FirstGrade(age);
                enterStudentDetails(firstGradeStudent);
                break;
            case 7:
                School secondGradeStudent = new SecondGrade(age);
                enterStudentDetails(secondGradeStudent);
                break;
            case 8:
                School thirdGradeStudent = new ThirdGrade(age);
                enterStudentDetails(thirdGradeStudent);
                break;
            case 9:
                School fourthGradeStudent = new FourthGrade(age);
                enterStudentDetails(fourthGradeStudent);
                break;
            case 10:
                School fifthGradeStudent = new FifthGrade(age);
                enterStudentDetails(fifthGradeStudent);
                break;
            case -1:
                System.out.println("Ooops..Sorry.. There is no available seat for the student..");
                break;

        }
    }

    public static void enterStudentDetails (School student){
    //yas ile obje olusturduktan sonra ogrenci bilgileri buradan giriliyor, okul numarasi olusturup,
    //kayit durumunu kontrol ediyor,okul listesine ekliyoruz,
        System.out.print("Please enter the name: ");
        student.name = sc.nextLine();
        System.out.print("Please enter the last name: ");
        student.lastName = sc.nextLine();
        student.generateSchoolNumber();
        checkStatus(student);
        schoolList.add(student);
    }

    public static void checkStatus(School student) {
        System.out.println(student.display());
        System.out.println("Registration is completed");

    }

    public static void printAllSchool() {
    //ekstradan ekledigim bir metot, programin sonunda tum okul listesini gosterecek
        System.out.println("===========================");
        for(School student : schoolList) {
            System.out.println("Full name: " + student.name + " " + student.lastName + ", age: " + student.age +
                    ", school number: " + student.schoolNumber + ", class: " + student.getClass().getSimpleName());
        }
    }
    /*
    burada yapmadigim ama yapilmasi gereken bir baska husus, arka arkaya pek cok veri giriliyor,
    yasi girerken isim girdigimizde hata verip program sonlanir, try- catch icinde yazmak gerekir,
    fakat bu odevde istenen bu kadar oldugunu dusunuyorum
    sonraki odevlerde artik :)
    */

}
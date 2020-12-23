package jam101.week05;

import java.security.SecureRandom;

public class StringOperations {
    public static void main(String[] args) {
        questionOne("asik veysel");
        questionOne("El alem ala dana aldı ala danalandı da biz bir ala dana alıp da ala danalanamadık.");
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
    }

    public static void questionOne(String str) {
        String[] arr = str.split(" ");
        String lastVersion="";
        for(int i=0; i<arr.length;i++) {
            lastVersion += arr[i].substring(0,1).toUpperCase() + arr[i].substring(1) + " ";

        }
        System.out.println(lastVersion);

    }

    public static void questionTwo() {
        int counter = 0;
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0; j < 10 ; j++) {
                System.out.print (counter);
                if(!(j ==9)) {              //her satirin sonunda virgul olmayacak
                    System.out.print(", ");
                }counter++;
            }

            System.out.println ();
        }

    }
    public static void questionThree() {
        String  primeNumbers = "";

        for (int i = 0; i < 100; i++) {
            int counter=0;
            for(int j =i; j>=1; j--) {
                if(i%j==0) {
                    counter = counter + 1;
                }
            }
            if (counter ==2) {
                primeNumbers = primeNumbers + i + ", ";
            }
        }

        if(primeNumbers.length() > 0) {
            primeNumbers = primeNumbers.substring(0, primeNumbers.length() - 2); //sondaki virgulu silmek icin
        }
        System.out.println("Prime numbers between 0-100: " + primeNumbers);


    }
    public static void questionFour() {
        //yorum icnindeki kismi netten arastirip buraya uyarladim, ASCII tablosu kullaniliyor
        //diger yolda ise password havuzu oluturup, oradan rastgele karakter secerek password olusturdum, karakterler artirilabilir
        final String passwordPool= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvyz0123456789!$%&*?.,/|";

        SecureRandom sr = new SecureRandom();
        for(int i=1; i<=50; i++) {
            int passwordLength = (int) (Math.random() * (16 - 8)) + 8;

           /* System.out.println("Password number " + i + ": " + sr.ints(passwordLength, 33, 122).collect(StringBuilder::new,
                    StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString());*/
           String password = "";
           for(int j=0; j<passwordLength; j++) {

               int randomChar = (int) (Math.random() * (passwordPool.length() - passwordLength) ) + passwordLength;
               password += passwordPool.charAt(randomChar);
           }
           System.out.println("password number " + i + ": " + password);

        }



    }
    public static void questionFive() {
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < i; ++j) {
                System.out.print ("*");
            }
            System.out.println ();
        }

    }
}

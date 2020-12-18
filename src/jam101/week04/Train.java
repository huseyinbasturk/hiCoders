package jam101.week04;

import java.util.Scanner;

class Train {
    int suspectedWagon;
    int guess;
    int n=0;

    Scanner sc = new Scanner(System.in);

    //constructor in icinde suphelinin girdigi vagon belirleniyor.
    public Train() {
        suspectedWagon = (int)(Math.random() * 9)+1;
    }
    {
        System.out.println("Alert... There is a suspected in the train. Find him...");
    }

    //treni kontrol etmeye basliyoruz
    public void checkTrain() {
    //4 tahmin yapma hakki var, tahmin dogru olursa loop tan cikacak ve sonucu yazdiracak
        while (n < 4) {
            System.out.println("Enter your guess..");
            guess = sc.nextInt();
            if (suspectedWagon == guess) {
                System.out.println("\nCongratulations. You are right!!!-->> " + guess);
                printResult();
                break;
            } else if (suspectedWagon < guess)
                System.out.println("Sorry :( -> You should search him in front!");
            else
                System.out.println("Sorry :( -> You should search him in back!");
            n++;
        }

    //4 tahmin de basarisiz olursa supheliyi elinden kacirdiginin mesaji konsola yazdirilacak
        if(n==4) {
            System.out.println("Oo oo... You didn't catch him. " +
                    "\n You deserve a big ZERO(0) point.");
        }
    }

    public void printResult() {
        System.out.println("You got in " +(n + 1) + " shot(s)!");
        System.out.println("Your score is: "+(100-(n*25)));

    }
}

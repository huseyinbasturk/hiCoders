package jam101.week02.kisi;

import java.util.*;

public class Ogrenci {
    Scanner sc = new Scanner(System.in);

    private String name;
    private int mathScore;
    private int deutschScore;
    private double ortalama;

    public Ogrenci(String name) {
        this.name = name;
    }

    public double getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(double ortalama) {
        this.ortalama = ortalama;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        if (checkScore(mathScore)) {
            this.mathScore = checkedScore;
        }

    }
    public int getDeutschScore () {
        return deutschScore;
    }

    public void setDeutschScore (int deutschScore){
        if (checkScore(deutschScore)) {
            this.deutschScore = checkedScore;
        }

    }

    int checkedScore;
        public boolean checkScore ( int score){
           while (score < 0 || score > 6) {
               System.out.println("Girilen not 0 ile 6 arasinda olmalidir.");
               System.out.print("Lutfen tekrar giriniz: ");
               score = sc.nextInt();
               sc.nextLine();
            }

           checkedScore = score;
           return true;
        }
    }

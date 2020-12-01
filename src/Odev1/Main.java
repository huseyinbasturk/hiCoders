package Odev1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> hayvanlar = new ArrayList<>();
        hayvanlar.add("Tavuk");
        hayvanlar.add("Inek");
        hayvanlar.add("Keci");
        hayvanlar.add("Balik");

        Map<String,Integer> ciftlik = new HashMap<>();

        for (int i=0; i<hayvanlar.size();i++){
            System.out.print("Lutfen " + hayvanlar.get(i) + " sayisini giriniz = ");
            int sayi = sc.nextInt();
            ciftlik.put(hayvanlar.get(i),sayi);
            sc.nextLine();

        }
        System.out.println("Ciftlikte bulunan hayvan sayisi: " + Ciftlik.toplamHayvan(ciftlik));
        System.out.println("Toplam bacak sayisi: " + Ciftlik.toplamBacak(ciftlik));

    }

}

class Ciftlik {

    public static int toplamHayvan(Map<String,Integer> hayvanlar){
        int hayvanSayisi = 0;
        for(Integer value : hayvanlar.values()){
            hayvanSayisi = hayvanSayisi + value;
        }
        return hayvanSayisi;
    }

    public static int toplamBacak(Map<String,Integer> hayvanlar){
        int bacakSayisi = 0;

        for(String key : hayvanlar.keySet()){
            switch(key){
                case "Tavuk":
                    bacakSayisi = bacakSayisi + hayvanlar.get(key)*2;
                    break;
                case "Inek" : case "Keci" :
                    bacakSayisi = bacakSayisi + hayvanlar.get(key)*4;
                    break;
                case "Balik" :
                    bacakSayisi = bacakSayisi + hayvanlar.get(key)*0;

            }

        }
        return bacakSayisi;
    }
}

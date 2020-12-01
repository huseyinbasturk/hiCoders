package jam101.week01.ciftci;

import jam101.week01.ciftlik.*;

import java.util.ArrayList;
import java.util.List;

public class Ciftci {

    public static void main(String[] args) {

        List<Object> tumTavuklar = new ArrayList<>();
        Tavuk t1 = new Tavuk("Kara");
        Tavuk t2 = new Tavuk();
        tumTavuklar.add(t1);
        tumTavuklar.add(t2);

        List<Object> tumInekler = new ArrayList<>();
        Inek i1 = new Inek("Sari Benek");
        Inek i2 = new Inek();
        Inek i3 = new Inek("Alaca");
        tumInekler.add(i1);
        tumInekler.add(i2);
        tumInekler.add(i3);

        System.out.println("Ciftlikte bulunan toplam inek sayisi: " + Inek.toplamSayi);
        System.out.println("Ciftlikte bulunan toplam tavuk sayisi: " + Tavuk.toplamSayi);
        /*
        for(Object inek : tumInekler) {
           System.out.println(inek.toString());
        }
        for(Object tavuk : tumTavuklar){
            System.out.println(tavuk.toString());
        }

        System.out.println("===================");
        */
        System.out.println(tumTavuklar.toString());
        System.out.println(tumInekler.toString());


    }
}

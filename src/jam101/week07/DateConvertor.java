package jam101.week07;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateConvertor {

    static Scanner sc = new Scanner(System.in);
    String inputFormat;

    //obje olusturup, programi calistiriyoruz
    public static void main(String[] args) {
        DateConvertor dc = new DateConvertor();
        dc.init();

    }

    //kullanicidan saat bilgisini girmesini istiyoruz
    public void init() {
        System.out.println("Please enter the time:");
        inputFormat = sc.nextLine();
        convertTo24Hour(inputFormat);

    }

    //girilen formati istenen formata donusturuyo
    public void convertTo24Hour(String time) {
        DateFormat firstFormat = new SimpleDateFormat("hh:mm aa");
        Date date = null;
        try {
            date = firstFormat.parse(time.substring(0,time.length()-2).concat(time.substring(time.length()-2).toUpperCase())); //kucuk harfle am/pm yazilsa da programin calismasi icin bu satir yazildi
        } catch (ParseException e) {
            checkFormat(); // girilen format uygun degilse onu kontrol edip, kullanicidan tekrar girmesini istiyor
        }
        DateFormat lastFormat = new SimpleDateFormat("HH:mm");
        String outputFormat = lastFormat.format(date);

        System.out.println(outputFormat);
    }

    //kullanicinin yapacagi hatadan dolayi programin calismasi sekteye ugramamsi icin bu metot olusturldu
    public void checkFormat() {

            System.out.println("Your input should be like --- >>> hh:mm AM/PM\n"+
            "Please enter again:");
            inputFormat = sc.nextLine();
            convertTo24Hour(inputFormat);

    }


}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yil;
        System.out.println("Yıl giriniz:");
        yil= scanner.nextInt();
        if(yil%4==0 && yil%100!=0){
            System.out.println(yil+" "+"Artık yıldır.");
        }else if(yil%100==0 && yil%400!=0){
            System.out.println("Artık yıl değilidir");
        }else  System.out.println("Artık yıl değilidir");
    }
}
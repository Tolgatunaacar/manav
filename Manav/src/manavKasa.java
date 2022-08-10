import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kilo armut:");
        double armut = input.nextDouble();

        System.out.println("Kaç kilo elma:");
        double elma = input.nextDouble();

        System.out.println("Kaç kilo muz");
        double muz = input.nextDouble();

        System.out.println("Kaç kilo domates");
        double domates = input.nextDouble();

        System.out.println("Kaç kilo patlıcan:");
        double patlican = input.nextDouble();

        double ucret = ((armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0));

        System.out.println("Toplam ücret:"+ucret);
    }
}

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Uzun kenari girin: ");
        double uzunKenar = scanner.nextDouble();
        System.out.print("Kisa kenari girin: ");
        double kisaKenar = scanner.nextDouble();
        double alan = area(uzunKenar, kisaKenar);
        if (alan == -1) {
            System.out.println("Pozitif sayi girmelisin.");
        } else {
            System.out.println("Alan: " + alan);
        }

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Yaricapi girin: ");
        double radius = scanner.nextDouble();
        double alan1 = area1(radius);
        if (alan1 == -1) {
            System.out.println("Pozitif sayi girmelisin.");
        } else {
            System.out.println("Alan: " + alan1);
        }
    }
    public static boolean shouldWakeUp(boolean barking, int hour) {
        if (hour < 0 || hour > 23) {
            return false;
        }
        if (barking && (hour > 20 || hour < 8)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        if (age1 >= 13 && age1 <= 19 || age2 >= 13 && age2 <= 19 || age3 >= 13 && age3 <= 19) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean summer, int celsius) {
        if(summer && (celsius >= 35 && celsius <= 45)) {
            return true;
        }
        if(celsius >= 25 && celsius <= 35) {
            return true;
        }
        else {
            return false;
        }
    }
        public static double area(double uzunKenar, double kisaKenar) {
            if (uzunKenar < 0 || kisaKenar < 0) {
                return -1;
            }
            return uzunKenar * kisaKenar;
        }

        public static double area1(double radius) {
        if(radius < 0) {
            return -1;
        }
        return radius*radius*Math.PI;
        }
}

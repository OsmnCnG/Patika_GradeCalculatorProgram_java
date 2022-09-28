import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        int math, music, physic, history, turkish, chemistry;

    Scanner input = new Scanner(System.in);

        System.out.print("Enter the grade for math:");
        math = input.nextInt();
        System.out.print("Enter the grade for music:");
        music = input.nextInt();
        System.out.print("Enter the grade for physic:");
        physic = input.nextInt();
        System.out.print("Enter the grade for history:");
        history = input.nextInt();
        System.out.print("Enter the grade for turkish:");
        turkish = input.nextInt();
        System.out.print("Enter the grade for chemistry:");
        chemistry = input.nextInt();

        double average;
        average = (math + music + physic + history + turkish +chemistry)/6;
        System.out.println("Not ortalamanız:");
        System.out.println("Ortalamanız: " + average);

        boolean sonuc = (average >= 60);

        String str = sonuc ? "Sınıfı geçti." : "Sınıfta kaldı.";
        System.out.println(str);





    }







}

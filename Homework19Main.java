import java.util.Scanner;

public class Homework19Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Homework19Zada4a1 zad1 = new Homework19Zada4a1();
        Homework19Zada4a2 zad2 = new Homework19Zada4a2();
        Homework19Zada4a3 zad3 = new Homework19Zada4a3();
        do {
            System.out.println("Input number to start task №: ");
            System.out.print("\t1.Zad.1 "+" \t2.Zad.2 "+"\t3.Zas.3 "+"\t4.Exit\n");
            Integer chois = reader.nextInt();
            if (chois == 1) {
                zad1.printZad1();
            } else if (chois == 2) {
                zad2.printZad2();
            } else if (chois == 3) {
                zad3.printZad3();
            } else if (chois == 4){
                System.out.println("GoodByu!");
            break;
            } else {
                System.out.println("Input 1,2,3 or4!");
                continue;
            }
        } while (true);
    }
}

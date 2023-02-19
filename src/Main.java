//vjezba 14:
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double operand1 = scanner.nextInt();

        System.out.println("Unesite drugi broj: ");
        double operand2 = scanner.nextInt();

        if ((operand1%operand2)==0) {
            System.out.println("Nema ostatka");
        } else if ((operand1%operand2)>1000) {
            System.out.println("Ostatak je veci od 1000");
        } else if ((operand1%operand2)<1000) {
            System.out.println("Ostatak je manji od 1000 ");
        }else {
            System.out.println("Greska pri unosu");
        }

    }
}


//vjezba 15:
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t="Ford";
        System.out.println("Unesite marku auta: ");
        String cm = scanner.nextLine();
        if (cm.equals(t))
        {
            System.out.println("Unesite broj vrata: ");
            int operand2 = scanner.nextInt();
            if (operand2==2){
                System.out.println("Auto ima 2 vrata!");}
            else if (operand2==3){
                System.out.println("Auto ima 3 vrata!");}
            else if (operand2==4){
                System.out.println("Auto ima 4 vrata!");}
            else if (operand2==5){
                System.out.println("Auto ima 5 vrata!");}
            else{
                System.out.println("Pogresan unos broja vrata!");}
        }
        else {
            System.out.println("Auto nije Ford");}
    }
}

*/
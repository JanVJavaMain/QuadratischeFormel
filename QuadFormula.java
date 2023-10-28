import java.util.Scanner;

// f(x) = ax^2 + bx + c
// (x+2)*(x+2) --> x^2 + 4x + 4;
// (x-2)*(x+3) --> x^2 + x - 6;
// 2x^2 + 3x + 4 --> -3/4 +/- i (sqrt(23))/4;

public class QuadFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("The quadratic formula finds the root(s)\n" + 
        "where f(x) = 0 for the function f(x) = ax^2 + bx + c\n");

        System.out.print("a: ");
        a = sc.nextDouble();
        System.out.print("b: ");
        b = sc.nextDouble();
        System.out.print("c: ");
        c = sc.nextDouble();

        // sqrt(b^2 - 4ac) = D
        double diskriminante;
        diskriminante = b*b - 4*a*c;

        double wurzel1, wurzel2;
        double imag;

            // Modifizieren der Ausgabe abhaengig von Diskriminante
        if  (diskriminante > 0) {
            wurzel1 = (-b + Math.sqrt(diskriminante)/(2*a));
            wurzel2 = (-b - Math.sqrt(diskriminante)/(2*a));
            System.out.println("Zwei reele Wurzeln: " + wurzel1 + " und " + wurzel2);
        } else if (diskriminante < 0){
            imag = Math.sqrt(-diskriminante) / (2*a);
            System.out.println("Zwei imaginaere Wurzeln: " + (-b/(2*a)) + " +/- i" + imag);
        } else {
            wurzel1 = -b/(2*a);
            System.out.println("Eine Wurzel: " + wurzel1);
        }
    }
}
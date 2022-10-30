package tp2.numbersManager.tests;

import tp2.numbersManager.model.Complex;
import tp2.numbersManager.service.ServiceComplex;

import java.util.Scanner;

public class Tests {

    private static void showServiceComplexMenu() {
        String menu = """

				  === --------------------------------------------------- ===
				  === Welcome to Complex numbers Service ===
				  === --------------------------------------------------- ===
				  ===> tape 1 for Complex addition service
				  ===> tape 2 for Complex substaction service
				  ===> tape 3 for Complex multiplication service
				  ===> tape 4 for Complex division service
				  ===> tape 5 for Complex module service
				  ===> tape 6 for Complex conjugate service
				  ===> tape 7 for Complex reciprocal service
				  ===> tape 8 to exit the program
				  === --------------------------------------------------- ===
				""";

        System.out.println(menu);
        System.out.print("  > Enter you choice : ");

    }

    public static Complex complexBuilder(Scanner clavier, String name) {
        System.out.println("Complex "+name+ ":  (re , im) : ");
        System.out.println("Enter "+name+ ".re : ");
        double re1 = clavier.nextDouble();
        System.out.println("Enter "+name+  ".im : ");
        double im1 = clavier.nextDouble();
        Complex z1 = new Complex(re1, im1);

        return z1;
    }
    public static void testServiceComplex(Scanner clavier) {

        String response = "";
        do {
            showServiceComplexMenu();
            int choix = clavier.nextInt();


            switch (choix) {
                case 1 -> {
                    Complex z1 = complexBuilder(clavier, "z1");
                    Complex z2 = complexBuilder(clavier, "z2");
                    Complex z = ServiceComplex.plus(z1, z2);
                    System.out.println("z1 : " +  z1);
                    System.out.println("z2 : " +  z2);
                    System.out.println("z : z1 + z2 : " +  z);
                }
                case 2 -> {
                    Complex z1 = complexBuilder(clavier, "z1");
                    Complex z2 = complexBuilder(clavier, "z2");
                    Complex z = ServiceComplex.mines(z1, z2);
                    System.out.println("z1 : " +  z1);
                    System.out.println("z2 : " +  z2);
                    System.out.println("z : z1 - z2 : " +  z);
                }
                case 3 -> {
                    Complex z1 = complexBuilder(clavier, "z1");
                    Complex z2 = complexBuilder(clavier, "z2");
                    Complex z = ServiceComplex.times(z1, z2);
                    System.out.println("z1 : " +  z1);
                    System.out.println("z2 : " +  z2);
                    System.out.println("z : z1 * z2 : " +  z);
                }
                case 4 -> {
                    Complex z1 = complexBuilder(clavier, "z1");
                    Complex z2 = complexBuilder(clavier, "z2");
                    Complex z = ServiceComplex.divides(z1, z2);
                    System.out.println("z1 : " +  z1);
                    System.out.println("z2 : " +  z2);
                    System.out.println("z : z1 / z2 : " +  z);
                }
                case 5 -> {
                    Complex z = complexBuilder(clavier, "z");
                    double module  = ServiceComplex.module(z);
                    System.out.println("z : " +  z);
                    System.out.println("|z| =  " +  module);
                }
                case 6 -> {
                    Complex z = complexBuilder(clavier, "z");
                    Complex zB = ServiceComplex.conjugate(z);
                    System.out.println("z : " +  z);
                    System.out.println("Conjugate(z)  =  " +  zB);

                }
                case 7 -> {
                    Complex z = complexBuilder(clavier, "z");
                    Complex zR = ServiceComplex.reciprocal(z);
                    System.out.println("z : " +  z);
                    System.out.println("zR = 1/z  =  " +  zR);
                }
                case 8 -> {
                    System.out.println("""
					   ------------------
					| GoodBye ^_^  |
					   ------------------
					""".indent(5));

                    System.exit(0);
                }
                default -> {
                    System.err.println("Bad choice !!!!!!");
                }
            };
            System.out.print("  > Do you want to do an other operation (y/n) : ");
            response = clavier.next();

        }while(response.equalsIgnoreCase("y"));



    }


    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        testServiceComplex(clavier);

        clavier.close();

    }

}

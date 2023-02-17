import java.util.Scanner;

class Fraction{
    public int numerator_1, denominator_1;

    public Fraction(){
        numerator_1 = 1;
        denominator_1 = 1;
    }
    
    public Fraction(int numerator, int denominator) {
        if (denominator != 0) {
            numerator_1 = numerator;
            denominator_1 = denominator;
        } else {
            System.out.println("denominator is zero");
        }
    }
    
    public void printFraction(){
        System.out.println(numerator_1 + "/" + denominator_1);
    }
    
    
    public void sum(int numerator, int denominator, int numerator2, int denominator2) {
        System.out.println("Результат: " + (numerator * denominator2 + denominator * numerator2) + "/" + denominator * denominator2);
    }
    
    
    public void substraction(int numerator, int denominator, int numerator2, int denominator2) {System.out.println("Результат: " + (numerator * denominator2 - denominator * numerator2) + "/" + denominator * denominator2);}
    
    
    public void multiplication(int numerator, int denominator, int numerator2, int denominator2) {
        System.out.println("Результат: " + (numerator * numerator2) + "/" + denominator * denominator2);
    }
    
    
    public void division(int numerator, int denominator, int numerator2, int denominator2) {
        System.out.println("Результат: " + (numerator * denominator2) + "/" + numerator2 * denominator);
    }

}

public class lab5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Дробь по умолчанию: ");
        Fraction fraction1 = new Fraction();
        fraction1.printFraction();


        System.out.println("Введите целые значения числителя и знаменателя: ");
        Fraction fraction2 = new Fraction(in.nextInt(), in.nextInt());
        fraction2.printFraction();


        System.out.println("Сложение. Введите целые значения числителя и знаменателя первой дроби: ");
        Fraction fraction3 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби: ");
        Fraction fraction4 = new Fraction(in.nextInt(), in.nextInt());
        fraction3.sum(fraction3.numerator_1, fraction3.denominator_1, fraction4.numerator_1, fraction4.denominator_1);


        System.out.println("Вычитание. Введите целые значения числителя и знаменателя первой дроби: ");
        Fraction fraction5 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби: ");
        Fraction fraction6 = new Fraction(in.nextInt(), in.nextInt());
        fraction5.substraction(fraction5.numerator_1, fraction5.denominator_1, fraction6.numerator_1, fraction6.denominator_1);

        
        System.out.println("Умножение. Введите целые значения числителя и знаменателя первой дроби: ");
        Fraction fraction7 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби: ");
        Fraction fraction8 = new Fraction(in.nextInt(), in.nextInt());
        fraction7.multiplication(fraction7.numerator_1, fraction7.denominator_1, fraction8.numerator_1, fraction8.denominator_1);

        System.out.println("Деление. Введите целые значения числителя и знаменателя первой дроби: ");
        Fraction fraction9 = new Fraction(in.nextInt(), in.nextInt());
        System.out.println("Введите целые значения числителя и знаменателя второй дроби: ");
        Fraction fraction10 = new Fraction(in.nextInt(), in.nextInt());
        fraction10.multiplication(fraction10.numerator_1, fraction10.denominator_1, fraction10.numerator_1, fraction10.denominator_1);

        in.close();
    }
}



import java.util.Scanner;

public class TaxCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        System.out.println("java calculates "+salary);
        int tax_amount = 0;
        if (salary <= 50000){
            tax_amount = 0;
        }
        if (salary > 50000 && salary <= 60000){
            tax_amount = (salary - 50000) * 10/100;
        }
        if (salary > 60000 && salary <= 150000){
            tax_amount = (salary - 50000) * 20/100;
        }
        if (salary > 150000){
            tax_amount = (salary - 50000) * 30/100;
        }
        System.out.println("income tax is "+tax_amount);
    }
}

import java.util.Scanner;
public class FinancialForecasting {
    static double futureValue(double value,double rate,int year){
        if(year==0)
            return value;

        return futureValue(value*(1+rate),rate,year-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter current value: ");
        double val=sc.nextDouble();
        System.out.print("Enter growth rate (%): ");
        double rate=sc.nextDouble()/100;

        System.out.print("Enter years: ");
        int year=sc.nextInt();
        double ans=futureValue(val,rate,year);
        System.out.println("Future Value = "+(float)ans);
    }
}
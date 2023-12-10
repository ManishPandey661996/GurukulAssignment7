import java.util.Scanner;
class SumOfSeriesAToN{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,n;
        System.out.print(" Enter the value of a : ");
        a= sc.nextInt();
        System.out.print(" Enter the value of n : ");
        n = sc.nextInt();
        double sum=0.0;

        for (int i = 1 ; i <= n ; i++){
            sum = sum + i/Math.pow(a,i);

        }
        System.out.println("sum : "+ sum);

    }
}
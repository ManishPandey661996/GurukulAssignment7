import java.util.Scanner;
class SumOfSeries{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double n ;
        System.out.print(" Enter the value of n : ");
        n= sc.nextDouble();
        double sum=0.0;
        double f=1;
     
        for( double i=1.0; i <= n; i++){
            f=f*i;
            sum= sum + i/f; 

        }
        System.out.println(sum);
    }
}
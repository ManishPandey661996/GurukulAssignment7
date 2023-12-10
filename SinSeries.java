import java.util.Scanner;
class SinSeries{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double x;
        int n;
        System.out.print(" Enter the value of x in degree : ");
        x=sc.nextDouble();
        System.out.print(" Enter the value of n : ");
        n=sc.nextInt();
        x= (3.14/180)*x;
        double sum=0.0;
        long f=1;
        int s =1;
        

        for (int i=1; i<=n ; i++){
            f= f*i;
            if(i%2 !=0){
            sum = sum+s*(Math.pow(x,i))/ f;
            s=s*-1;
            
            } 


        }
        System.out.printf("%.2f",sum);

    }
}
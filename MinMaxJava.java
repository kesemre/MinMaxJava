import java.util.Scanner;
public class MinMaxJava {
    public static void main(String[] args) {
        int min=0,max=0,number,again;
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen Kaç tane Sayı gireceğinizi yazını: ");
        again=input.nextInt();
        for(int i=1 ;i<=again;i++){
            System.out.print("lütfen "+i+". sayıyı giriniz: ");
            number = input.nextInt();
            if(i==1){
                min=number;
                max=number;
            }
            if(i>1){
                if (max < number) max = number;
                else if (number<min) min = number;
            }

    }
        System.out.println("Min: " +min);
        System.out.println("Max: "+ max);}
}
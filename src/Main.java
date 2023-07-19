import java.util.Scanner;

public class Main {
    public static boolean perfectSquare(int num){
        boolean flag=false;
        int i=1;
        while(true){
            if(i*i==num){
                flag=true;
                break;
            }
            if(i>num){
                flag=false;
                break;
            }
            i++;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        boolean check=perfectSquare(num);
        if(check){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }
}
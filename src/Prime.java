import java.util.Scanner;

public class Prime {
    static boolean Prime(int number,int index){
        if(number<=2){
            return (number==2)?true:false;
        }
        if(number % index==0){
            return false;
        }
        if(index*index>number){
            return true;
        }
        return Prime(number,index+1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Please enter a number : ");
            int number=input.nextInt();
            if(Prime(number,2)){
                System.out.println(number+" is PRİME number!");
            }else{
                System.out.println(number+" is not PRIME number!");
            }
        }
    }
}
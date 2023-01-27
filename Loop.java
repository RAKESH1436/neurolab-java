import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //Q print nuber from 1 to 5
        /*Syntax of for loops:
         for(initialization;condition;increment){

         }
         */
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        //for (int num = 0; num <= n;num+=1 ) 
        for (int num = 0; num <= n;num+=1 ){
            System.out.println(num);
            
        }
    }
    
}

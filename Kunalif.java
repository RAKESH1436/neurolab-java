public class Kunalif {
    public static void main(String[] args) {
        /*
         Syntax of if statement:
         if(boolean expression T or F){
            //body
         }else{
            //do this
         }
         */
        //multiple if-else
        int salary=5400;
        // if(salary>10000){
        //     salary=salary+2000;
        // }else{
        //     salary=salary+1000;
        // }

        if(salary>10000){
            salary+=200;
        }if (salary>20000) {
            salary+=1000;
            
        } else {
            salary+=1000;
            
        }
        System.out.println(salary);

    }
    
}

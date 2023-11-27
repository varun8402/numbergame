import java.util.*;
public class numbergame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int op =1;
        while(op != 0){
            int randint = rand.nextInt(100);
            int a = 5;
            while(a-->0){
            System.out.println("Enter a number between 1-100");
            int x = sc.nextInt();
            if(randint == x){
                System.out.println("You guessed it correctly");
                break;
            }
            else if(randint - x >=10 ){
                System.out.println("No its not correct");
                System.out.println("Too Low");
            }
            else if(x - randint >= 10){
                System.out.println("No its not correct");
                System.out.println("Too High");
            }
            else{
                System.out.println("Not Correct");
            }
            System.out.println("Chances remaining = " + (a));            
            }
            System.out.println("Correct Ans was  = " + randint);
            System.out.println("Press 0 to Exit and 1 to Play again");
            op = sc.nextInt();
        }
    }
}

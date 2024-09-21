import java.util.Scanner;
import java.util.Random;
public class Main{

    public static void main(String[]args){
        System.out.print("type 0 for rock,1 for paper,2 for scissor: ");
        Scanner sc= new Scanner(System.in);
        Random rd = new Random();
        int userinput=sc.nextInt();
        int computerinput = rd.nextInt(3);
        if(userinput>2){
            System.out.print("undefined input entered");
        }
        if (userinput==computerinput) {
            System.out.println("draw");
        }
        else if (userinput==0 && computerinput==2 || userinput==1 && computerinput==0 || userinput==2 && computerinput==1){
            System.out.println("you win!");
        }
        else if(userinput<3 && computerinput!=userinput){
            System.out.println("computer win");
        }
        if(userinput<3 && computerinput==0){
            System.out.print("computer choice: rock");
        }
        else if(userinput<3 && computerinput==1){
            System.out.print("computer choice: paper");
        }
        else if(userinput<3 && computerinput==2){
            System.out.print("computer choice: scissor");
        }
    }
}



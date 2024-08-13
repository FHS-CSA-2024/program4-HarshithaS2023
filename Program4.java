//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){
        int oneNum = 0;
        int twoNum = 0;
        int threeNum = 0;
        int fourNum = 0;
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        oneNum = myObj.nextInt();
        System.out.println("Enter second number: ");
        twoNum = myObj.nextInt();
        System.out.println("Enter third number: ");
        threeNum = myObj.nextInt();
        System.out.println("Enter fourth number: ");
        fourNum = myObj.nextInt();
        int sum = oneNum+twoNum+threeNum+fourNum;
        double average = sum/4.0;
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println("The average of the four numbers is " + average);
    }
}

//Paste console output below:
/*
Enter first number: 
475
Enter second number: 
821
Enter third number: 
369
Enter fourth number: 
562
The sum of the four numbers is 2227
The average of the four numbers is 556.75

*/

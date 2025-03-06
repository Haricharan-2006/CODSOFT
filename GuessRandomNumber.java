/**This is program based on the guessing Random number Author : Sannidhiraju  Sai Hari Charan Date : 06-03-2-25  */
import java.util.Random;
import java.util.Scanner;
public class GuessRandomNumber {
    public static int generateNumberGame()
    {
        int score = 0,i = 0;
        int guessNumber = 0,randomNumber = 0;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        while(i <= 9)
        {
          System.out.print("Enter the expected guess number[0,100] : ");
          guessNumber = s.nextByte();
          randomNumber = r.nextInt(0,101);
          if(guessNumber == randomNumber)
          {
             score = score + 10;
             System.out.println("Hooray!You guessed the right number.");
          }
          else if(guessNumber-randomNumber == 5)
          {
             System.out.println("Too Close!but entered a little larger number.Try Again");
          }
          else if(guessNumber-randomNumber == -5)
          {
             System.out.println("Too Close!but entered a little smaller number.Try Again");
          }
          else if(guessNumber-randomNumber == 10)
          {
             System.out.println("Close!but entered a larger number.Try Again");
          }
          else if(guessNumber-randomNumber == -10)
          {
             System.out.println("Close!but entered a smaller number.Try Again");
          }
          else if(guessNumber > randomNumber)
          {
            System.out.println("Entered a greater number.Try Again");
          }
          else
          {
            System.out.println("Entered a Lower number.Try Again.");
          }
          i++;
        }
        return score;
    }
    public static void main(String[] args) {
        int flag = 1,choice;
        System.out.println("\n\nRULES OF THE GAME : \n1.You have to enter 1 to start the game\n2.Every round has 10 attempts\n3.You will score 10 for every correct guess and 0 for wrong guess");
        System.out.println("\n\nEnter 1 to start the game.");
        Scanner s = new Scanner(System.in);
        choice = s.nextInt();
        if(choice == 1)
        {
        do{
           System.out.println("\nYour Score for 10 attempts is "+generateNumberGame());
           System.out.println("Want to Play again.\n\nPress\n1.Play Again\n2.Quit");
           System.out.print("Enter your choice : ");
           choice = s.nextInt();
           if(choice == 1)
           {
             flag = 1;
           }
           else
           {
              flag = 0;
           }
        }while(flag == 1);
    }
        s.close();

    }
}

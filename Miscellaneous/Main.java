/*There are different types of sports. Some of the are indoors and some are outdoors. 
Each has its own properties like, name of the sport, number of players required, time duration (if any), 
equipment needed (like ball, bat), country of origin etc. In some games there are subtypes, 
like in cricket T20, One day, or Test match. Each sub type will have own properties. 
In some cases, they have redefined the rules of its main type. 
Like in cricket you have total overs equals to 50 for one day match, 20 for T20 etc. 
Some legends are there in each sport. Consider details of some of such players in each type of sports like, 
country of origin of that player, name, presently playing or not etc.

Implement the above scenario using java. Use its different features like, class, objects, array of objects, 
instance variable hiding, method overloading, inheritance, method overriding etc. wherever needed. 
Take help from different keywords like super, this etc.
*/

package Miscellaneous;

import java.util.Scanner;

public class Main 
{
    public static void main(String args[])
    {
        String Choice = choice();
        Sports sp = new Sports();
        sp.details(Choice);
    }

    private static String choice() 
    {
        Scanner sc = new Scanner(System.in);
        String GameOfChoice = "";
        System.out.println("Sports Database : ");
        System.out.println("\t1) Indoor games \n\t2) Outdoor games");
        System.out.println("Select the type of game you are looking for (1/2): ");
        int First_choice = sc.nextInt();
        if(First_choice == 1)
        {
            String[] Games = {"Chess", "Table Tennis", "Carrom", "Snooker"};
            System.out.println("Indoor games : ");
            System.out.println("\t1)Chess \n\t2)Table Tennis \n\t3)Carrom \n\t4)Snooker");
            System.out.println("Select the indoor game you want data for (1/2/3/4) : ");
            int Second_choice = (sc.nextInt() - 1);
            for(int i=0;i<4;i++)
            {
                if(Second_choice == i)
                {
                    GameOfChoice = Games[i];
                    return GameOfChoice;
                }
            }
            System.out.println("INVALID CHOICE");
            sc.close();
        }
        else
        {
            System.out.println("ERROR : YOU HAVE ENTERED THE WRONG CHOICE.");
        }
        sc.close();
        return GameOfChoice;
    }
}

class Sports
{
    public void details(String game)
    {
        System.out.println(game);
    }
}
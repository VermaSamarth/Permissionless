import java.util.*;
public class spaceship
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String str[]=new String[6];
        int k=0,c=0;
        for(int i=0;i<2;i++)
        {    
        System.out.println("Enter the details for person"+(i+1)+":");
        System.out.println("Enter the music taste:");
        str[k++]=scan.nextLine().toUpperCase();
        System.out.println("Enter the movie taste:");
        str[k++]=scan.nextLine().toUpperCase();
        System.out.println("Enter the drinks taste:");
        str[k++]=scan.nextLine().toUpperCase();
        }
        for(k=0;k<=2;k++)
        {
            if(str[k].equals(str[k+3]))
            c++;
        }
        double x=(c/3.0)*100;
        System.out.println("Compatibility Percentage:"+x+"%");
        scan.close();
    }
}
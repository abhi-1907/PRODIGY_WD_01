import java.util.*;

class temperature
{
    public static void main(String arg[])
    {
        char p;
        Scanner ob=new Scanner(System.in);
        do{
        System.out.println("WELCOME");
        System.out.println("-------------------------------");
        System.out.println("Enter the temperature: ");
        int t=ob.nextInt();
        System.out.println("Enter the Scale: ");
        System.out.println("1.Celsius");
        System.out.println("2.Fahrenheit");
        System.out.println("3.Kelvin");
        int s=ob.nextInt();
        if(s==1)
        {
            int f=t*9/5+32;
            int k=t+273;
            System.out.println("In fahrenheit: "+f);
            System.out.println("In kelvin: "+k);
        }
        else if(s==2)
        {
            int c=(t-32)*5/9;
            int k=c+273;
            System.out.println("In Celsius: "+c);
            System.out.println("In kelvin: "+k);
        }
        else if(s==3)
        {
            if(t>=0)
            {
            int c=t-273;
            int f=c*9/5+32;
            System.out.println("In Celsius: "+c);
            System.out.println("In fahrenheit: "+f);
            }
            else
            {
                System.out.println("Temperature cannot be less than 0 Kelvin!!!");
            }
        }
        else
        {
            System.out.println("Enter a valid option!!!!!");

        }
        System.out.println("Do you want to continue??" );
        System.out.println("y/n");
        p=ob.next().charAt(0);
    
    }while(p=='y');

    }
}
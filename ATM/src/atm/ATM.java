package atm;
import java.util.Scanner;
public class ATM
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        
        int choice;             //entekhabe amaliyat ha
        int personPass=0;       //ramze shakhs 
        int personBalance=0;    //mojoodi shakhs
        int cardNumber=0;       //shomare karte shakhs
        
        boolean login=false;    //ramze voroodi
        boolean withdrawal=false;   // mablaghe bardashte vajh
        boolean transfer_cn=false;  //shomare karte maghsad    
        boolean transfer_money=false;   //mablaghe enteghali
        boolean current_pass=false;     //ramze ghabli
        boolean confirm_pass=false;     //ramz haye jadid
        
        String person1="Amir Daneshvar";       //esme clinet1
        String person2="Arshia Gheybi";  //esme client2
        String person3="Naser KhoobKheslat";      //esme client3
        
        int pass_p1=123;    //ramze client1
        int pass_p2=1234;   //ramze client2
        int pass_p3=12345;  //ramze client3
        
        int balance_p1=4500000;     //mojoodi client1
        int balance_p2=8900000;     //mojoodi client2
        int balance_p3=1250000;     //mojoodi client3
        
        int cn_p1=50470610;     //shomare karte client1
        int cn_p2=60375910;     //shomare karte client2
        int cn_p3=63621410;     //shomare karte client3
        
        
        while(login==false) //ta vaghti ramze sahih vared nashavad  
        {
            System.out.print("Please enter your password: ");
            int pass=obj.nextInt();
        
            if(pass==pass_p1)
            {
                personPass=pass_p1;
                personBalance=balance_p1;
                cardNumber=cn_p1;
                login=true;
            
                System.out.println("\n\t\tWelcome "+person1+"\n");
            }
            else if(pass==pass_p2)
            {
                personPass=pass_p2;
                personBalance=balance_p2;
                cardNumber=cn_p2;
                login=true;
            
                System.out.println("\n\t\tWelcome "+person2+"\n");
            }
            else if(pass==pass_p3)
            {
                personPass=pass_p3;
                personBalance=balance_p3;
                cardNumber=cn_p3;
                login=true;
            
                System.out.println("\n\t\tWelcome "+person3+"\n");
            }
            else
            {
                System.out.println("\n\t\tInvalid password!\n");
                
            }
        }
        do
        {
            System.out.print("1- Balance Inquery");
            System.out.print("\t\t\t2- Cash Withdrawal\n");
            System.out.print("3- Money Transfer");
            System.out.print("\t\t\t4- Change Password\n");
            System.out.print("5- View Password");
            System.out.print("\t\t\t6- Exit\n\n");
            
            System.out.print("Select Option: ");
            choice=obj.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\n\t\tYour Balance is: "+personBalance+" Rials\n");
                    break;
                    
                case 2:
                    while (withdrawal == false) // ta vaghti ke mojoodi kafi nabashad
                    {
                        System.out.print("1- 10.000 Toman");
                        System.out.print("\t\t2- 20.000 Toman\n");
                        System.out.print("3- 30.000 Toman");
                        System.out.print("\t\t4- 40.000 Toman\n");
                        System.out.print("5- 50.000 Toman");
                        System.out.print("\t\t6- Others...\n\n");

                        System.out.print("Select Option: ");
                        int option = obj.nextInt();

                        switch (option)
                        {
                            case 1:
                                if (10000 <= personBalance)
                                {
                                    personBalance = personBalance - 10000;
                                    System.out.println("\n\t\tPlease take your money!");
                                    System.out.println("\t\tYour new balance is: " + personBalance + " Toman\n");
                                    withdrawal = true;
                                }
                                else
                                {
                                    System.out.println("\n\t\tNot enough money in your account!!\n");
                                }
                                break;

                            case 2:
                                if (20000 <= personBalance)
                                {
                                    personBalance = personBalance - 20000;
                                    System.out.println("\n\t\tPlease take your money!");
                                    System.out.println("\t\tYour new balance is: " + personBalance + " Toman\n");
                                    withdrawal = true;
                                }
                                else
                                {
                                    System.out.println("\n\t\tNot enough money in your account!!\n");
                                }
                                break;

                            case 3:
                                if (30000 <= personBalance)
                                {
                                    personBalance = personBalance - 30000;
                                    System.out.println("\n\t\tPlease take your money!");
                                    System.out.println("\t\tYour new balance is: " + personBalance + " Toman\n");
                                    withdrawal = true;
                                }
                                else
                                {
                                    System.out.println("\n\t\tNot enough money in your account!!\n");
                                }
                                break;

                            case 4:
                                if (40000 <= personBalance)
                                {
                                    personBalance = personBalance - 40000;
                                    System.out.println("\n\t\tPlease take your money!");
                                    System.out.println("\t\tYour new balance is: " + personBalance + " Toman\n");
                                    withdrawal = true;
                                }
                                else
                                {
                                    System.out.println("\n\t\tNot enough money in your account!!\n");
                                }
                                break;

                            case 5:
                                if (50000 <= personBalance)
                                {
                                    personBalance = personBalance - 50000;
                                    System.out.println("\n\t\tPlease take your money!");
                                    System.out.println("\t\tYour new balance is: " + personBalance + " Toman\n");
                                    withdrawal = true;
                                }
                                else
                                {
                                    System.out.println("\n\t\tNot enough money in your account!!\n");
                                }
                                break;

                            case 6:
                                System.out.print("\n\t\tEnter withdrawal amount: ");
                                int bardasht = obj.nextInt();

                                if (bardasht <= personBalance)
                                {
                                    personBalance = personBalance - bardasht;
                                    System.out.println("\n\t\tPlease take your money!");
                                    System.out.println("\t\tYour new balance is: " + personBalance + " Toman\n");
                                    withdrawal = true;
                                }
                                else
                                {
                                    System.out.println("\n\t\tNot enough money in your account!!\n");
                                }
                                break;
                        }
                    }
                    break;
                    
                case 3:
                    while (transfer_money == false)     //ta vahgti ke mojoodi kafi nabashad
                    {
                        System.out.print("\n\t\tEnter withdrawal amount: ");
                        int transfer = obj.nextInt();
                        if (transfer <= personBalance)
                        {
                            transfer_money = true;
                            while (transfer_cn == false) //ta vaghti ke shomare karte maghsad sahih nabashad
                            {
                                System.out.print("\n\t\tEnter the desired Card Number: ");
                                int cn_end = obj.nextInt();

                                if (cn_end == cn_p1)
                                {
                                    System.out.println("\n\t\tTransferring money to " + person1 + "'s bank account");
                                    System.out.print("\t\tEnter 1 to confirm: ");
                                    int taeid = obj.nextInt();
                                    transfer_cn = true;

                                    if (taeid == 1)
                                    {
                                        balance_p1 = balance_p1 + transfer;
                                        personBalance = personBalance - transfer;

                                        System.out.println("\n\t\tSuccessful!");
                                        System.out.println("\n\t\tYour new balance is: " + personBalance + " Toman\n");
                                    }
                                }
                                else if (cn_end == cn_p2)
                                {
                                    System.out.println("\n\t\tTransferring money to " + person2 + "'s bank account");
                                    System.out.print("\t\tEnter 1 to confirm: ");
                                    int taeid = obj.nextInt();
                                    transfer_cn = true;

                                    if (taeid == 1)
                                    {
                                        balance_p2 = balance_p2 + transfer;
                                        personBalance = personBalance - transfer;

                                        System.out.println("\n\t\tSuccessful!");
                                        System.out.println("\n\t\tYour new balance is: " + personBalance + " Toman\n");
                                    }
                                }
                                else if (cn_end == cn_p3)
                                {
                                    System.out.println("\n\t\tTransferring money to " + person3 + "'s bank account");
                                    System.out.print("\t\tEnter 1 to confirm: ");
                                    int taeid = obj.nextInt();
                                    transfer_cn = true;

                                    if (taeid == 1)
                                    {
                                        balance_p3 = balance_p3 + transfer;
                                        personBalance = personBalance - transfer;

                                        System.out.println("\n\t\tSuccessful!");
                                        System.out.println("\n\t\tYour new balance is: " + personBalance + " Toman\n");
                                    }
                                }
                                else
                                {
                                    System.out.println("\n\t\tThe Entered Card Number is not correct!!\n");
                                }
                            }
                        }
                        else
                        {
                            System.out.println("\n\t\tNot enough money in your account!!\n");
                        }
                    }
                    break;
                    
                case 4:
                    while(current_pass==false)  //ta vaghti ke ramze ghabli ba ramzi ke vared shode motabeghat nadashte bashad
                    {
                        System.out.print("\n\t\tEnter Current Password: ");
                        int currentPass=obj.nextInt();
                    
                        if(currentPass==personPass)
                        {
                            current_pass=true;
                            while(confirm_pass==false)  //ta vaghti ke ramz haye jadid motabeghe ham nabashand
                            {
                                System.out.print("\n\t\tEnter New Password: ");
                                int newPass=obj.nextInt();
                    
                                System.out.print("\n\t\tConfirm the new password: ");
                                int newPassAgain=obj.nextInt();
                                
                                if(newPass==newPassAgain)
                                {
                                    confirm_pass=true;
                                    System.out.print("\n\t\tYour password is set successfully!\n");
                                    personPass=newPass;
                                }
                                else
                                {
                                    System.out.print("\n\t\tNew passwords do not match!");
                                }
                            }
                        }
                        else
                        {
                            System.out.print("\n\t\tThe old password is wrong!");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("\n\t\tYour Current Password is: "+personPass+"\n");
                    break;
                    
                case 6:
                    System.out.println("\n\t\tHave A Good Time :)\n");
                    break;
                    
                default:
                    System.out.println("\n\t\tInvalid Number!\n");
            }
        }while(choice!=6);
    }
    
}

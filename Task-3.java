import java.util.Scanner; 

class ATM {
    double balance;
    String name;
    long account;

    // ANSI color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    void checkBalance()
    {
        System.out.println(ANSI_YELLOW + "\tBalance: " + balance + ANSI_RESET);
    }

    void withdraw(double amount) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "Enter the Amount to Withdraw: " + ANSI_RESET);
        amount = obj.nextDouble();
        if (amount > balance) 
        {
            System.out.println(ANSI_RED + "Insufficient Funds. Withdrawal canceled." + ANSI_RESET);
        } 
        else 
        {
            balance -= amount;
            System.out.println(ANSI_GREEN + "Withdrawal successful. Balance: " + balance + ANSI_RESET);
        }
    }

    void deposit(double amount) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "Enter the Amount to Deposit: " + ANSI_RESET);
        amount = obj.nextDouble();
        balance += amount;
        System.out.println(ANSI_GREEN + "Deposit successful. New Balance: " + balance + ANSI_RESET);
        checkBalance();
    }

    void input() 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "Enter the Customer Name: " + ANSI_RESET);
        name = obj.nextLine();
        System.out.println(ANSI_CYAN + "Enter the Account No.: " + ANSI_RESET);
        account = obj.nextLong();
    }

    void display() 
    {
        // Print a colored border and user details
        System.out.println(ANSI_YELLOW + ANSI_GREEN + "--------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + ANSI_GREEN + "|       Customer Account Details     |" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + ANSI_GREEN + "--------------------------------------" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "\tCustomer Name: " + name);
        System.out.println(ANSI_GREEN+"\tAccount No   : " + account + ANSI_RESET);
        checkBalance();
        System.out.println(ANSI_YELLOW + ANSI_GREEN + "--------------------------------------" + ANSI_RESET);
    }
}

class User extends ATM 
{
    void withdraw(double amount) 
    {
        super.withdraw(amount);
    }

    void deposit(double amount) 
    {
        super.deposit(amount);
    }

    void input() 
    {
        super.input();
    }

    void display() 
    {
        super.display();
    }

    void modify() 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println(ANSI_CYAN + "Dear, " + name + ", do you really want to modify the account details? (y/n): " + ANSI_RESET);
        char ch = obj.next().charAt(0);
        if (ch == 'y' || ch == 'Y') 
        {
            obj.nextLine(); // Consume newline character
            
            System.out.println(ANSI_CYAN + "Enter Your New Name: " + ANSI_RESET);
            String newName = obj.nextLine();
            if (!newName.equals(name)) 
            {
                name = newName;
                System.out.println(ANSI_GREEN + "Name updated successfully." + ANSI_RESET);
            } 
            else 
            {
                System.out.println(ANSI_YELLOW + "Name remains the same. No update performed." + ANSI_RESET);
            }
    
            System.out.println(ANSI_CYAN + "Enter Your New Account No.: " + ANSI_RESET);
            long newAccount = obj.nextLong();
            if (newAccount != account) 
            {
                account = newAccount;
                System.out.println(ANSI_GREEN + "Account number updated successfully." + ANSI_RESET);
            } 
            else 
            {
                System.out.println(ANSI_YELLOW + "Account number remains the same. No update performed." + ANSI_RESET);
            }
    
            System.out.println(ANSI_CYAN + "Enter Your New Balance: " + ANSI_RESET);
            balance = obj.nextDouble();
            System.out.println(ANSI_GREEN + "Balance updated successfully." + ANSI_RESET);
        }
         else 
        {
            System.out.println(ANSI_YELLOW + "Modification canceled." + ANSI_RESET);
        }
    }
    
}

public class Task_3 
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        User a = new User();
        while (true) 
        {
            System.out.println(ANSI_YELLOW + ANSI_CYAN + "1. INPUT");
            System.out.println("2. DEPOSIT");
            System.out.println("3. WITHDRAW");
            System.out.println("4. DISPLAY");
            System.out.println("5. CHECK BALANCE");
            System.out.println("6. MODIFY");
            System.out.println("7. EXIT"+ ANSI_RESET);
            System.out.println("Enter Your Choice: " );
            int choice = obj.nextInt();
            switch (choice) 
            {
                case 1:
                    a.input();
                    break;

                case 2:
                    a.deposit(0); // Pass 0 as parameter, as amount will be entered in deposit method
                    break;

                case 3:
                    a.withdraw(0); // Pass 0 as parameter, as amount will be entered in withdraw method
                    break;

                case 4:
                    a.display();
                    break;

                case 5:
                    a.checkBalance();
                    break;

                case 6:
                    a.modify();
                    break;

                case 7:
                    System.out.println(ANSI_YELLOW + "Exiting..." + ANSI_RESET);
                    System.exit(0);
                    break;

                default:
                    System.out.println(ANSI_RED + "Invalid choice. Please enter a number between 1 and 7." + ANSI_RESET);
                    break;
            }
        }
    }
}

import java.util.Scanner;

public class Task_2 {
    // Define ANSI color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        // Input section
        System.out.println(ANSI_CYAN + "Enter the Student Name: " + ANSI_RESET);
        String name = obj.nextLine();

        System.out.println(ANSI_CYAN + "Enter the Mark of Physics: " + ANSI_RESET);
        int p = obj.nextInt();

        System.out.println(ANSI_CYAN + "Enter the Mark of Chemistry: " + ANSI_RESET);
        int c = obj.nextInt();

        System.out.println(ANSI_CYAN + "Enter the Mark of Mathematics: " + ANSI_RESET);
        int m = obj.nextInt();

        System.out.println(ANSI_CYAN + "Enter the Mark of Odia: " + ANSI_RESET);
        int o = obj.nextInt();

        System.out.println(ANSI_CYAN + "Enter the Mark of English: " + ANSI_RESET);
        int e = obj.nextInt();

        System.out.println(ANSI_CYAN + "Enter the Mark of Information-Technology: " + ANSI_RESET);
        int i = obj.nextInt();

        // Results section
        
        System.out.println(ANSI_GREEN + "Student Name - " + name + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "--------Subject Marks--------" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "SUBJECT\t\tGRADE" + ANSI_RESET);
        System.out.println(ANSI_RED+"PHYSICS\t\t" + p);
        System.out.println(ANSI_RED+"CHEMISTRY\t" + c);
        System.out.println(ANSI_RED+"MATHEMATICS\t" + m);
        System.out.println(ANSI_RED+"ODIA\t\t" + o);
        System.out.println(ANSI_RED+"ENGLISH\t\t" + e);
        System.out.println(ANSI_RED+"Biology\t\t" + i);
        double total = p + c + m + o + e + i;
        System.out.println(ANSI_GREEN + "--------------------------------" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "--------Display Results-2024---------" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Total Mark: \t" + total + "/600" + ANSI_RESET);

        double avg = total / 6;
        System.out.println(ANSI_GREEN + "Average Percentage = " + avg +" %"+ ANSI_RESET);

        // Grading section
        if (avg >= 90)
        {
            System.out.println(ANSI_CYAN + name + " has Secured Grade-A+." + ANSI_RESET);
        }
         else if (avg >= 80) 
        {
            System.out.println(ANSI_CYAN + name + " has Secured Grade-A." + ANSI_RESET);
        }
         else if (avg >= 70)
        {
            System.out.println(ANSI_CYAN + name + " has Secured Grade-B." + ANSI_RESET);
        } 
        else if (avg >= 60)
        {
            System.out.println(ANSI_CYAN + name + " has Secured Grade-C." + ANSI_RESET);
        } 
        else if (avg >= 50) 
        {
            System.out.println(ANSI_CYAN + name + " has Secured Grade-D." + ANSI_RESET);
        } 
        else if (avg >= 40) 
        {
            System.out.println(ANSI_CYAN + name + " has Secured Grade-E." + ANSI_RESET);
        } 
        else 
        {
            System.out.println(ANSI_RED + name + " has Secured Grade-F (Fail)." + ANSI_RESET);
        }
        System.out.println(ANSI_YELLOW + "---------------------END------------------" + ANSI_RESET);
    }
}

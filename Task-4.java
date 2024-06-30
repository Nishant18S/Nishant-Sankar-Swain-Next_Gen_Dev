import java.util.Scanner;

public class Quiz 
{
    private static class Timer extends Thread 
    {
        private final int timeLimitSeconds;

        public Timer(int timeLimitSeconds)
        {
            this.timeLimitSeconds = timeLimitSeconds;
        }

        @Override
        public void run()
        {
            try 
            {
                Thread.sleep(timeLimitSeconds * 1000); // Convert seconds to milliseconds
                System.err.println("\nTime's up! Please select an option faster next time.");
                System.exit(0); // Exit program if time runs out
            } 
            catch (InterruptedException e) 
            {
                return;
            }
        }
    }

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int timeLimitSeconds = 20;
        System.out.println("\u001B[36m*************************************************************************************\u001B[0m");
        System.out.println("\u001B[34m\t\t\tWelcome to my QUIZ APPLICATION WITH TIMER\u001B[34m");
        System.out.println("\u001B[36m*************************************************************************************\u001B[0m");
        System.out.println("\u001B[33m-------------------------------------------------------------------------------------\u001B[33m");
        System.out.println("\u001B[36mInstructions: You have 20 seconds to answer each question.Choose your option quickly.\u001B[0m");
        System.out.println("\u001B[33m-------------------------------------------------------------------------------------\u001B[33m");
        System.out.println("Enter the Student Name: ");
        String name = obj.nextLine();
        System.out.println("Dear "+name+" Do You want to attend the QUIZ(Y/N):");
        char ch=obj.next().charAt(0);
        
        int count = 0;
        int d = count;
        if(ch=='Y' || ch=='y')
        {
            System.out.println("\u001B[32m-----------Question Box-------------------");
        while (true)
        {
            System.out.println("\u001B[33m1. Question-1.");
            System.out.println("\u001B[33m2. Question-2.");
            System.out.println("\u001B[33m3. Question-3.");
            System.out.println("\u001B[33m4. Question-4.");
            System.out.println("\u001B[33m5. Question-5.");
            System.out.println("\u001B[33m6. Question-6.");
            System.out.println("\u001B[33m7. Question-7.");
            System.out.println("\u001B[33m8. Question-8.");
            System.out.println("\u001B[33m9. Question-9.");
            System.out.println("\u001B[33m10.Question-10.");
            System.out.print("\u001B[0mEnter your Choice: ");

            int choice = obj.nextInt();
            Timer timer = new Timer(timeLimitSeconds);
            char a;
            switch (choice) 
            {
                case 1:
                    System.out.println("\u001B[36mAddition of 5 and 3 is:?");
                    System.out.println("(a) 5 \t (b) 6");
                    System.out.println("(c) 7 \t (d) 8");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'd')
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is d");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 2:
                    System.out.println("\u001B[36mMultiplication of 5 and 3 is:?");
                    System.out.println("(a) 15 \t (b) 20");
                    System.out.println("(c) 37 \t (d) 28");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'a') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else 
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is a");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 3:
                    System.out.println("\u001B[36mIf the Radius is 5m then Calculate the Area of the Circle:?(π=3.141)");
                    System.out.println("(a) 78.52 \t (b) 85");
                    System.out.println("(c) 78.525 \t (d) 78");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'c')
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else 
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is c");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 4:
                    System.out.println("\u001B[36mWho is the Prime Minister of India:?");
                    System.out.println("(a) Mahatma Gandhi \t (b) Shri.Ravi Chandra");
                    System.out.println("(c) Sri.Narendra Damodar Modi \t (d) Shri.Naveen Pattnaik");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'c')
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is c");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 5:
                    System.out.println("\u001B[36mWho is the Father of the Computer?");
                    System.out.println("(a) Farenheit \t (b) Grenvile");
                    System.out.println("(c) Einstien \t (d) Charles Babage");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'd') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else 
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is d");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 6:
                    System.out.println("\u001B[36mCPU stands for ?");
                    System.out.println("(a) Control Process Unit \t (b) Central Processing Unit");
                    System.out.println("(c) Central Propose Unit \t (d) Control Programme Unit");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'b') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else 
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is b");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 7:
                    System.out.println("\u001B[36mA man is pushing a box with a mass of 30 kg. If he applies a force causing an acceleration of 30 m/s²,");
                    System.out.println("how much force does he apply on the box?");
                    System.out.println("(a) 900N \t (b) 400N");
                    System.out.println("(c) 200N \t (d) 100N");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'a') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is a");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 8:
                    System.out.println("\u001B[36mIf a person performs work with a force of 400 N over a small displacement of 20 m at an angle of 45 degrees,");
                    System.out.println("what will be the work done by the body?");
                    System.out.println("(a) 5,656.80J \t (b) 5,656.75J");
                    System.out.println("(c) 5,656.85J \t (d) 5,656.65J");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'c') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is c");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 9:
                    System.out.println("\u001B[36mDetermine the Perimeter of the Rectangle:(l=15m & w=20m)?");
                    System.out.println("(a) 70.00 \t (b) 85");
                    System.out.println("(c) 75.52 \t (d) 78");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'a') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    } 
                    else
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is a");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                case 10:
                    System.out.println("\u001B[36mLight Year is a Unit of:?");
                    System.out.println("(a) Time \t (b) Distance");
                    System.out.println("(c) Light \t (d) Intensity Of Light");
                    System.out.print("\u001B[0mEnter any Option: ");

                    timer.start();
                    a = obj.next().charAt(0);
                    timer.interrupt();

                    if (a == 'b') 
                    {
                        System.out.println("\u001B[32mDear, " + name + " answer is Correct.");
                        count++;
                        System.out.println("Obtained = " + count + " mark.");
                    }
                    else
                    {
                        System.err.println("\u001B[31mIncorrect answer, Correct option is b");
                        System.out.println("Obtained = " + d + " mark.");
                        System.exit(0);
                    }
                    break;

                    default:
                    	System.out.print("\u001B[31mYou have entered invalid choice!!!!!!!!");
                    	System.exit(0);
                        continue;
            }
            if (count == 10) {
                break;
            }
        }

        // Print the final score out of 10
        System.out.println("\u001B[36m----------------------------------------------\u001B[0m");
        System.out.println("\u001B[32mFinal Score: " + count + "/10\u001B[0m");

        // Optionally, you can also provide feedback based on the score
        if (count >= 7)
        {
            System.out.println("\u001B[32mCongratulations, " + name + "! You passed the quiz.");
        } 
        else 
        {
            System.out.println("\u001B[31mSorry, " + name + ". You did not pass the quiz. Better luck next time.");
        }
        }
        else
        System.err.println("Exiting......");
        System.exit(0);
    }
}


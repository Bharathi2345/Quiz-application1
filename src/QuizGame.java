import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player player = new Player();

        try {
            player.setName("Karthik");
            player.setAge(27);
            player.setscore(0);
            player.setlifeLines(2);

            System.out.println("Name: " + player.getName());
            System.out.println("Age: " + player.getAge());
            System.out.println("Score: " + player.getscore());
            System.out.println("Life Lines: " + player.getlifeLines());

            System.out.println("Welcome to the quiz game, " + player.getName() + "!");

            System.out.println("Are you ready to play? (yes/no)");
            String response = sc.next();

            if (response.equalsIgnoreCase("no")) {
                System.out.println("Game terminated. Better luck next time!");
                return;
            }

            System.out.println("Here are the rules:");
            System.out.println("1. You will be asked a series of questions.");
            System.out.println("2. You can use two lifeLines: 50-50 and Ask the Audience.");
            System.out.println("3. If you answer a question correctly, you will earn a reward.");
            System.out.println("4. If you answer a question incorrectly, the game will terminate.");

            int questionNumber = 1;
            int reward = 100;

            while (true) {
                System.out.println("\nQuestion " + questionNumber + ":");
                System.out.println("Which is the largest planet in our solar system?");
                System.out.println("A) Earth");
                System.out.println("B) Saturn");
                System.out.println("C) Jupiter");
                System.out.println("D) Uranus");
             if(questionNumber==2) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which is the capital city of Australia?");
            	System.out.println("A)sydney");
            	System.out.println("B)melbourne");
            	System.out.println("C)canberra");
            	System.out.println("D)perth");
            }else if(questionNumber==3) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which cricketer is known as the god of cricketer?");
            	System.out.println("A)Sachin Tendulkar");
            	System.out.println("B)Sunil gavaskar");
            	System.out.println("C)Kapil dev");
            	System.out.println("D)MS dhoni");
            }else if(questionNumber==4) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("what is the process by which plants convert sunlight into energy");
            	System.out.println("A)Respiration");
            	System.out.println("B)Photosynthesis");
            	System.out.println("C)Decomposition");
            	System.out.println("D)Fermentation");
            }else if(questionNumber==5) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which is worlds largest desert?");
            	System.out.println("A)Sahara");
            	System.out.println("B)Gobi");
            	System.out.println("C)Mojave");
            	System.out.println("D)Atacama");
            }else if(questionNumber==6) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which is the worlds longest river?");
            	System.out.println("A)Nile");
            	System.out.println("B)Amazon");
            	System.out.println("C)Yangtze");
            	System.out.println("D)Mississippi");
            }else if(questionNumber==7) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which is the worlds largest island");
            	System.out.println("A)Greenland");
            	System.out.println("B)Iceland");
            	System.out.println("C)Great britain");
            	System.out.println("D)Borneo");
            }else if(questionNumber==8) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("who is known as the boxing legend");
            	System.out.println("A)Muhammad ali");
            	System.out.println("B)Mike tyson");
            	System.out.println("C)Floyd mayweather");
            	System.out.println("D)Manny pacquiao");
            }else if(questionNumber==9) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which team is known as the all blacks?");
            	System.out.println("A)New zealand");
            	System.out.println("B)Australia");
            	System.out.println("C)South africa");
            	System.out.println("D)England");
            }else if(questionNumber==10) {
            	System.out.println("\nQuestion"+questionNumber +":");
            	System.out.println("which of the following football player is known as CR7");
            	System.out.println("A)Lionel messi");
            	System.out.println("B)Cristiano ronaldo");
            	System.out.println("C)Neymar jr");
            	System.out.println("D)kylian mbappe");
            }
            	 System.out.println("Do you want to use a lifeLine? (yes/no)");
                response = sc.next();

                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Which lifeLine do you want to use? (50-50/Ask the Audience)");
                    response = sc.next();

                    if (response.equalsIgnoreCase("50-50")) {
                        if (player.getlifeLines() > 0) {
                            player.setlifeLines(player.getlifeLines() - 1);
                            System.out.println("50-50 life line used. Removing two incorrect options.");
                            if(questionNumber==1) {
                            System.out.println("A) Earth");
                            System.out.println("C) Jupiter");
                        }else if(questionNumber==2) {
                        	System.out.println("B) Melbourne");
                        	System.out.println("C) Canberra");
                        }else if(questionNumber==3) {
                        	System.out.println("A) Sachin Tendulkar");
                        	System.out.println("B) Sunil gavaskar");
                        }else if(questionNumber==4) {
                        	System.out.println("A) Respiration");
                        	System.out.println("B) Phoosynthesis");
                        }else if(questionNumber==5) {
                        	System.out.println("A) Sahara");
                        	System.out.println("C) Mojave");
                        }else if(questionNumber==6) {
                        	System.out.println("A) Nile");
                        	System.out.println("B) Amazon");
                        }else if(questionNumber==7) {
                        	System.out.println("A) Green land");
                        	System.out.println("B) Iceland");
                        }else if(questionNumber==8) {
                        	System.out.println("A) Muhammad ali");
                        	System.out.println("B) Mike tyson");
                        }else if(questionNumber==9) {
                        	System.out.println("A) New zealand");
                        	System.out.println("B) Australia");
                        }else if(questionNumber==10) {
                        	System.out.println("A) Lionel messi");
                        	System.out.println("B) Cristiano ronaldo");	
                        } else {
                            System.out.println("You don't have any lifeLines left.");
                        }
                    } else if (response.equalsIgnoreCase("Ask the Audience")) {
                        if (player.getlifeLines() > 0) {
                            player.setlifeLines(player.getlifeLines() - 1);
                            System.out.println("Ask the Audience lifeLine used. The audience thinks the answer is C) Jupiter.");
                        } else {
                            System.out.println("You don't have any lifeLines left.");
                        }
                    }
                }

                System.out.println("Enter your answer:");
                response = sc.next();

                if (response.equalsIgnoreCase("C")) {
                    System.out.println("Correct answer! You earn a reward of $" + reward + ".");
                    player.setscore(player.getscore() + reward);
                    reward *= 2;
                    questionNumber++;
                } else {
                    System.out.println("Incorrect answer. Game terminated.");
                    System.out.println("You earned a total of $" + player.getscore() + ".");
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
        	System.out.println("An error occurred");
        }
        
        	
        }
    }
    
}
  

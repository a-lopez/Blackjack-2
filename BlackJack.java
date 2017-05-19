import java.util.*;
public class BlackJack {


public static void main(String[] args) {

    /*
     * Scanner && User Variables
     */
    Scanner Blackjackgame = new Scanner(System.in);
    
    
    
    
    int usersDecision = 0;

    /*
     * Users && Dealers Value Variables
     */
    int usersValue = 0;
    int dealersValue = 0;

    /*
     * Suit && Rank Arrays
     */
    String[] card = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};
    /*
     * Array Lists Users Cards && Dealers Cards
     */
    ArrayList<String> usersCards = new ArrayList<String>();
    ArrayList<String> dealersCards = new ArrayList<String>();

        System.out.println("Welcome to Blackjack !\n"+"Remember to have fun!\nGood Luck!");
    /*
     * for loop to decide dealer first card
     */
    for (int i = 0; i <= 0; i++) {
        int randomGenNumber = (int) (Math.random()*13);

        dealersCards.add(card[randomGenNumber]);
    }
    /*
     * displays dealers first card 
     */
  System.out.println("**************************************************************");
    System.out.println("The Dealer cards are being dealt right now: " + dealersCards);


    /*
     * Deal Users Two Cards using a for loops
     */
    for (int i = 0; i <= 1; i++) {

        int randomGenNumber = (int) (Math.random()*13);

        usersCards.add(card[randomGenNumber]);

    }
  
    /*
     * Print Users Two Cards, display the cards value
     */
    System.out.println("Your Cards are being dealt right now : " + usersCards);

    /*
     * Check if the users has a Blackjack
     */
    if(usersCards.contains("Ace")) {
        if(usersCards.contains("King") || usersCards.contains("Queen") || usersCards.contains("Jack") || usersCards.contains("10")){
            System.out.println("You've Got BlackJack! Congratulations, You Win!");
            ;
        } else {
            System.out.println("Think about your next move\n[1] Enter 1 to Hit \n[2] Enter 2 too Stay");
        }
    } 
    
    
    else {
        System.out.println("Think about your next move\n[1] Enter 1 to Hit \n[2] Enter 2 to Stay");
    }


    /*
     * Take Users Decision the input
     * Check Users Decision the input
     * used the While Loop
     * i used the Switch Statement to check for the Users Decision
     */

    int x = 1;  
    while(x==1) {

        usersDecision = Blackjackgame.nextInt();

        switch (usersDecision) {
        case 1:
            System.out.println("You've decided to Hit  - your current card hand is : " + usersCards);
            System.out.println("I have given you your additional Card ");
            x = 1;

            /*
             * WHILE  = True
             * Generate New Cards
             * Check Value of Cards
             * Bust/hit/Stay For User             */
            for (int i = 0; i <= 0; i++) {
                int randomGenNumber = (int) (Math.random()*13);

                usersCards.add(card[randomGenNumber]);
            }

            System.out.println(usersCards + "\n");

            /*
             * Generate Users Card Value
             */
            usersValue = 0;

            for(int i = 0; i < usersCards.size(); i++) {
                if(usersCards.get(i).equals("2")) {
                    usersValue += 2;
                } else if(usersCards.get(i).equals("3")) {
                    usersValue += 3;
                } else if(usersCards.get(i).equals("4")) {
                    usersValue += 4;
                } else if(usersCards.get(i).equals("5")) {
                    usersValue += 5;
                } else if(usersCards.get(i).equals("6")) {
                    usersValue += 6;
                } else if(usersCards.get(i).equals("7")) {
                    usersValue += 7;
                } else if(usersCards.get(i).equals("8")) {
                    usersValue += 8;
                } else if(usersCards.get(i).equals("9")) {
                    usersValue += 9;
                } else if(usersCards.get(i).equals("10")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Jack")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Queen")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("King")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Ace")) {
                    usersValue += 11;
                }
            }
            /*
             * Print Users Value
             */
            System.out.println("Your cards value is : " + usersValue + "");
           
            if(usersValue != 21 && usersValue <=21){
                System.out.println("You Did Not Get BlackJack!\n[1] Enter 1 to Hit \n[2 Enter 2 too Stay");
                 
           
              
            } else if (usersValue == 21) {
                System.out.println("You Got BlackJack! Congratulations!");
            } 
            
            
            // this where is i need to fix the code 
            
             else if (usersValue > 21) {
                System.out.println("You've Bust! You Lose!");
              
            }
            
            break;

        case 2: 
            System.out.println("You've decided to stay with your Cards: " + usersCards +"\n");
            x = 1;
            /*
             * For Loop
             * Generate Users Card Value
             */
            usersValue = 0;

            for(int i = 0; i <usersCards.size(); i++) {
                if(usersCards.get(i).equals("2")) {
                    usersValue += 2;
                } else if(usersCards.get(i).equals("3")) {
                  usersValue += 3;
                } else if(usersCards.get(i).equals("4")) {
                    usersValue += 4;
                } else if(usersCards.get(i).equals("5")) {
                    usersValue += 5;
                } else if(usersCards.get(i).equals("6")) {
                    usersValue += 6;
                } else if(usersCards.get(i).equals("7")) {
                    usersValue += 7;
                } else if(usersCards.get(i).equals("8")) {
                    usersValue += 8;
                } else if(usersCards.get(i).equals("9")) {
                    usersValue += 9;
                } else if(usersCards.get(i).equals("10")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Jack")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Queen")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("King")) {
                    usersValue += 10;
                } else if(usersCards.get(i).equals("Ace")) {
                    usersValue += 11;
                }
            }
            /*
             * Dealers playsSecond Card 
             * &&
             * Check Dealers Value && Take make a choice for the dealer
             */
            System.out.println("Dealing Dealers Second Card!");

            for (int i = 0; i <= 0; i++) {
                int randomGenNumber = (int) (Math.random()*13);

                dealersCards.add(card[randomGenNumber]);
            }
            System.out.println(dealersCards + "\n");

            /*
             * For Loop
             * Generate Dealers Card Value
             */
            dealersValue = 0;

            for(int i = 0; i < dealersCards.size(); i++) {
                if(dealersCards.get(i).equals("2")) {
                    dealersValue += 2;
                } else if(dealersCards.get(i).equals("3")) {
                    dealersValue += 3;
                } else if(dealersCards.get(i).equals("4")) {
                    dealersValue += 4;
                } else if(dealersCards.get(i).equals("5")) {
                    dealersValue += 5;
                } else if(dealersCards.get(i).equals("6")) {
                    dealersValue += 6;
                } else if(dealersCards.get(i).equals("7")) {
                    dealersValue += 7;
                } else if(dealersCards.get(i).equals("8")) {
                    dealersValue += 8;
                } else if(dealersCards.get(i).equals("9")) {
                    dealersValue += 9;
                } else if(dealersCards.get(i).equals("10")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("Jack")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("Queen")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("King")) {
                    dealersValue += 10;
                } else if(dealersCards.get(i).equals("Ace")) {
                    dealersValue += 11;
                }
            }
            /*
             * Print and displays Dealers Value
             */
            System.out.println("Dealers Cards Value: " + dealersValue + "");

            /*
             * Take Action On Dealers Value
             */
             {

                dealersValue = 0;   
                for(int i = 0; i < dealersCards.size(); i++) {
                    if(dealersCards.get(i).equals("2")) {
                        dealersValue += 2;
                    } else if(dealersCards.get(i).equals("3")) {
                        dealersValue += 3;
                    } else if(dealersCards.get(i).equals("4")) {
                        dealersValue += 4;
                    } else if(dealersCards.get(i).equals("5")) {
                        dealersValue += 5;
                    } else if(dealersCards.get(i).equals("6")) {
                        dealersValue += 6;
                    } else if(dealersCards.get(i).equals("7")) {
                        dealersValue += 7;
                    } else if(dealersCards.get(i).equals("8")) {
                        dealersValue += 8;
                    } else if(dealersCards.get(i).equals("9")) {
                        dealersValue += 9;
                    } else if(dealersCards.get(i).equals("10")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("Jack")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("Queen")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("King")) {
                        dealersValue += 10;
                    } else if(dealersCards.get(i).equals("Ace")) {
                        dealersValue += 11;
                    }
                }
                /*
                 * If Dealers Value:
                 * <=16 == 17 < 17 == 21 > 21
                 * 
                 */
                if(dealersValue <= 16) {
                    int randomGenNumber = (int) (Math.random()*13);
                    dealersCards.add(card[randomGenNumber]);
                    System.out.println("Dealer Has Less Than 17 - Taking Another Card\n");
                    System.out.println("Dealers Cards: " + dealersCards);
                    dealersValue = 0;

                    for(int i = 0; i < dealersCards.size(); i++) {
                        if(dealersCards.get(i).equals("2")) {
                            dealersValue += 2;
                        } else if(dealersCards.get(i).equals("3")) {
                            dealersValue += 3;
                        } else if(dealersCards.get(i).equals("4")) {
                            dealersValue += 4;
                        } else if(dealersCards.get(i).equals("5")) {
                            dealersValue += 5;
                        } else if(dealersCards.get(i).equals("6")) {
                            dealersValue += 6;
                        } else if(dealersCards.get(i).equals("7")) {
                            dealersValue += 7;
                        } else if(dealersCards.get(i).equals("8")) {
                            dealersValue += 8;
                        } else if(dealersCards.get(i).equals("9")) {
                            dealersValue += 9;
                        } else if(dealersCards.get(i).equals("10")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("Jack")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("Queen")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("King")) {
                            dealersValue += 10;
                        } else if(dealersCards.get(i).equals("Ace")) {
                            dealersValue += 11;
                        }

                    }
                    System.out.println("Dealers Cards Value: " + dealersValue + "\n");
                } 

                /*
                 * Checks dealersValue against usersValue
                 * Prints Response
                 */
                if(dealersValue == 17 ) {
                    System.out.println("Dealer Has 17 - Dealer has decided to stay\n");
                    
                    if(usersValue < 17) {
                        System.out.println("You Have: " + usersValue + " You Lost");
                    } else if(usersValue == dealersValue) {
                        System.out.println("You Have: " + usersValue + " You Drew");
                    } else {
                        System.out.println("You Have: " + usersValue + " You Won!");
                    }
                }

                if(dealersValue > 17 && dealersValue < 21) {
                    System.out.println("Dealer Has: " + dealersValue + " Dealer has decided to stay\n" );
                   

                    if(usersValue < 18) {
                        System.out.println("You Have: " + usersValue + " You Lost");
                    } else if(usersValue == dealersValue) {
                        System.out.println("You Have: " + usersValue + " You Drew");
                    } else {
                        System.out.println("You Have: " + usersValue + " You Won!");
                    }
                }

                
               
                
                
                
                
                
                if(dealersValue == 21) {
                    System.out.println("Dealer Has BlackJack\n");
                   
                    if(usersValue == dealersValue) {
                        System.out.println("You Have: " + usersValue + " You Drew");
                    }
                }

                
               
                if(dealersValue > 21) {
                    System.out.println("Dealer Has Busted - You Win!");
                    
                }

            }
            break;
        default:
            System.out.println("Not A Valid Selection");
        }

    };
  }
}
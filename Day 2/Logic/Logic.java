public class Logic {
    public static void main(String[] args) {
    
    //integer list
    int presult;
    int tea = 2;
    int candy = 4;
    
    //code
        if (tea < 5 || candy < 5) {presult = 0;
        }
        else if (tea * 2 == candy || candy * 2 == tea) {presult = 2;
        } 
        else{presult = 1;
        }
        System.out.println(presult);
    
        // another part of code to display text with numbers, just wanted to test out

        if (presult == 0) {System.out.println("Bad Party");
        }
        else if (presult == 2) {System.out.println("Great Party");
        }
        else {System.out.println("Good Party");
        }
    }
}
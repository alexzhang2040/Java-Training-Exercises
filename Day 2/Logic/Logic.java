public class Logic {
    public static void main(String[] args) {
    
    //integer list
    int result;
    int tea = 2;
    int candy = 4;
    
    //code
        if (tea < 5 || candy < 5) {result = 0;
        }
        else if (tea * 2 == candy || candy * 2 == tea) {result = 2;
        } 
        else{result = 1;
        }
        System.out.println(result);
    
        // another part of code to display text with numbers, just wanted to test out

        if (result == 0) {System.out.println("Bad Party");
        }
        else if (result == 2) {System.out.println("Great Party");
        }
        else {System.out.println("Good Party");
        }
    }
}
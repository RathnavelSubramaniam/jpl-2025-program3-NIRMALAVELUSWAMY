import java.util.Scanner;  

public class VowelCounterWithArray {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        // Prompt the user to enter a string  
        System.out.print("Enter a string: ");  
        String input = sc.nextLine(); // Read user input  

        // Convert the string to a character array  
        char[] characters = input.toCharArray(); // Using 'characters' instead of 'charArray'  

        // Initialize vowel count  
        int vowelCount = 0;  

        // Loop through the character array  
        for (int i = 0; i < characters.length; i++) {  
            char currentChar = characters[i]; // Accessing the current character  

            // Check if the character is a vowel (case insensitive)  
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' ||  
                currentChar == 'o' || currentChar == 'u' ||  
                currentChar == 'A' || currentChar == 'E' ||   
                currentChar == 'I' || currentChar == 'O' ||   
                currentChar == 'U') {  
                vowelCount++; // Increment the count for each vowel found  
            }  
        }  
        // Output the total number of vowels found  
        System.out.println("Number of vowels in the string: " + vowelCount);  

        // Close the Scanner resource  
        sc.close();  
    }  
}  

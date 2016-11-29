import java.util.Scanner;

/**
*
* Name: Marsha Guimond
* Teacher: Mr.Hardman
* Assignment 5, Program 2
* Date Last Modified: November 28, 2016
*
*/

/**
 * 
 */

/**
 * @author m.guimond3
 *
 */
public class ArrayProject2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);

		int[] userNumbers = new int[10];
		int userElement;
		int found = 0;
		
		
		System.out.println("Please enter ten whole numbers below:");
		System.out.println();
		
		for(int i = 0; i < userNumbers.length; i++){
			System.out.print("Please enter a number: ");
			userNumbers[i] = userInput.nextInt();
			
		}
		
		System.out.println("What element do you want to search for?");
		userElement = userInput.nextInt();
		
		for(int i = 0; i < userNumbers.length; i++){
			
			if(userElement == userNumbers[i]){
				
				found++;
				
			}
			
		}
		
			
		System.out.println("Element " + userElement + " is found " + found + " times.");
				
		userInput.close();
	
	} 
		
}

			
			
		
			

			
	
	



/*
 * See README at https://github.com/mrsbluerose/aw.pokemon_go_egg_hatching
 * See UML at https://app.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0
 * See DEMO Video at https://youtu.be/N5VraCcRUu4
 */

/*
 * CODE CREDIT:
 * Nikita Tiwari
 * Geeks for Geeks website (Java version) https://www.geeksforgeeks.org/bubble-sort/
 * Changes noted
*/
package pokemongoeggs;

public class Sort {

	// An optimized version of Bubble Sort 
    static Egg[] bubbleSortDistanceRemaining(Egg arr[], int n) //changed to Egg[] type
    { 
        int i, j;
        Egg temp; //changed to Egg object
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (arr[j].getDistanceRemaining() < arr[j + 1].getDistanceRemaining())  //changed to compare distance remaining, 
                																		//sort in descending order
                { 
                    // swap arr[j] and arr[j+1] 
                    temp = arr[j]; 
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp; 
                    swapped = true; 
                } 
            } 
  
            // IF no two elements were  
            // swapped by inner loop, then break 
            if (swapped == false) 
                break; 
        } 
        return arr; //changed to add return
    } 
	
}

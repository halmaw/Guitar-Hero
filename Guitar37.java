/**
 
 * This Guitar37 class represents a vibrating guitar string 
 * Using the Karplus-Strong Algorithim
 * @author: Halleluya Almaw 
 * @version: 1.0 (11/27/2024)
 *
 */   


public class Guitar37 implements Guitar {
   private GuitarString[] Array;
   private int count=0;

   /**
    * Keyboard layout of each char to a string   
    * @return Returns the firstvalue in the ringBuffer using .peek()
    */

   public static final String KEYBOARD =
      "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";  // keyboard layout
   
   
   /**
    * Constructs a Guitar37 with 37 strings
    * Each string is assigned to a specific frequency
    */
   public Guitar37() {
     
      Array = new GuitarString[37]; //create an array for 37 strings
          
      for (int i =0; i<Array.length; i++) {
      
         double frequency = 440.0 * Math.pow(2, (i-24)/12.0);   // i-th character of the string corrsponds to a frequency 
      
         Array[i] = new GuitarString(frequency);
         
      }
          
          
   }
   
     /**
    * Plays a note based on given pitch
    * @param pitch The pitch of the note to play
    */
   public void playNote(int pitch) {
   
      int pitchindex = pitch +24;    // pitch of the notes
   }
    
   
   public boolean hasString(char string) {
      
      
      return( KEYBOARD.indexOf(string) != -1);   //will return truw if the string # is not -1 (meaning it is in the keyboard)
   
   } 
    
    /**
    * Plucks the string corresponding to the stringindex
    * @param string The string needed to pluck
    * @throws IllegalArgumentException if user chooses a key not in the keyboard, an error will be thrown
    */  
      
   public void pluck(char string) {
      int stringindex = KEYBOARD.indexOf(string); //grabs the index of the string
      
      if (stringindex == -1) {
      
         throw new IllegalArgumentException("Error: String not in Keyboard");   
      }
      Array[stringindex].pluck();
   }

   /**
    * Adds the sum of all 37 samples
    * @returns Returns the sum of all 37 samples from the string
    */  
   public double sample() {
      
      double sample=0.0; //define the sample
      for (int i=0; i <Array.length; i++) {
         sample+= Array[i].sample();             }
       
      return sample; //return sum of all 37 samples
   }

   /**
    * Returns the number of times tic has been called
    * @returns Returns the tic count string The string needed to pluck
    */  
   public void tic() {
      for (int i=0; i <Array.length; i++) {
         Array[i].tic();
      }
      count++;
   }

   public int time() {     //return #of time tic() has been called
      return -1; 
   }
   
   
   
   
}

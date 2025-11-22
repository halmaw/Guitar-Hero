/**
 
 * This Guitar37 class represents a vibrating guitar string at the given frequencies
 * @author: Halleluya Almaw 
 * @version: 1.0 (11/27/2024)
 *
 */   

import java.util.*;


public class GuitarString {
   private int N;        //total size of buffer
   private Queue <Double> ringBuffer;
   private static final int SAMPLING_RATE= 44100;  
   private static final double ENERGY_DECAY_FACTOR = 0.996;
   

   /**
    * Constructs a GuitarString of the given frequency 
    * @param frequency The frequency of the string in hertz
    * @throws IllegalArgumentException If the frequeny is <=0
    *         or if the size of the ringBuffer is <2 
    */
   public GuitarString(double frequency) {
      N = (int) Math.round((StdAudio.SAMPLE_RATE/frequency)); //round the frequency to the nearest int
   
      if (frequency <=0 || N<2) {
         throw new IllegalArgumentException("Frequency invalid");
      }
   
      ringBuffer = new LinkedList<>(); //
     
      for (int i=0; i<N; i++) {
         ringBuffer.add(0.0); //enqueue N zeros to represent a guitar at rest
      }
   }
 
   /**
    * Constructs a GuitarString of the given frequency 
    * @param init The init or initial value of the ring buffer to the values in the array
    * @throws IllegalArgumentException If the array is <2 elements
    */
   public GuitarString(double[] init)  {
         
      if (init.length <2) {
         throw new IllegalArgumentException("Array length must be at least 2");
      }
   
      ringBuffer = new LinkedList<>();
   
      for (int i=0; i< init.length; i++) {
         ringBuffer.add(init[i]); //initilizes contents of ring buffer to values in array
      }
      N = init.length;
   
   } 
     
    /**
    * Replaces the ring buffer with white noise
    */
    
   public void pluck() 
   {  
      Random random = new Random();
        
    
      for (int i = 0; i < N; i++) {
         ringBuffer.poll(); //remove old value
         ringBuffer.add(random.nextDouble() - 0.5); //add random value
      }
   }
   
   /**
    *  Simulates a time step of the sound wave one at a time
    */
   public void tic() 
   {
    
      double firstSample = ringBuffer.poll(); //remove first sample
      double average = (firstSample + ringBuffer.peek())/2.0; //peek next sample
      ringBuffer.add(ENERGY_DECAY_FACTOR * average); //add new value to the end of queue
      
    
   }
      
   /**
    * Replaces the front sample
    * @return Returns the firstvalue in the ringBuffer using .peek()
    */
   public double sample() {
      return ringBuffer.peek();
   }
      
}
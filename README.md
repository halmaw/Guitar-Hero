### Project Name
   Guitar Hero Project
   
## Overview
	This project allows the user to play a 37-string guitar using the keyboard. 

### Prerequisites
	
   Install Java Development Kit (JDK) 
   Install the jGrasp IDE (Integrated Development Environment) through their website https://www.jgrasp.org/
   Launch jGrasp and open  files.
   Use the "compile" button to compile all files in the project.

### Installation/Setup
   Launch jGrasp, create a new project, and add your Critter files
   Ensure Java AWT library is imported  (java.awt.*;)
   Compile (click the green plus button) to make sure there are no errors
   Copy and paste the code and click the "RUN" button inside the Crittermain class.
   This will start the simulation.

## Usage:
   This project can be used through a series of commands to play notes by selecting a key on the keyboard. 

## Purpose
	The purpose of this project is to create a digital simulation of a guitar that allows the user to play by interacting with the keyboard. As the user interacts with the keyboard(q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ) it will play a note. 

## Classes
	GuitarHero:
		Constructs a guitar object that allows the user to play. 
		The infinity loop will continue to play until the user leaves the loop.
	Guitar37: 
		An array with 37 elements, for each string on the guitar, each element in the array represents the guitar string object.
		Inside the loop, it will calculate the frequency, where i is the string number, based on the standard tuning of a guitar.  
		playNote(): This will change the pitch of the notes played
		hasString(): This will check if the given key by the user exists on the guitar, and it checks the validity of the string. 
		pluck(): This is to simulate the plucking of the string. When a user presses a key, it will find the corresponding string in the keyboard. If a user chooses a key not on the keyboard, then an error will be thrown. 
		sample(): This will calculate all of the sound samples to get a final sound that will show the current state of the guitar and return a combined value. 
		tic(): This uses the Karplus-Strong Algorithm that simulates how strings vibrate over time. 
	GuitarString:
		This class will simulate a single string on the guitar, which will generate the sound.  

		Methods: 
		pluck(): Initialize the string's vibration by setting the value to the buffer with random noise. 
		tic(): this method simulates how the stings sound will decay over time.
		sample(): this will return the current state of the string, for

## Contributing:
 Feel free to contribute to this Critter project by:
      -creating new subclasses with new critters and adding the critter to the main class
      -overriding and implementing new behaviors/characteristics
   
   
   

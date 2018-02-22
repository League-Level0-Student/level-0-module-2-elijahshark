//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package methods;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
/* NASA wants to shoot a rocket into orbit. 
  * Somebody has to do the countdown – or the rocket won’t launch.
 * 
 * The ground control chief will tell you where to start – then count down to 0. 
 * 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 * 
 **/

public class NasaCountdown {
	public static void main(String[] args) {
		NasaCountdown NASA = new NasaCountdown();
		// 2. Use a pop-up to ask the user where to start counting from
String counter = JOptionPane.showInputDialog(null, "what number would you"
		+ " like to start at 1 - 10");
int breaker = Integer.parseInt(counter);		
// 3. Change the countdown to use the new starting point
		
		// 1. Print a countdown from 10 to 0 on the console
for (int i = breaker; i > 0; i--) {
	speak (i+"");
	System.out.println(i);

}
		// 4. Use the speak method to hear the countdown.
		
		// 5. when the counting is done, speak "blastoff!"
System.out.println("BLAST OFF");	
	speak("BLAST OFF");
	NASA.ROCKETOFEPICNESS();
	}
	void ROCKETOFEPICNESS() {
		playNoise("126507__cydon__rocket-shoot-002.wav");
	}
	String ROCKETOFEPICNESS = "126507__cydon__rocket-shoot-002.wav";
	public void playNoise(String soundFile) {
		try {
			 Clip clip = AudioSystem.getClip();
			 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
			 clip.start();
			 Thread.sleep(3400);
		} catch (Exception ex) {
	  	ex.printStackTrace();}
		}

	static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}



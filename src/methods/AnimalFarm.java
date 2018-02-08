package methods;

//Copyright (c) The League of Amazing Programmers 2013-2017
//Level 0


import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

AnimalFarm() {
	//
	
	// 1. Ask the user which animal they want, then play the sound of that
	for (int i = 0; i < 999999999; i++) {
		
	 
	String word = JOptionPane.showInputDialog(null, "What animal do you want to hear their's a cow, duck, dog,");

	//2. Make it so that the user can keep entering new animals. */
	if (word == "dog") {
	playNoise(woofFile);
	}
	if (word == "duck") {
		playNoise(quackFile);
	}
		if (word == "cow") {
		playNoise(mooFile);
		}
	
	}
}

void playMoo() {
	playNoise(mooFile);
}

void playQuack() {
	playNoise(quackFile);
}

void playWoof() {
	playNoise(woofFile);
}

String quackFile = "quack.wav";
String mooFile = "moo.wav";
String woofFile = "woof.wav";
String meowFile = "meow.wav";
String llamaFile = "llama.wav";


/* Ignore this stuff */

public void playNoise(String soundFile) {
	try {
		 Clip clip = AudioSystem.getClip();
		 clip.open(AudioSystem.getAudioInputStream(getClass().getResource(soundFile)));
		 clip.start();
		 Thread.sleep(3400);
	} catch (Exception ex) {
  	ex.printStackTrace();
	}
}

public static void main(String[] args) {
	new AnimalFarm();

}

}


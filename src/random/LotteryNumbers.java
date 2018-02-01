package random;

import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	

int numcatcher = 0;
Random rr = new Random();

String lottery = "";
for (int i = 1; i < 6; i++) {
numcatcher = rr.nextInt(60) + 1;
System.out.println(numcatcher);
lottery += numcatcher;
lottery += " ";
}
JOptionPane.showMessageDialog(null, "these are your numbers " + lottery + " for your insert");







}
}
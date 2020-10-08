/**
 * ArrangementsMain is the starting point for execution.
 * Contains the code to intitialize the frame
 * 
 * @author GrayKnight CPM
 * @version  3/18/18
 * 
 * DO NOT MODIFY THIS CLASS
 */

 import javax.swing.JFrame;

public class ArrangementsMain
{

	public static void main(String[] ArgsgrA)
	{
	    JFrame frame = new JFrame("arrangments = (n!)/(n-k)!");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.getContentPane().add(new ArrangementsGUI());
	    frame.pack();
	    frame.setVisible(true);
	}

}

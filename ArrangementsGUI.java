
/**
 * Creates GUI finding unique arrangements of groups of objects.
 * 
 * @author GrayKnight CPM
 * @version 3/19/18
 * 
 * DO NOT MODIFY THIS CODE
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArrangementsGUI extends JPanel
{
    private JLabel uniqueArrangeLabel, groupSizeLabel, totalObjectsLabel;
    private JButton increaseGroupButton, decreaseGroupButton, increaseObjectsButton, decreaseObjectsButton;
    private JPanel centerPanel, southPanel, northPanel;
    
    /**
     * Constructor for objects of class CrapsGUI
     */
    public ArrangementsGUI()
    {  
       
       setLayout(new BorderLayout());
       
       
       increaseGroupButton = new JButton("More");
       decreaseGroupButton = new JButton("Less");
       increaseObjectsButton = new JButton("More");
       decreaseObjectsButton = new JButton("Less");
       
       
       uniqueArrangeLabel = new JLabel("Unique Arrangements = 30240");
       groupSizeLabel = new JLabel("Group Size (k) = 5");
       totalObjectsLabel = new JLabel("Total Objects (n) = 10");
       
       ButtonListener Listener = new ButtonListener();
       increaseGroupButton.addActionListener(Listener);
       decreaseGroupButton.addActionListener(Listener);
       increaseObjectsButton.addActionListener(Listener);
       decreaseObjectsButton.addActionListener(Listener);
       
       northPanel = new JPanel();
       northPanel.add(totalObjectsLabel);
       northPanel.add(increaseObjectsButton);
       northPanel.add(decreaseObjectsButton);
       
       centerPanel = new JPanel();
       centerPanel.add(groupSizeLabel);
       centerPanel.add(increaseGroupButton);
       centerPanel.add(decreaseGroupButton);
       
       add(northPanel, BorderLayout.NORTH);
       add(centerPanel, BorderLayout.CENTER);
       add(uniqueArrangeLabel, BorderLayout.SOUTH);

       setPreferredSize(new Dimension(350, 100));
    }//end of constructor


    /**
     * Private Listener Class.
     */
    private class ButtonListener implements ActionListener
    {
        private int groupSize = 5;
        private int totalObjects = 10;
        
        public void actionPerformed(ActionEvent event)
        {  
    
            if(event.getSource() == increaseObjectsButton)
            {
                totalObjects++;
                totalObjectsLabel.setText("Total Objects (n) = " + totalObjects);
                calculate_display();
            }
    
            if(event.getSource() == decreaseObjectsButton)
            {
                totalObjects--;
                totalObjectsLabel.setText("Total Objects = (n) " + totalObjects);
                calculate_display();
            }
            
            if(event.getSource() == increaseGroupButton)
            {
                groupSize++;
                groupSizeLabel.setText("Group Size (k) = " + groupSize);
                calculate_display();
            }
            
            if(event.getSource() == decreaseGroupButton)
            {
                groupSize--;
                groupSizeLabel.setText("Group Size (k) = " + groupSize);
                calculate_display();
            }
                
      
        }//end buttonClicked method
        
        private void calculate_display()
        {
                boolean proceed = true;
                
                if(groupSize < 1) {
                    uniqueArrangeLabel.setText("Group Size must be at least 1");
                    proceed = false;
                }
    
                if(totalObjects < 1) {
                    uniqueArrangeLabel.setText("Total Objects must be at least 1");
                    proceed = false;
                }
                    
                if(groupSize > totalObjects){
                    uniqueArrangeLabel.setText("Group Size not exceed Total Objects");
                    proceed = false;
                }
             
                if(proceed){
                   long numArrang = UniqueArrangements.arrangements(totalObjects, groupSize);
                   uniqueArrangeLabel.setText("Unique Arrangements = " + numArrang);
                }
        }
    
    }//end innter class
}//end of class

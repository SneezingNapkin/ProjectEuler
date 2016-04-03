/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import javax.swing.*; //This holds information for us to bring up a window
import java.awt.*; //This holds information on the layout
import java.awt.event.*; //This holds information on listening for inputs

/**
 * The ProjectEuler class implements an application that helps solve and 
 * represents each problem in https://projecteuler.net/ visually.
 * 
 * @author Sandbox
 */
public class ProjectEuler extends JFrame {
    /* JFrame is found in javax.swing. We need to extend our class to include
    bits found in that class in order to create a window frame.
    
    Some guides say that we need to add "implements ActionListener" - without this our mouse
    clicks or other inputs will not be listened to. This is only done in certain
    circumstances. We would need to add the following code in the "public ProjectEuler()" section:
        public void actionPerformed(ActionEvent e){
        //stuff we want the button to do
        }
    But since we included a "new ActionListener()" in calling the button itself
    we do not need to add this. I'm not sure exactly how this works.
    */
    
    // These need to be set outside of ProjectEuler(). Not sure why:
    TextField textTest = new TextField(20); // This is where the answer will appear.
    
    public ProjectEuler(){
        super ("Project Euler Solutions"); // Title of the window.
        setLookAndFeel(); // Needed to customize appearance of the window.
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout insideLayout = new FlowLayout(); // Layout Manager
        /* This is found in java.awt. It is the bit that decides how the
        contents inside the window will be arranged (buttons, etc).
        But it is only a manager. It needs to be put inside a layout method to
        actually set the layout. */
        
        /* Once we created the layout manager we need to call the window's
        method that sets the layout. This will associate the manager with 
        the window. */
        setLayout(insideLayout); //setting the layout for the contents.

        //Adding buttons to the window:
        JButton button1 = new JButton("Problem 1");
        JButton button2 = new JButton("Problem 2");
        
        add(button1);
        add(button2);
        add(textTest);

        setVisible(true); // Makes the window visible.
        /* It has to be put at the end of all the variables we are creating here
        or some things will not show up. (The variables that are written after it)
        */
        
        // Here we create the event listener for each button: 
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            textTest.setText("Answer to Problem 1");
            }
        });
        
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            textTest.setText("Answer to Problem 2");
            }
        });
        
    }
    
    // This is where we say what the window looks like:
    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
                    //Other looks for the window:
                    //"com.sun.java.swing.plaf.gtk.GTKLookAndFeel"
                    //"com.sun.java.swing.plaf.motif.MotifLookAndFeel"
                    //"com.sun.java.swing.plaf.windows.WindowsLookAndFeel"
            );
        }
        catch (Exception exc) {
            // ignore error
        }
    }
    
    public static void main(String[] args) {
       /*Here I want to add code that would start an app with buttons and
        Questions. When you click on a question the correct class is called
        and you are taken to the answer.
        */
        ProjectEuler frame = new ProjectEuler();
        
        Problem1 button1 = new Problem1();
        button1.Solve();
                
        Problem2 button2 = new Problem2();
        button2.Solve();
        
        Problem3 button3 = new Problem3();
        button3.Solve();
        
        Problem4 button4 = new Problem4();
        button4.Solve();
    }
}
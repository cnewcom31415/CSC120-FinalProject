package graphics_stuff;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class GameGUI {

    /**
     * This will create the window and show the game image
     */
    public void createAndShow(){
        //Makes a prettier window when true
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Our window in question
        JFrame frame = new JFrame("Game Viewer");

        //Lets us exit on close
        try {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {
        }

        //The content pane is where all the image content is stored I think
        // the layout is how the things are displayed. Right now, its in order
        // of what gets added. I'm not sure what happens when more than 2 things are added to this grid
        frame.getContentPane().setLayout(new GridLayout(2,1)); //new FlowLayout()

        //This is the ocean layer. It is blue, 50 pixels tall, 100 pixels wide, and starts at
        // the 0,0 point of the grid spot it is on
        Layer ocean = new Layer0Object(Color.BLUE,50,100,0,0);

        //Similar story here with beach, it starts at the 0,0 part of the grid it is on, which is the
        // lower one. Thats why, when you move the window around, it moves away from the blue
        Layer beach = new Layer0Object(Color.YELLOW,50,100,0,0);

        // Actually calls what makes the viewer object. the 0,0 here is where we start in terms of 
        //where we are viewing the object from (see the viewer class pls for more explaination)
        GameViewer oceanView = new GameViewer(ocean, 2, 100, 50, 0, 0);

        GameViewer beachView = new GameViewer(beach, 2, 100, 50, 50, 0);

        //Adds the two objects, order does matter. You can do frame.getContentPane().add(oceanView,0);
        // to put something first
        frame.getContentPane().add(oceanView);
        frame.getContentPane().add(beachView);

        //sets the window to the ideal viewing size that the viewers specify (omg they add automatically)
        frame.pack();
        //allows the window to be visible
        frame.setVisible(true);

        
    }

    public static void main(String[] args) {
        GameGUI gui = new GameGUI();

        try {
           javax.swing.SwingUtilities.invokeAndWait(new Runnable() {
            public void run(){
                gui.createAndShow();
            }
           }); 
        } catch (Exception e) {
            System.out.println("Couldn't create GUI.");
            System.out.println(e.getMessage());
            System.exit(-1);
        }
    }
    
}

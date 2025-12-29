package graphics_stuff;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JComponent;


public class GameViewer extends JComponent{

    private Layer layerData;
    private int unit; //is needed for me? idk
    private Dimension viewSize;
    //private int viewOfImageW; //basically, the width and height of what we see of the image
    //private int viewOfImageH; // say the image is 200 pixels across and down, but we only want to see
                            // a 50x50, those 50's would go here

    //private int xOrigin; //where we start that 50x50 square, if irc, thats in the upper left of the 50x50
    //private int yOrigin;

    private Point viewOrigin;

    /**
     * 
     * @param data Layer Data
     * @param unit Unit data?
    * @param width Width of what we see of the whole image (50x50 of a 200x200, 50 goes here)
     * @param height Height of what we see of the whole image
     * @param x0 where the 50x50 starts
     * @param y0 where the 50x50 starts
     */
    public GameViewer(Layer data, int unit, int width, int height, int x0, int y0){
        super();
        this.layerData = data;
        this.unit = unit;
        this.viewSize = new Dimension(width,height);
        this.viewOrigin = new Point(x0,y0);
        this.setPreferredSize(viewSize);
        this.setMinimumSize(viewSize);
    }

    @Override
    public void paintComponent(Graphics g){
        layerData.makeImage(g);
    }
    
}

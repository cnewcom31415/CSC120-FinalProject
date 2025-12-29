package graphics_stuff;


import java.awt.Color;
import java.awt.Graphics;

/**
 * Instances of this class will hold information about the color, height, and width of each
 * object in a layer. You are not meant to create instances of this class specifically, but 
 * rather, instances of Layer0, Layer1, and Layer2. Layer0 is background, Layer1 is immovable
 * objects that can be interacted with, Layer2 is animated objects that can move
 */
public abstract class Layer {
    protected Color bgColor;
    //bgColor will actually be a background image, I think

    protected int pixH;

    protected int pixW;

    public Layer(Color bg, int pixH, int pixW){
        this.bgColor = bg;
        this.pixH = pixH;
        this.pixW = pixW;
    }

    public Color getbgColor(){
        return this.bgColor;
    }

    public void setbgColor(Color newColor){
        this.bgColor = newColor;
    }

    public int getpixH(){
        return this.pixH;
    }

    public void setpixH(int newH){
        this.pixH= newH;
    }

    public int getpixW(){
        return this.pixW;
    }

    public void setpixW(int newW){
        this.pixW= newW;
    }

    public abstract void makeImage(Graphics g);

}

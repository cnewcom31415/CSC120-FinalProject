package graphics_stuff;

import java.awt.Graphics;

import java.awt.Color;

public class Layer0Object extends Layer{
    
    public int x;
    public int y;

    public Layer0Object(Color bg, int pixH, int pixW, int x, int y){
        super(bg,pixH,pixW);
        this.x=x;
        this.y=y;
    }

    public void makeImage(Graphics g){
        g.setColor(bgColor);
        g.fillRect(this.x, this.y, this.pixW, this.pixH);
        
    }

   



}

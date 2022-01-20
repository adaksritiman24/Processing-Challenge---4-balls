import processing.core.PApplet;

class Ball{

    private int speed;
    private int xPosition;
    private int yPosition;
    private int diameter;
    private PApplet canvas;

    Ball(PApplet canvas, int speed, int diameter,int xPosition, int yPosition){
        this.speed = speed;
        this.canvas = canvas;
        this.diameter = diameter;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void move(){
        this.xPosition += this.speed;
        this.drawCircle();
    }

    private void drawCircle(){
        canvas.ellipse(xPosition,yPosition, diameter, diameter);
    }
}

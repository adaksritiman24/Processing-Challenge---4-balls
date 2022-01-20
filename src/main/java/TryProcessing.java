import processing.core.PApplet;

public class TryProcessing extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int BASE = 5;
    public int totalBalls;
    int x = 0;
    static int [] xpositions;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }


    @Override
    public void setup() {
        setBalls(4);
    }

    @Override
    public void draw() {
        drawAllBalls(totalBalls);
    }

    private void setBalls(int numberOfBalls){
        totalBalls = numberOfBalls;
        BASE = numberOfBalls + 1;
        xpositions = new int[numberOfBalls];
    }

    private void drawAllBalls(int number) {
        for (int ballNo = 1; ballNo <= number; ballNo++) {
            drawBall(ballNo);
        }
    }


    private void drawBall(int number){
        ellipse(xpositions[number - 1], (HEIGHT* number) / BASE,DIAMETER, DIAMETER);
        xpositions[number - 1] += number;
    }

}

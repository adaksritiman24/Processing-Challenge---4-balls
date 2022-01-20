import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class TryProcessingOOP extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static int BASE;
    List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main("TryProcessingOOP", args);

    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        this.setUpBalls(4);
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.move());
    }

    private void setUpBalls(int numberOfBalls){
        balls = new ArrayList<Ball>();
        BASE = numberOfBalls + 1;
        for (int ballNo = 1; ballNo <= numberOfBalls ; ballNo++) {
            balls.add(
                    new Ball(this, ballNo, 10, 0, (HEIGHT*ballNo)/BASE)
            );
        }
    }
}

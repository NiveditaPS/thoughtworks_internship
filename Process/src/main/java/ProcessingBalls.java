import processing.core.PApplet;
public class ProcessingBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    private int SPEED1 = 1;
    private int SPEED2 = 2;
    private int SPEED3 = 3;
    private int SPEED4 = 4;
    public static final int DIAMETER = 50;
    private float xCoordinate;

    public static void main(String[] args) {
        PApplet.main("ProcessingBalls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {

        ellipse(SPEED1 ,HEIGHT*1/5,DIAMETER,DIAMETER);
        ellipse(SPEED2 ,HEIGHT*2/5,DIAMETER,DIAMETER);
        ellipse(SPEED3 ,HEIGHT*3/5,DIAMETER,DIAMETER);
        ellipse(SPEED4 ,HEIGHT*4/5,DIAMETER,DIAMETER);
        SPEED1++;
        SPEED2 +=2;
        SPEED3 +=3;
        SPEED4 +=4;
    }
}

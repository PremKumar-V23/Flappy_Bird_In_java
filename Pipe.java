import java.awt.Image;

public class Pipe {
    int x;
    int y;
    int width;
    int height;
    Image img;
    boolean passed;

    public Pipe(int x, int y, int width, int height, Image img) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.img = img;
        this.passed = false;
    }

    public void move(int velocityX) {
        x += velocityX;
    }

    public boolean isOffScreen() {
        return x + width < 0;
    }
}


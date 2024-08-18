import java.awt.Image;

public class Bird {
    int x;
    int y;
    int width;
    int height;
    Image img;

    public Bird(int x, int y, int width, int height, Image img) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.img = img;
    }

    public void move(int velocityY, int gravity) {
        velocityY += gravity;
        y += velocityY;
        y = Math.max(y, 0);
    }
}

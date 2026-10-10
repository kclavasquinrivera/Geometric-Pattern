import org.code.theater.*;
import org.code.media.*;

class SmallTriangle extends Shape {
  
    int base, height;
    int x, y;

    SmallTriangle(int x, int y, int base, int height, double angle) {
      
        super(x, y, angle);
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
      
    }

    @Override
    void draw(Scene scene) {
      
        int[] p1 = Utils.rotatePoint(x, y, x - base / 2, y - height, angle);
        int[] p2 = Utils.rotatePoint(x, y, x + base / 2, y - height, angle);
      
        scene.drawLine(x, y, p1[0], p1[1]);
        scene.drawLine(x, y, p2[0], p2[1]);
        scene.drawLine(p1[0], p1[1], p2[0], p2[1]);
      
    }
}

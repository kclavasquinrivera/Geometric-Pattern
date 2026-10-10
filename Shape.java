import org.code.theater.*;
import java.util.ArrayList;

abstract class Shape {
  
    int cx, cy;
    double angle;

    Shape(int cx, int cy, double angle) {
      
        this.cx = cx;
        this.cy = cy;
        this.angle = angle;
      
    }

    abstract void draw(Scene scene);
  
}

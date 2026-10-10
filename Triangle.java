import org.code.theater.*;
import org.code.media.*;

class Triangle extends Shape {
  
    int radius, baseHalf, height;

    Triangle(int cx, int cy, int radius, int baseHalf, int height, double angle) {
      
        super(cx, cy, angle);
      
        this.radius = radius;
        this.baseHalf = baseHalf;
        this.height = height;
      
    }

    @Override
    void draw(Scene scene) {
      
        int xTop = cx;
        int yTop = cy - radius;
        int xLeft = cx - baseHalf;
        int yLeft = cy - radius + height;
        int xRight = cx + baseHalf;
        int yRight = cy - radius + height;

        int[] rTop = Utils.rotatePoint(cx, cy, xTop, yTop, angle);
        int[] rLeft = Utils.rotatePoint(cx, cy, xLeft, yLeft, angle);
        int[] rRight = Utils.rotatePoint(cx, cy, xRight, yRight, angle);

        scene.drawLine(rTop[0], rTop[1], rLeft[0], rLeft[1]);
        scene.drawLine(rLeft[0], rLeft[1], rRight[0], rRight[1]);
        scene.drawLine(rRight[0], rRight[1], rTop[0], rTop[1]);
      
    }
}

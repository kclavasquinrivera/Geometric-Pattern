import org.code.theater.*;
import org.code.media.*;
import java.util.ArrayList;

class CirclePattern {
  
    int cx, cy, radius;
    int baseHalf, height, smallBase, smallHeight;
    int rotations;
    int currentStep;

    CirclePattern(int cx, int cy, int radius, int baseHalf, int height, int smallBase, int smallHeight, int rotations) {
      
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.baseHalf = baseHalf;
        this.height = height;
        this.smallBase = smallBase;
        this.smallHeight = smallHeight;
        this.rotations = rotations;
        this.currentStep = 0;
      
    }

    void draw(Scene scene) {
      
        double angleStep = Math.toRadians(360.0 / rotations);

        for (int i = 0; i <= currentStep && i < rotations; i++) {
            double angle = i * angleStep;

            Triangle t = new Triangle(cx, cy, radius, baseHalf, height, angle);
            t.draw(scene);

            int[] top = Utils.rotatePoint(cx, cy, cx, cy - radius, angle);
          
            SmallTriangle st = new SmallTriangle(top[0], top[1], smallBase, smallHeight, angle);
            st.draw(scene);
          
        }

        if (currentStep < rotations) currentStep++;
      
    }
}

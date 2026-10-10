import org.code.theater.Scene;
import org.code.theater.Theater;
import java.util.ArrayList;

public class MyConsole {
  
    public static void main(String[] args) {
      
        Scene scene = new Scene();
      
        scene.clear("white");
        scene.setStrokeColor("black");
      
        scene.setStrokeWidth(1.0);

        int cx = 200, cy = 200;

        CirclePattern c1 = new CirclePattern(cx, cy, 80, 50, 90, 60, 70, 90);
        CirclePattern c2 = new CirclePattern(cx, cy, 130, 50, 90, 60, 70, 90);
        CirclePattern c3 = new CirclePattern(cx, cy, 180, 50, 90, 60, 70, 90);

        for (int frame = 0; frame < 100; frame++) {
          
            scene.clear("white");

            c1.draw(scene);
            c2.draw(scene);
            c3.draw(scene);

            scene.pause(0.03);
          
        }

        Theater.playScenes(scene);
    }
}

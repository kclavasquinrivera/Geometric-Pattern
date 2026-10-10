import org.code.theater.*;
import org.code.media.*;

class Utils {
  
    public static int[] rotatePoint(int cx, int cy, int px, int py, double angle) {
      
        int[] r = new int[2];
      
        r[0] = cx + (int)((px-cx)*Math.cos(angle) - (py-cy)*Math.sin(angle));
        r[1] = cy + (int)((px-cx)*Math.sin(angle) + (py-cy)*Math.cos(angle));
      
        return r;
      
    }
}

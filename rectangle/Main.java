package rectangle;
import rectangle.beans.Rectangle;
public class Main {
    public static void main(String[] args) {
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();

        rec1.setLength(12);
        rec1.setWidth(14);
        System.out.println(rec1.toString());
        System.out.println(rec2.toString());
        
    }
    
}

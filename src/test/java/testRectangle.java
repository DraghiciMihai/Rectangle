import com.sda.rectangle.Rectangle;
import org.junit.Test;

public class testRectangle {
    @Test
    public void testRectangle(){
        Rectangle dreptunghi = new Rectangle(2,4);
        System.out.println(dreptunghi.getArea());
        System.out.println(dreptunghi.getPerimeter());
    }
}
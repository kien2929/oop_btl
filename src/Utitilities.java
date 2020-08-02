import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
class Utitilities {
    public static JFrame findJFrameOf(Component component) {
        Container c = component.getParent();
        while (c.getParent() != null) {
            c = c.getParent();
        }
        if (c instanceof JFrame) {
            return (JFrame) c;
        }
        return null;
    }
}

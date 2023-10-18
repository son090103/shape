
import controller.CaculateManager;
import model.Circle;
import model.Rectangle;
import model.Triangle;


public class Main {
    public static void main(String[] args) {
        String title = "=====Calculator Shape Program=====";
        String[] s = new String[]{"Calculate and Display", "Exit"};

        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Rectangle rec = new Rectangle();

        
        CaculateManager manager = new CaculateManager(title, s, triangle, circle);
        manager.run();
    }
}

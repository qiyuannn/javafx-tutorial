import javafx.application.Application;

/**
 * Launches the JavaFX application, working around JavaFX classpath handling.
 */
public class Launcher {
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}

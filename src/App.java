import controller.MainController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController mainController =new MainController();
        Scene scene =new Scene(mainController.getMainPanel(), 400, 300);
        stage.setScene(scene);
        stage.show();
    }

}

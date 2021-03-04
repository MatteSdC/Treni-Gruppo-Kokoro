import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // TODO Auto-generated method stub
        Pane root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scena = new Scene(root);
        stage.setScene(scena);
        stage.show();
    }
}
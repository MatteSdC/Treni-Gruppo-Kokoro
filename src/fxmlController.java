import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class fxmlController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private BarChart<Treni, Passeggeri> barChart;

    @FXML
    private CategoryAxis asseX;

    @FXML
    private NumberAxis asseY;

    @FXML
    void initialize() {
        assert barChart != null : "fx:id=\"barChart\" was not injected: check your FXML file 'Untitled'.";
        assert asseX != null : "fx:id=\"asseX\" was not injected: check your FXML file 'Untitled'.";
        assert asseY != null : "fx:id=\"asseY\" was not injected: check your FXML file 'Untitled'.";

    }
}

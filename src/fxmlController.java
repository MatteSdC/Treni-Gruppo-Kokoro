import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tab;

public class fxmlController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Tab tabTreno;

    @FXML
    private BarChart<Train, Passenger> barChart;

    @FXML
    private CategoryAxis axisPassenger;

    @FXML
    private NumberAxis axisTrain;

    @FXML
    private Label lblScelta;

    @FXML
    private CheckBox cbBlu;

    @FXML
    private CheckBox cbGreen;

    @FXML
    private CheckBox cbRed;

    @FXML
    private Tab tabPasseggero;

    @FXML
    private ProgressBar pbTrainA;

    @FXML
    private ProgressBar pbTrainB;

    @FXML
    private Label lblTrainA;

    @FXML
    private Label lblTrainB;

    @FXML
    private ListView<Train> listViewTrain;

    @FXML
    private ListView<Passenger> listViewPassenger;

    @FXML
    private Label lblListTrain;

    @FXML
    private Label lblListPassenger;

    @FXML
    void initialize() {
        assert tabTreno != null : "fx:id=\"tabTreno\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert barChart != null : "fx:id=\"barChart\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert axisPassenger != null
                : "fx:id=\"axisPassenger\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert axisTrain != null : "fx:id=\"axisTrain\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblScelta != null : "fx:id=\"lblScelta\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert cbBlu != null : "fx:id=\"cbBlu\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert cbGreen != null : "fx:id=\"cbGreen\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert cbRed != null : "fx:id=\"cbRed\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert tabPasseggero != null
                : "fx:id=\"tabPasseggero\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert pbTrainA != null : "fx:id=\"pbTrainA\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert pbTrainB != null : "fx:id=\"pbTrainB\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblTrainA != null : "fx:id=\"lblTrainA\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblTrainB != null : "fx:id=\"lblTrainB\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert listViewTrain != null
                : "fx:id=\"listViewTrain\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert listViewPassenger != null
                : "fx:id=\"listViewPassenger\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblListTrain != null
                : "fx:id=\"lblListTrain\" was not injected: check your FXML file 'FXMLDocument.fxml'.";
        assert lblListPassenger != null
                : "fx:id=\"lblListPassenger\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
}

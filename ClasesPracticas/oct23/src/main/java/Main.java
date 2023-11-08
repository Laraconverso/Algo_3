import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    Button postear;
    @FXML
    TextField input;

    @Override
    public void start(Stage stage) throws Exception {
        var loader = new FXMLLoader(getClass().getResource("ventana.fxml"));
        loader.setController(this);
        VBox ventana = loader.load();

        postear.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                var label = new Label(input.getText());
                ventana.getChildren().add(label);
            }
        });

        var scene = new Scene(ventana, 640, 480);
        stage.setScene(scene);

        var canvas = new Canvas(200, 200);
        var gc = canvas.getGraphicsContext2D();
        gc.setFill(Color.RED);
        gc.fillRect(10, 10, 40, 80);
        gc.setFill(Color.BLUE);
        gc.fillText("Hola", 120, 120);
        ventana.getChildren().add(canvas);

        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                ventana.fireEvent(new MiEvento(42));
            }
        });

        ventana.addEventHandler(MiEvento.MI_EVENTO, new EventHandler<MiEvento>() {
            @Override
            public void handle(MiEvento miEvento) {
            }
        });

        stage.show();
    }
}

class MiEvento extends Event {
    int x;
    public static EventType<MiEvento> MI_EVENTO = new EventType<>("MiEvento");

    public MiEvento(int x) {
        super(MI_EVENTO);
        this.x = x;
    }
}
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class Impro extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        var ventana = new VBox();
        var input = new TextField();
        var btn = new Button("Postear msj");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                var label = new Label(input.getText());
                ventana.getChildren().add(label);
            }
        });
       //ver codigo clase 23.10.23
    }
}

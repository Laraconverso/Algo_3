import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {

    public void start(Stage stage) throws Exception {
        var label = new Label("Hola mundo!");
        var btn = new Button("click");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("Click boton");
//            }
//        });//new Observer());
        btn.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Click boton");
            }
        });
        var scene = new Scene(new VBox(label, btn), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

}

//class Observer implements EventHandler<ActionEvent>{
//
//    @Override
//    public void handle(ActionEvent actionEvent) {
//        System.out.println("Holaaa estas haciendo click");
//    }
//}
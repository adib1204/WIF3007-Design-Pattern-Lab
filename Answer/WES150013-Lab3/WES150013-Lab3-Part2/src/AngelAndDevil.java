import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AngelAndDevil extends Application {
    
    Stage window;
    Button button;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Angel and Devil");        
        button = new Button("Should I do it?");
        
        //Ni Layout
        VBox root = new VBox();
        root.getChildren().add(button);
        root.setPadding(new Insets(10, 50, 50, 100));
        
        Scene scene = new Scene(root, 300, 250);
        
        //Ni observer/EventListener
        button.setOnAction((e) ->{
            Text text1 = new Text ("Come on, do it");
            Text text2 = new Text("Don't do it, you might regret it");
            root.getChildren().addAll(text1,text2);
        });

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

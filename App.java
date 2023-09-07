import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

public class App extends Application{
    
    public void start(Stage stage){

        //Label for Name.
        Label label_Name = new Label("Name:");

        //Text Field for Name.
        TextField textField_Name = new TextField();

        //Label for DOB.
        Label label_DOB = new Label("Date of Birth:");

        //Date Picker for DOB.
        DatePicker datePicker_DOB = new DatePicker();

        //Label for Gender.
        Label label_Gender = new Label("Gender:");

        //Toggle group of radio button.
        ToggleGroup toggleGroup_Gender = new ToggleGroup();
        RadioButton maleRadioButton = new RadioButton("Male");
        maleRadioButton.setToggleGroup(toggleGroup_Gender);
        RadioButton femaleRadioButton = new RadioButton("Female");
        femaleRadioButton.setToggleGroup(toggleGroup_Gender);

        //Label for Hobby.
        Label label_Hobby = new Label("Hobby:");

        //Check box for Hobby.
        CheckBox checkBox_reading = new CheckBox("Reading");
        checkBox_reading.setIndeterminate(false);
        CheckBox checkBox_playing = new CheckBox("Playing");
        checkBox_playing.setIndeterminate(false);
        CheckBox checkBox_Travelling = new CheckBox("Travelling");
        checkBox_Travelling.setIndeterminate(false);

        //Label for City.
        Label label_Country = new Label("Country:");

        //List view for Country.
        ListView listView_Country = new ListView();
        ObservableList data = FXCollections.observableArrayList();
        data.addAll("INDIA", "USA", "UK", "CHINA", "CANADA", "PAKISTAN");
        listView_Country.setItems(data);
        listView_Country.setPrefSize(100, 100);

        //Label for Interest.
        Label label_Intereset = new Label("Interest:");

        //Choice Box for Interest.
        ChoiceBox choiceBox_Interest = new ChoiceBox();
        choiceBox_Interest.getItems().addAll(
            "Study", "Business", "Marketing", "Reserch and Devlopement"
        );

        //Button for Register.
        Button button_Register = new Button("*** Register ***");

        //Creating a Grid Pane;
        GridPane gridPane = new GridPane();

        //Setting size for Grid Pane.
        gridPane.setMinSize(500, 500);

        //Setting the padding.
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns.
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        //Setting the grid alignment.
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid.
        gridPane.add(label_Name, 0, 0);
        gridPane.add(textField_Name, 1, 0);

        gridPane.add(label_DOB, 0, 1);
        gridPane.add(datePicker_DOB, 1, 1);

        gridPane.add(label_Gender, 0, 2);
        gridPane.add(maleRadioButton, 1, 2);
        gridPane.add(femaleRadioButton, 2, 2);

        gridPane.add(label_Hobby, 0, 3);
        gridPane.add(checkBox_reading, 1, 3);
        gridPane.add(checkBox_playing, 2, 3);
        gridPane.add(checkBox_Travelling, 3, 3);

        gridPane.add(label_Country, 0, 4);
        gridPane.add(listView_Country, 1, 4);

        gridPane.add(label_Intereset, 0, 5);
        gridPane.add(choiceBox_Interest, 1, 5);

        //Logic for space.
        gridPane.add(new Label("                                "), 0, 6);
 
        gridPane.add(button_Register, 1, 7);

        //Styling nodes.
        label_Name.setStyle("-fx-font:normal bold 15px 'serif' ");
        label_DOB.setStyle("-fx-font:normal bold 15px 'serif' ");
        label_Gender.setStyle("-fx-font:normal bold 15px 'serif' ");
        label_Hobby.setStyle("-fx-font:normal bold 15px 'serif' ");
        label_Country.setStyle("-fx-font:normal bold 15px 'serif' ");
        label_Intereset.setStyle("-fx-font:normal bold 15px 'serif' ");
        button_Register.setStyle("-fx-background-color:blue;-fx-text-fill:white");

        //Setting the background color.
        gridPane.setStyle("-fx-background-color:BEIGE");

        //Creating a scene object.
        Scene scene = new Scene(gridPane);

        //Setting the title of stage.
        stage.setTitle("REGISTRATION FORM");

        //Adding scene to the stage.
        stage.setScene(scene);

        //Displaying the contents of the stage.
        stage.show();

    } 

    public static void main(String[] args) {
        launch(args);
    }
}
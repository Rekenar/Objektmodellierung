package main.java.views;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import main.java.logic.GameLogic;
import main.java.logic.algorithms.AlgorithmRegistry;
import main.java.logic.entities.Location;

public class AlgorithmView implements PaneProvider {

    private ObservableList<Location> locations;
    private ObservableList<String> algorithms;
    private HBox controlBox = new HBox();
    private ListView listView = new ListView();
    private ComboBox<String> algorithmsComboBox= new ComboBox();;
    private Location currentLocation;

    public AlgorithmView() {

        refreshLists();
        //Use HBOX layout panes to space out the controls
        //in a single row
        HBox comboBox = new HBox();
        HBox listBox = new HBox();


        //An Observable list to populate the ListView with items
        locations = FXCollections.observableArrayList(GameLogic.getInstance().getLocations());

        //Set the width of the ListView to be 100 pixels
        listView.setPrefWidth(100);

        //Allow multiple selections from the Listview
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        //Create a naming label to highlight the selected item from the ListView
        Label listLabel = new Label("Selected Algorithm: ");

        //Create a label to hold the value of the selected item of the ListView
        final Label listSelection = new Label();
        listSelection.setPrefWidth(200);

        //Set up a changelistener to listen for the items being selected in the ListView
        listView.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener() {
                    @Override
                    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                        currentLocation = (Location) newValue;
                        algorithmsComboBox.getSelectionModel().select(currentLocation.getAlgorithm().getName());
                    }
                });

        //Add the ListView and two labels to the HBOX layout pane
        listBox.getChildren().add(listView);
        listBox.getChildren().add(listLabel);
        listBox.getChildren().add(listSelection);


        //Create a label to hold the value of the selected option of the ComboBox
        final Label comboSelection = new Label();
        algorithmsComboBox.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> currentLocation.setAlgorithm(AlgorithmRegistry.getInstance().getAlgorithmInstanceByName(newValue)));


        //Add the ComboBox and two labels to the HBOX layout pane
        comboBox.getChildren().add(algorithmsComboBox);
        comboBox.getChildren().add(comboSelection);

        //Add the two HBOXes to another HBOX to space out the controls
        controlBox.getChildren().add(listBox);
        controlBox.getChildren().add(comboBox);
    }

    /**
     * Refreshes the content of the ListView
     */
    private void refreshLists() {
        locations = FXCollections.observableArrayList(
                GameLogic.getInstance().getLocations()
        );

        listView.setItems(locations);

        algorithms = FXCollections.observableArrayList(
               GameLogic.getInstance().getAlgorithms()
        );

        algorithmsComboBox.setItems(algorithms);
    }

    @Override
    public Pane getPane() {
        refreshLists();
        return controlBox;
    }
}
package main.java.views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Callback;
import main.java.logic.GameLogic;
import main.java.logic.entities.Location;
import main.java.Game;
import main.java.logic.entities.Order;

public class OrdersView implements PaneProvider {

    private javafx.scene.control.TableView<Order> table = new javafx.scene.control.TableView<>();
    private HBox hb = new HBox();
    private VBox vbox = new VBox();
    private ObservableList<Order> orders;
    private ObservableList<Location> locations;
    private ComboBox originCombobox = new ComboBox(locations);
    private ComboBox targetCombobox = new ComboBox(locations);


    public OrdersView() {

        refreshLists();


        //Label
        final Label label = new Label("Orders Table");
        label.setFont(new Font("Arial", 22));


        //Table
        table.setEditable(true);

        TableColumn originCol = new TableColumn("Origin");
        originCol.setMinWidth(100);
        originCol.setCellValueFactory((Callback<TableColumn.CellDataFeatures<Order, String>, ObservableValue<String>>) c -> new SimpleStringProperty(c.getValue().getOriginLocation().toString()));

        TableColumn targetCol = new TableColumn("Target");
        targetCol.setMinWidth(100);
        targetCol.setCellValueFactory((Callback<TableColumn.CellDataFeatures<Order, String>, ObservableValue<String>>) c -> new SimpleStringProperty(c.getValue().getTargetLocation().toString()));

        TableColumn resCol = new TableColumn("Resource");
        resCol.setMinWidth(100);
        resCol.setCellValueFactory(
                new PropertyValueFactory<>("resource"));

        TableColumn quantityCol = new TableColumn("Quantity");
        quantityCol.setMinWidth(200);
        quantityCol.setCellValueFactory(
                new PropertyValueFactory<>("quantity"));

        table.setItems(orders);
        table.getColumns().addAll(originCol, targetCol, resCol, quantityCol);

        final TextField resourceTextField = new TextField();
        resourceTextField.setPromptText("Resource");
        resourceTextField.setMaxWidth(resCol.getPrefWidth());

        final TextField quantityTextField = new TextField();
        quantityTextField.setPromptText("Quantity");
        quantityTextField.setMaxWidth(quantityCol.getPrefWidth());

        final Button addButton = new Button("Add");
        addButton.setOnAction((ActionEvent e) -> {
            ((Location) originCombobox.getValue()).addOrder(new Order((Location) originCombobox.getValue(), (Location) targetCombobox.getValue(), resourceTextField.getText(), Integer.parseInt(quantityTextField.getText())));
            refreshLists();
        });

        final Button removeButton = new Button("Remove");
        removeButton.setOnAction((ActionEvent e) -> {
            Order selectedItem = table.getSelectionModel().getSelectedItem();
            System.out.println(selectedItem);
            selectedItem.getOriginLocation().removeOrder(selectedItem);
            refreshLists();
        });

        //Setting preferred widths

        double originAndTargetWidth = Game.WINDOWWIDTH / 5;
        originCol.setPrefWidth(originAndTargetWidth);
        targetCol.setPrefWidth(originAndTargetWidth);
        originCombobox.setPrefWidth(originAndTargetWidth);
        targetCombobox.setPrefWidth(originAndTargetWidth);

        resCol.setPrefWidth(200);
        resourceTextField.setPrefWidth(200);
        quantityCol.setPrefWidth(100);
        quantityTextField.setPrefWidth(100);

        hb.getChildren().addAll(originCombobox, targetCombobox, resourceTextField, quantityTextField, addButton, removeButton);
        hb.setSpacing(3);
        table.setPrefWidth(Game.WINDOWWIDTH);

        vbox.getChildren().addAll(label, table, hb);
    }




    /**
     * Refreshes the content of the comboboxes as well as the table
     */
    private void refreshLists() {
        locations = FXCollections.observableArrayList(
                GameLogic.getInstance().getLocations()
        );
        orders = FXCollections.observableArrayList(
                GameLogic.getInstance().getOrders()
        );
        table.setItems(orders);
        originCombobox.setItems(locations);
        targetCombobox.setItems(locations);
    }

    @Override
    public Pane getPane() {
        refreshLists();
        return vbox;
    }
}
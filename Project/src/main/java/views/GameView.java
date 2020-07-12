package main.java.views;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import main.java.Game;
import main.java.logic.GameLogic;

public class GameView implements PaneProvider {
    private Canvas canvas;
    private VBox vbox = new VBox();

    public GameView() {

        canvas = new Canvas(Game.WINDOWWIDTH, Game.WINDOWHIGHT);

        vbox.getChildren().addAll(canvas);

        ContextMenu contextMenu = new ContextMenu();

        //This is how the GUI currently makes it possible to add new Locations in the GUI
        //The text of the Menuitem has to be the exact String that provided waitForSpawnLocation() and later on given to the Factory.
        //TODO: Make it that these contextMenu items don't have to be put in manually. They should not be defined in this package but in the logic.
        contextMenu.getItems().addAll(new MenuItem("LocationName1"));
        contextMenu.getItems().addAll(new MenuItem("LocationName2"));
        contextMenu.getItems().addAll(new MenuItem("LocationName3"));
        contextMenu.setOnAction((event) -> {
            GameLogic.getInstance().waitForSpawnLocation(((MenuItem) event.getTarget()).getText());
        });

        //Event Handlers and Listeners
        canvas.setOnMouseClicked(event -> {
            GameLogic.getInstance().mouseClick(event);
            canvas.setOnContextMenuRequested(e -> contextMenu.show(canvas, e.getScreenX(), e.getScreenY()));


        });

    }

    public Canvas getCanvas() {
        return canvas;
    }

    @Override
    public Pane getPane() {
        return vbox;
    }
}

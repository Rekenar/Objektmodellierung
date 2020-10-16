package main.java;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import main.java.animation.DrawableObjectsComposite;
import main.java.logic.GameLogic;
import main.java.views.GameView;
import main.java.views.OrdersView;
import main.java.views.AlgorithmView;

public class Game extends Application {

    public static final double WINDOWWIDTH = 1080; //TODO CHANGE THESE AT WILL
    public static final double WINDOWHIGHT = 720; //TODO CHANGE THESE AT WILL
    public static DrawableObjectsComposite doc = new DrawableObjectsComposite();

    private OrdersView ordersView = new OrdersView();
    private AlgorithmView algorithmView = new AlgorithmView();
    private GameView gameView = new GameView();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        //Todo: call init() of the GameLogic Singleton
        //Setting Up the Menu for all Scenes
        MenuBar menuBar = new MenuBar();
        Menu views = new Menu("Views");
        menuBar.getMenus().addAll(views);
        MenuItem gameMenuItem = new MenuItem("main.java.Game");
        MenuItem ordersMenuItem = new MenuItem("Orders");
        MenuItem algorithmsMenuItem = new MenuItem("Algorithms");
        MenuItem exit = new MenuItem("Exit");
        views.getItems().addAll(gameMenuItem, ordersMenuItem, algorithmsMenuItem, exit);

        //UpdateLoop for GameEngine
        AnimationTimer timer = new AnimationTimer() {
            double lastTime = System.currentTimeMillis();
            @Override
            public void handle(long now) {
                double delta = System.currentTimeMillis() - lastTime;
                GameLogic.getInstance().update(delta);
                lastTime = System.currentTimeMillis();
                GraphicsContext gc = gameView.getCanvas().getGraphicsContext2D();
                doc.draw(gc);
            }
        };

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(menuBar);
        borderPane.setCenter(gameView.getPane());

        stage.setScene(new Scene(borderPane));
        stage.setWidth(Game.WINDOWWIDTH);
        stage.setHeight(Game.WINDOWHIGHT);
        stage.show();
        timer.start();

        exit.setOnAction(t -> System.exit(0));

        gameMenuItem.setOnAction(event -> {
            borderPane.setCenter(gameView.getPane());
        });

        ordersMenuItem.setOnAction(event -> {
            borderPane.setCenter(ordersView.getPane());
        });

        algorithmsMenuItem.setOnAction(event -> {
            borderPane.setCenter(algorithmView.getPane());
        });


    }

}  
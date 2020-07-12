package main.java.logic;

import main.java.Game;
import main.java.animation.AnimationHelper;
import main.java.animation.Rectangle;
import javafx.animation.Timeline;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import main.java.logic.algorithms.AlgorithmRegistry;
import main.java.logic.entities.*;

import java.util.ArrayList;
import java.util.List;


public class GameLogic {

    private boolean waitForSpawnLocation = false;
    private List<GameObject> gameObjectList = new ArrayList<>();
    private String selectedLocationElement;
    private GameLogic gameLogic;

    private GameLogic(String selectedLocationElement){
        gameLogic = new GameLogic(selectedLocationElement);
    }

    public GameLogic getInstance(){
        return this.gameLogic;
    }

    public void spawnLocation(MouseEvent event) {
        //TODO Implement. Hint: event.getX() and event.getY() provide the location for the new location.
        //Create a location, add its drawable to the Game.doc and add it the gameObjectList.
    }

    public void update(double delta) {
        List<GameObject> gameObjectList2 = new ArrayList<>();
        gameObjectList2.addAll(gameObjectList);
        for (GameObject go : gameObjectList2) {
            go.update(delta);
        }
    }

    public void init() {

        //Setting up the Algorithms
        AlgorithmRegistry.getInstance().addAlgorithm(SomeAlgorithm.name, SomeAlgorithm.class); //TODO Change this to the actual Algorithms

        Rectangle bg = new Rectangle(0, 0, Game.WINDOWWIDTH, Game.WINDOWHIGHT, Color.CORNSILK);
        Game.doc.add(bg);


        //Adding GameObjects like this adds them initially.
        Location someLocation = (Location) GameObjectFactory.getGameObject("Something", new Point(25, 25));
        Game.doc.add(someLocation.getDrawable());
        gameObjectList.add(someLocation);

        //Example of initial Order
        someLocation.addOrder(new Order(someLocation, someOtherLocation, "Resource", 5));


    }


    public void spawnCarrier(Order order) {
        //TODO Create a new carrier, add its drawable to the Game.doc, add the car to gameObjectList and set the name

        Timeline timelineCarrier = AnimationHelper.getTimelineForLocation(c.getDrawable().getXproperty(), c.getDrawable().getYproperty(), order.getOriginLocation().point.x, order.getOriginLocation().point.y, order.getTargetLocation().point.x, order.getTargetLocation().point.y, 100);
        timelineCarrier.setOnFinished(event -> {
            removeGameObject(carrierObject);
            order.onArrival();
        });
        timelineCarrier.play();
    }

    private void removeGameObject(Carrier c) {
        gameObjectList.remove(c);
        Game.doc.remove(c.getDrawable());
    }


    public void mouseClick(MouseEvent event) {
        if (waitForSpawnLocation) {
            spawnLocation(event);
            waitForSpawnLocation = false;
            return;
        }

        for (GameObject go : gameObjectList) {
            if (go.overlaps(new Point(event.getX(), event.getY()))) {
                go.onClick(event);
            }
        }
    }

    public void waitForSpawnLocation(String value) {
        this.waitForSpawnLocation = true;
        this.selectedLocationElement = value;
    }

    public ArrayList<Location> getLocations() {
        ArrayList<Location> locations = new ArrayList<>();
        for (GameObject go : gameObjectList) {
            if (go instanceof Location)
                locations.add((Location) go);
        }
        return locations;
    }

    public ArrayList<Order> getOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        for (GameObject go : gameObjectList) {
            if (go instanceof Location)
                orders.addAll(((Location) go).getOrders());
        }
        return orders;
    }

    public ArrayList<String> getAlgorithms() {
        return AlgorithmRegistry.getInstance().getAlgorithms();
    }
}
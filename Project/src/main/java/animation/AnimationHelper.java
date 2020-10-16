package main.java.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

public class AnimationHelper {

    public static Timeline getTimelineForLocation(DoubleProperty x, DoubleProperty y, double startX, double startY, double targetX, double targetY, double speed) {
        double distance = Point2D.distance(startX, startY, targetX, targetY);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new KeyValue(x, startX),
                        new KeyValue(y, startY)
                ),
                new KeyFrame(Duration.seconds(distance / speed),
                        new KeyValue(x, targetX),
                        new KeyValue(y, targetY)
                )
        );



        return timeline;
    }

    private static Color[] myColors = createPleasantColors();

    private static Color[] createPleasantColors(){
        return new Color[]{
                Color.color(0, 0, 1),
                Color.color(0, 1, 0),
                Color.color(1, 0, 0),
                Color.color(1, 1, 0),
                Color.color(1, 0, 1),
                Color.color(0, 1, 1),
                Color.color(0, 0, 0)
        };
    }



    public static Color getRandomColor() {

        Random r = new Random();
        int a = r.nextInt(7);

        return myColors[a];
    }
}

package main.java.animation;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.awt.geom.Point2D;

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

    public static Color getRandomColor() {
        //TODO: Select only pleasant colours
        return Color.color(Math.random(), Math.random(), Math.random());
    }
}

package com.example.programmingtehnologydecorator.service;

import com.example.programmingtehnologydecorator.models.IChristmasTree;
import com.example.programmingtehnologydecorator.models.TreeDecorator;
import javafx.animation.FadeTransition;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.Random;

public class Garland extends TreeDecorator {
    private final Random random = new Random();
    private final ArrayList<Color> colors = new ArrayList<>() {{
        add(Color.AZURE);
        add(Color.RED);
        add(Color.PURPLE);
        add(Color.CADETBLUE);
        add(Color.YELLOW);
        add(Color.ORANGE);
    }};
    private final ArrayList<Shape> shapes = new ArrayList<>();
    public Garland(IChristmasTree tree) {
        super(tree);
        for (var index = 0; index < this.random.nextInt(10, 20); index++) {
            var posY = this.random.nextInt(60, 210);
            var posX = this.random.nextInt(30,200);

            var color = this.colors.get(this.random.nextInt(0, this.colors.size() - 1));
            this.shapes.add(new Circle(posX, posY, 10, color));
        }
    }

    private void drawWithGarland(Pane paneLight) {
        for (var item : this.shapes) {
            paneLight.getChildren().addAll(item);
        }
    }

    @Override
    public void draw(Pane pane) {
        super.draw(pane);
        this.drawWithGarland(pane);
    }
}

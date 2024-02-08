package com.example.programmingtehnologydecorator.service;

import com.example.programmingtehnologydecorator.models.IChristmasTree;
import com.example.programmingtehnologydecorator.models.TreeDecorator;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class Star extends TreeDecorator {
    public Star(IChristmasTree tree) {
        super(tree);
    }

    @Override
    public void draw(Pane paneStar) {
        super.draw(paneStar);
        this.drawStar(paneStar);
    }

    private void drawStar(Pane paneStar) {
        var path = new Path() {{
            setFill(Color.GOLD);
            setFillRule(FillRule.EVEN_ODD);
            setStroke(Color.YELLOW);
        }};
        path.getElements().addAll(
                new MoveTo(100, -20),
                new LineTo(108, 0),
                new LineTo(125, 0),
                new LineTo(114, 14),
                new LineTo(118, 30),
                new LineTo(100, 20),
                new LineTo(82, 30),
                new LineTo(86, 14),
                new LineTo(75, 0),
                new LineTo(92, 0),
                new ClosePath()
        );
        paneStar.getChildren().addAll(path);
    }
}

package com.example.programmingtehnologydecorator.models;

import javafx.scene.layout.Pane;

public abstract class TreeDecorator implements IChristmasTree {
    private IChristmasTree tree;
    public TreeDecorator(IChristmasTree tree) {
        this.tree = tree;
    }
    public void draw(Pane pane){
        tree.draw(pane);
    }
}

package com.example.programmingtehnologydecorator.domen;

import com.example.programmingtehnologydecorator.models.ChristmasTree;
import com.example.programmingtehnologydecorator.models.IChristmasTree;
import com.example.programmingtehnologydecorator.service.Garland;
import com.example.programmingtehnologydecorator.service.Presents;
import com.example.programmingtehnologydecorator.service.Star;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Pane paneTree;

    private IChristmasTree tree = new ChristmasTree();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.paneTree.toFront();
        this.tree.draw(this.paneTree);
    }

    public void addGarlandButton(ActionEvent actionEvent) {
        new Garland(tree).draw(paneTree);
    }

    public void addStarButton(ActionEvent actionEvent) {
        new Star(tree).draw(paneTree);
    }

    public void addPresentButton(ActionEvent actionEvent) {
        new Presents(tree).draw(paneTree);
    }

    public void addAllButton(ActionEvent actionEvent) { new Presents(tree).draw(paneTree); new Star(tree).draw(paneTree); new Garland(tree).draw(paneTree);}

    public void clearDecorated(ActionEvent actionEvent) {
        this.paneTree.getChildren().clear();
        this.tree.draw(this.paneTree);
    }
}
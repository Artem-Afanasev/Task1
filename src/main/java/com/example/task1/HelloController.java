package com.example.task1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ListView list;
    public Canvas panel;
    public TextField ttext;
    public TextField high;
    public ColorPicker colorpic;
    @FXML
    private Label welcomeText;
    private ObservableList<Shape1> itemsList;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void onClick(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();
        int stx = Integer.parseInt(String.valueOf(high.getText()));

        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int index = list.getSelectionModel().getSelectedIndex();

        Shape1 shape = itemsList.get(index);
        shape.setV(stx);
        shape.setX(x);
        shape.setY(y);
        shape.setColor(colorpic.getValue());
        shape.draw(panel.getGraphicsContext2D());


    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        itemsList = FXCollections.observableArrayList(new Circle1(),new Rectangle1(1),new Triangle1());
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        list.setCellFactory(new Callback<ListView<Shape1>,ListCell<Shape1>>() {
            @Override
            public ListCell<Shape1> call(ListView<Shape1> list) {

                return new ShapeCell();
            }
        });
        list.setItems(itemsList);
//       Circle1 cir = new Circle1(1,1,100);
//        Triangle1 tri = new Triangle1(1,1);
//        Rectangle1 rec = new Rectangle1(1,1);
//
//        itemsList = FXCollections.observableArrayList(cir, tri, rec);
//        list.setItems(itemsList);
    }

    public void onCleen(ActionEvent actionEvent) {

        GraphicsContext gr = panel.getGraphicsContext2D();
        gr.clearRect(0, 0, panel.getWidth(), panel.getHeight());
    }
}

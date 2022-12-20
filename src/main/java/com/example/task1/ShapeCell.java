package com.example.task1;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ListCell;

public class ShapeCell extends ListCell<Shape1> {// класс Product

    @Override

    public void updateItem(Shape1 item, boolean empty) {

        super.updateItem(item, empty);

        if (item != null) {

            Canvas cnv=new Canvas();

            cnv.setHeight(60);// задание размера элемента отображения

            cnv.setWidth(100);

            GraphicsContext gr=cnv.getGraphicsContext2D();

            Shape1 item1=(Shape1)item.clone();//текущая фигура из списка ObservableList

            item1.draw(gr); // ее отрисовка на канве

            setGraphic(cnv); //установка канвы вместо cell

        }

    }

}
//    private HashMap<Integer,Shape> collect  = new HashMap<Integer,Shape>();
//
//    public Shape createShape(int numberOfSides) {
//        collect.put(1,new Circle1(1,1,100));
//        collect.put(2,new Triangle1(1,1));
//        collect.put(3,new Rectangle1(1,1));
//        return collect.get(numberOfSides);
//        //    if (numberOfSides == 0) {
//        return new Circle1(1, 1, 100);
//    } else if (numberOfSides == 4) {
//        return new Rectangle1(1, 1);
//    }
//    else if (numberOfSides == 3) {
//        return new Triangle1(1,1);
//    }


//  return null;



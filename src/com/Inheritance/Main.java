package com.Inheritance;

public class Main {

    public static void main(String[] args) {
//        var box1 = new TextBox();
//        var box2 = box1;
//        System.out.println(box1.getClass());
//        System.out.println(box2.hashCode());
//        box1.setText("Hello World");
//        System.out.println(box1.toString()); // we dont need to explicitly call the toString() method, the println() method automatically calls this function of any object that is passed to it.

        // UPCASTING AND DOWNCASTING
//        var control = new UIControl(true);
//        var textBox = new TextBox();
//        show(control);
//        show(textBox);
//
        var point1 = new Point(1,4);
        var point2 = new Point(1,4);
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));
        System.out.println(point1.hashCode());

    }
//
    public static void show(UIControl control) {
        // DOWNCASTING
        if (control instanceof  TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }
}

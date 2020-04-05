package com.Inheritance;

import com.Experimentations.Automobile;

public class TextBox extends UIControl {

    private String text; // Field

    // if child class doesnt have a parameter in its constructor but the parent class does
    // in that case the constructor of the parent class has to be called manually
//    public TextBox() {
//        super(true); // parent/super class constructor, must always be on the first line of the block
//        System.out.println("Text Box");
//    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}

package com.Inheritance;

public abstract class UIControl {
    private boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        System.out.println("UI Control");
//        this.isEnabled = isEnabled;
//    }

    public abstract void render();

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}

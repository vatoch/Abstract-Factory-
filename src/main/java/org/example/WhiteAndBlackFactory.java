package org.example;

public class WhiteAndBlackFactory implements AbstractGuiFactory{

    public Background background() {
        return new WhiteBackground();
    }

    public Label label() {
        return new BlackLabel();
    }

}

package org.example;

public class BlackAndWhiteFactory implements AbstractGuiFactory{

    public Background background() {
        return new BlackBackground();
    }

    public Label label() {
        return new WhiteLabel();
    }

}

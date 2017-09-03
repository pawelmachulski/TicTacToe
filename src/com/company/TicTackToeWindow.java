package com.company;

import java.util.ArrayList;
import java.util.List;

public class TicTackToeWindow extends Window {

    private List<Button> buttons = new ArrayList<>();

    public TicTackToeWindow(int height, int width, String title) {
        super(height, width, title);
        for(int i=1; i<=9;i++){
            buttons.add(new Button(""));
        }
    }

    public TicTackToeWindow(int height, int width, String title, List<Button> buttons) {
        super(height, width, title);
        this.buttons = buttons;
    }

    public TicTackToeWindow(String title, int width){
        this(width,width,title);
    }



    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public static void main(String[] args) {
        TicTackToeWindow ticTackToeWindow = new TicTackToeWindow("Tic tack toe", 500);
        System.out.println("Okno ma tytuł: " + ticTackToeWindow.getTitle() + " Wysokość " + ticTackToeWindow.getHeight() +" Szerokosć: " + ticTackToeWindow.getWidth());
        System.out.println("Okna ma " +ticTackToeWindow.getButtons().size() + " przycisków" );
        System.out.println("Pierwszy button ma tytuł: " + ticTackToeWindow.getButtons().get(0).getDescription());

    }
}

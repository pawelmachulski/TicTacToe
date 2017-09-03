package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TickTactkToeFrame extends JFrame implements ActionListener {
    private List<JButton> buttons = new ArrayList<>();
    private int counter = 0;


    public TickTactkToeFrame(String title, int width){
        super(title);
        setSize(width,width);  // ustawiamy rozmiar o wymiarach kwadratu
        counter = 0;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //metoda dodająca mozliwosc zamkniecia okna
        for(int i =1; i<=9; i++){ //pętla tworząca 9 buttonów
            JButton jButton = new JButton("");
            buttons.add(jButton);  //dodajemy buttony do listy (być może niepotrzebnie)
            jButton.addActionListener(this); //dodajemy słuchacza
            add(jButton); //metoda z Jframe która dorzuca do okna button
        }
        setLayout(new GridLayout(3,3)); //ustawiamy szablon na siatkę 3 na 3
        setVisible(true); //ustawiamy widoczność okna , żeby był widoczny zmieniamy na true
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() { //uruchamianie w oddzielnym wątku, obiekt tworzony w tle
            @Override
            public void run() {
                new TickTactkToeFrame("Tic Tac Toe", 500);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());  //button zwraca źródło ale typu Object
        JButton clickedButton = (JButton) e.getSource(); // stworzenie nowego obiektu i zrzutowanie typu Object na typ Button
        if (counter % 2 == 0) {
            clickedButton.setText("X");  //wpisanie pod kliknięty przycisk X'a
            clickedButton.setBackground(Color.BLUE); //ustawienie koloru niebieskiego po kliknięciu
        } else {
            clickedButton.setText("O");
            clickedButton.setBackground(Color.RED);
        }
        counter++;


        clickedButton.setEnabled(false);  //po kliknięciu wyłącza możliwośc ponownego kliknięci

        if(isWinner()){
            JOptionPane.showMessageDialog(null, "Koniec gry");
            setAllButtonsDisabled();
        }
    }

        public void setAllButtonsDisabled(){  // wyłącza możliwość kliknięcia po zakończeniu gry
        for(JButton button: buttons)
            button.setEnabled(false);
        }

       public boolean isWinner(int i, int j, int k) { //
           if (buttons.get(i).getText().equals(buttons.get(j).getText()) && buttons.get(j).getText().equals(buttons.get(k).getText()) && !buttons.get(k).getText().equals("")) {
              buttons.get(i).setBackground(Color.green);
               buttons.get(j).setBackground(Color.green);
               buttons.get(k).setBackground(Color.green);
               return true;
           }
           return false;
           }

       public boolean isWinner(){
           if(isWinner(0,1, 2)) return true;
           if(isWinner(3,4, 5)) return true;
           if(isWinner(6,7, 8)) return true;
           if(isWinner(0,3, 6)) return true;
           if(isWinner(1,4, 7)) return true;
           if(isWinner(2,5, 8)) return true;
           if(isWinner(0,4, 8)) return true;
           if(isWinner(2,4, 6)) return true;
           return false;
       }
}





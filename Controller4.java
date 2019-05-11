package Zadanie4Kalkulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller4 {


    @FXML
    Label okienko1;
    @FXML
    Label okienko2;


    String widok = "";
    double wynik = 0;
    String operator = "";
    String bufor = "";

    //double wartosc = Double.valueOf(text.getText());

    @FXML

    public void onButtonClicked(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        widok += button.getText();
        okienko1.setText(widok);
        bufor += button.getText();
        System.out.println(widok);
        System.out.println(bufor);

    }

    @FXML
    public void dzialanie(ActionEvent actionEvent) {
        if (!bufor.equals("")) {
            wynik = Double.parseDouble(bufor);
        }
        Button button = (Button) actionEvent.getSource();
        widok += button.getText();
        operator = button.getText();
        okienko1.setText(widok);
        bufor = "";
    }

    public void wynik() {
        if (operator.equals(""))
            wynik = Double.parseDouble(bufor);
        if (operator.equals("+"))
            wynik += Double.parseDouble(bufor);
        if (operator.equals("-"))
            wynik -= Double.parseDouble(bufor);
        if (operator.equals("x"))
            wynik *= Double.parseDouble(bufor);
        if (operator.equals("/"))
            wynik /= Double.parseDouble(bufor);
        if (operator.equals("modulo"))
            wynik %= Double.parseDouble(bufor);

        widok = String.valueOf(wynik);
        okienko1.setText(widok);


    }

    @FXML
    public void onButtonCancelClicked() {

        wynik = 0;
        bufor = "";
        widok = "";

        okienko1.setText(String.valueOf(wynik));
        okienko2.setText(String.valueOf(wynik));

    }
}























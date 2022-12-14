package com.example.quiz4;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Random;

public class HelloController {
    @FXML
    private TextField AText;
    @FXML
    private TextField BText;
    @FXML
    private TextField NameText;
    @FXML
    TextArea RText;
    @FXML
    Button generateButton;
    @FXML
    protected void onGenerateRandomButtonClick(){
        ArrayList<String> strings=GenerateEnglish();
        RText.setText("Random Text= "+strings.get(0)+"\n"+"Sequence of All Chars= "+strings.get(1)+"\n"+" Chars More than 12= "+strings.get(2));


    }

    private ArrayList<String> GenerateEnglish() {
        ArrayList<String>results=new ArrayList<>();
        Random random = new Random();
        String result = "";
        String secuence="";
        String moreThan12Secuence="";
        int Avalue = Integer.parseInt(AText.getText());
        int Bvalue = Integer.parseInt(BText.getText());
        int amount = random.nextInt(Math.min(Avalue, Bvalue), Math.max(Avalue, Bvalue));
        char Start = 'a';
        for (int i = 0; i < amount; i++) {
            int sec=random.nextInt(0,26);
            result += (char) (Start + sec);
            secuence+=sec+" ";
            if (sec > 12) {
                moreThan12Secuence+=(char)(Start+sec);
                moreThan12Secuence+=" ";
            }



        }
        results.add(result);
        results.add(secuence);
        results.add(moreThan12Secuence);
        return results;
    }
}





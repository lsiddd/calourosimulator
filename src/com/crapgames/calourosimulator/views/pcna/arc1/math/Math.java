package com.crapgames.calourosimulator.views.pcna.arc1.math;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 18/04/16.
 */
public class Math {

    public int horas=0;
    public int faltas=0;
    public int cena=0;
    public boolean acertou = false;

    @FXML
    ImageView bg = new ImageView();
    @FXML
    ImageView doge = new ImageView();
    @FXML
    Button dormirB =  new Button();
    @FXML
    Button estudarB = new Button();
    @FXML
    Button dadinhoB = new Button();
    @FXML
    Button next = new Button();
    @FXML
    Text pedroText = new Text();
    @FXML
    Text alunoText = new Text();
    @FXML
    Text hoursText = new Text();

    @FXML
    private void dormir(){
        this.horas-=5;
        this.pedroText.setText("Pedro: Pô cara, dormindo? Que vergonha, vai perder hora!\nMas cê pode recuperar, responde isso aqui pra mim!");
        this.alunoText.setText("Calcule a distância entre os pontos A(-2,3) e B(1,5)");

        this.dormirB.setText("1");
        this.estudarB.setText("-4");
        this.dadinhoB.setText("42");
        this.next.setDisable(true);

        this.dormirB.setOnAction(event->{
            this.pedroText.setText("Pedro: ACERTOUUUUUUUUUUUU, PARABENS CARA, GANHOU HORA!");
            this.horas += 5;
            this.acertou = true;
        });

        if (!this.acertou) {
            this.pedroText.setText("Pedro: ERROUUUUUUUUUUUUUu (imitando faustão)");
            this.alunoText.setText("Aluno: ME DISGURPA CARA EU TAVA NERVOUSOR (cê perdeu mais horas ainda c:)");
            this.horas -= 5;
        }
        this.next();
    }

    @FXML
    private void estudar(){
        this.horas += 5;
        this.pedroText.setText("Pedro: Que orgulho, cê ganhou hora!");
        this.alunoText.setText("Aluno: Que ótima forma de ganhar tempo");

        this.hoursText.setText("Horas: " + this.horas);

        if (this.horas > 40)
            this.end();

    }

    @FXML
    private void playDadinho(){
        //TODO implementar um mini jogo de dadinho
    }

    @FXML
    private void next() {

        switch (this.cena) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                this.end();
                break;
        }

        this.cena++;
    }

    private void end() {
        this.bg.setImage(new Image("com/crapgames/calourosimulator/assets/backgrounds/pcna-turma.png"));
        this.alunoText.setText("Q Q TÁ CONTESENO?");
        this.pedroText.setText("Cê foi aprovado cara, vamos tirar uma foto!");
        this.alunoText.setText("É uma ótima ideia! Vamos tira uma foto cotg legal!")

        //TODO achar uma cor q n seja escrota aqui
        this.pedroText.setFill(Color.PURPLE);
        this.alunoText.setFill(Color.PURPLE);

        this.dormirB.setDisable(true);
        this.estudarB.setDisable(true);
        this.dadinhoB.setDisable(true);
        this.doge.setVisible(false);

        next.setText("Outra matéria");
        next.setPrefWidth(108);
        next.setOnAction(e ->{
            try {
                fxmlCaller mm = new fxmlCaller();
                Stage stage;

                stage = (Stage) next.getScene().getWindow();

                Scene scene = new Scene(mm.introduction());
                stage.setScene(scene);
                stage.show();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });
    }
}

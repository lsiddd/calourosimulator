package com.crapgames.calourosimulator.viewsControl.pcna.arc1.math;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by lucas on 18/04/16.
 */
public class Math {

    public int horas=1;
    public int cena=0;
    public boolean acertou = false;
    public boolean end = false;

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
        this.pedroText.setText("Pedro: Pô cara, dormindo? Que vergonha,\n vai perder hora! Mas cê pode recuperar,\n responde isso aqui pra mim!");
        this.alunoText.setText("Calcule a distância entre os pontos A(-2,3) e B(1,5)");

        this.dormirB.setText("1");
        this.estudarB.setText("-4");
        this.dadinhoB.setText("42");
        this.next.setDisable(true);

        this.dormirB.setOnAction(event->{
            this.pedroText.setText("Pedro: ACERTOUUUUUUUUUUUU,\n PARABENS CARA, GANHOU HORA!");
            this.alunoText.setText("");
            this.horas += 5;
            this.acertou = true;
            this.end = true;
        });

        this.dadinhoB.setOnAction(event->{
            this.playDadinho();
            this.end = true;
        });

        if (!this.acertou) {
            this.pedroText.setText("Pedro: ERROUUUUUUUUUUUUUu \n(imitando faustão)");
            this.alunoText.setText("Aluno: ME DISGURPA CARA EU TAVA NERVOUSOR\n (cê perdeu mais horas ainda c:)");
            this.horas -= 5;

            if (this.horas <=0)
                this.dead();
        }
        if (this.end)
            this.next();
    }

    @FXML
    private void estudar(){
        System.out.println(java.lang.Math.random());
        this.horas += 5;
        this.pedroText.setText("Pedro: Que orgulho, cê ganhou hora!");
        this.alunoText.setText("Aluno: Que ótima forma de ganhar tempo");

        this.hoursText.setText("Horas: " + this.horas);

        if (this.horas > 40)
            this.end();

    }

    @FXML
    private void dead() {
        this.pedroText.setText("cê morreu (tá na vdd tu n morreu)\n(só perdeu todas as horas e o jogo)");
        this.alunoText.setText("COMER BIFE DE FÌGADO \n (aquela coisa mata de tão ruim) mova o mouse");

        this.dormirB.setDisable(true);
        this.estudarB.setDisable(true);
        this.dadinhoB.setDisable(true);
        this.next.setDisable(true);

        this.next.setOnMouseMoved(e->{
            System.exit(0);
        });
    }

    @FXML
    private void playDadinho(){
        //TODO implementar um mini jogo de dadinho
    }

    @FXML
    private void next() {

        this.dormirB.setText("dormir");
        this.estudarB.setText("estudar");
        this.dadinhoB.setText("dadinho");
        this.next.setDisable(false);

        switch (this.cena) {
            case 1:
                this.pedroText.setText("Pedro: Hoje a gente vai aprender a somar,\n cêis sabem somar né?");
                this.alunoText.setText("Aluno: Somar só se for só se for no mar...");
                break;
            case 2:
                this.pedroText.setText("Pedro: MAS E DE VETORES,\n CÊIS MANJAM? VETORES CARAI!!!");
                this.alunoText.setText("ex skinhead alemão (pq se falar o nome a gente toma processo):\nAMO VETORESSSS!");
                break;
            case 3:
                this.pedroText.setText("Pedro: Blz, vetores já foi,\n mas iai o q dá de fazer aqui?");
                this.alunoText.setText("Aluno: N dá pra cortar tudo e depois falar que é culpa do cerol?");
                break;
            case 4:
                this.pedroText.setText("Pedro: Vocês são a melhor turma,\n tomem uma dica: invistam no dadinho\npq no curso cêis tão na merda.");
                this.alunoText.setText("Aluno: Dadinho sim (vamo jogar depois da aula)");
                this.end();
                break;
        }

        this.cena++;
    }

    private void end() {
        this.bg.setImage(new Image("com/crapgames/calourosimulator/assets/backgrounds/pcna-turma.png"));
        this.alunoText.setText("Q Q TÁ CONTESENO?");
        this.pedroText.setText("Cê foi aprovado cara, vamos tirar uma foto!");
        this.alunoText.setText("É uma ótima ideia! Vamos tira uma foto cotg legal!");

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

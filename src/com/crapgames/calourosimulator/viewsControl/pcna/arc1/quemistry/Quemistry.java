package com.crapgames.calourosimulator.viewsControl.pcna.arc1.quemistry;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

/**
 * Created by lucas on 18/04/16.
 */
public class Quemistry {
    int horas = 20;
    int faltas = 0;
    static int aux2 = 0;
    @FXML
    Button dormir = new Button();
    @FXML
    Button estudar = new Button();
    @FXML
    Button vadeco = new Button();
    @FXML
    Button next = new Button();
    @FXML
    Text frankText = new Text();
    @FXML
    Text alunoText = new Text();
    int aux = 0;
    @FXML
    Button piora = new Button();
    @FXML
    Button dsclp = new Button();
    @FXML
    Button fdc = new Button();

    @FXML
    private void next() throws IOException{
        if(aux == 0) {
            frankText.setText("Meu Nome é Rádio: É uma habilidade básica de toda engenharia");
            alunoText.setText("Aluno: como sefaz metanfetamina?");
            aux++;
        }
        else if(aux == 1){
            frankText.setText("Meu Nome é Rádio: o quê?");
            alunoText.setText("Aluno: Science, bitch!");
            aux++;
        }
        else if(aux == 2){
            frankText.setText("Meu Nome é Rádio: eu não estudei pelo rádio em capanema pra isso, vou tirar sua carga horária");
            alunoText.setText("Jamile: Francamente!? Retiro o que eu disse (E então pinga uma gota de suor hetero dos olhos de um aluno)");

            this.horas-=5;

            aux++;

        }
        else if(aux == 3){
            fxmlCaller mm = new fxmlCaller();
            Stage stage;

            stage = (Stage) next.getScene().getWindow();

            Scene scene = new Scene(mm.qmcScene1());
            stage.setScene(scene);
            stage.show();
        }
    }
    @FXML
    public void reset(){
        dormir.setOnAction(e -> dormir());
        dormir.setText("Dormir");

        estudar.setOnAction(e -> estudar());
        estudar.setText("Estudar");

        vadeco.setOnAction(e -> vadeco());
        vadeco.setText("Vadeco");

        next.setDisable(false);
    }
    @FXML
    private void dormir(){
        next.setDisable(true);
        if(aux2 == 0) {
            frankText.setText("Dormindo na aula? Na equação \n Mg + HCl → MgCl2 + H2 considerando o coeficiente 6 para cada produto os dos reagentes será:");
            alunoText.setText(null);
            dormir.setText("3 e 6");
            dormir.setOnAction(event -> {
                horas-=5;
                frankText.setText("você errou, perdeu horas");
                reset();
            });
            estudar.setText("6 e 6");
            estudar.setOnAction(event -> {
                horas-=5;
                frankText.setText("você errou, perdeu horas");
                reset();
            });
            vadeco.setText("6 e 12");
            vadeco.setOnAction(event -> {
                horas+=5;
                frankText.setText("acertô mizeravi");
                reset();
            });
            aux2++;

        }
        else if(aux2 ==1) {
            frankText.setText("Sendo e a massa molar do cálcio igual a 40 g/mol, qual a quantidade mínima diária de átomos de cálcio a ser ingerida para que uma pessoa supra suas necessidades?\n");
            alunoText.setText(null);
            dormir.setText("7,5 × 10^21");
            dormir.setOnAction(event -> {
                horas -= 5;
                frankText.setText("você errou, perdeu horas");
                reset();
            });
            estudar.setText("1,5 × 10^22");
            estudar.setOnAction(event -> {
                horas += 5;
                frankText.setText("acertô mizeravi");
                reset();
            });
            vadeco.setText("7,5 × 10^23");
            vadeco.setOnAction(event -> {
                frankText.setText("você errou, perdeu horas");
                horas -= 5;
                reset();
            });
        }

    }

    @FXML
    private void estudar(){
        this.horas++;
        frankText.setText("você ganhou horas, parabains");
        if(horas == 40){
            frankText.setText("Walter, o que aconteceu?");
            alunoText.setText("Eu ganhei");

            dormir.setDisable(true);
            estudar.setDisable(true);
            vadeco.setDisable(true);

            next.setText("Outra matéria");
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

    @FXML
    private void vadeco(){
        frankText.setText("Meu nome é Rádio: (você faltou, não sabe o que ele disse, ow)");
        alunoText.setText(null);
        faltas++;

        if(faltas > 5) {
            alunoText.setText("aaand tu reprovaste, tchê\ntente de novo");

            Media sound = new Media(new File("src/com/crapgames/calourosimulator/assets/sounds/Sad_Male.mp3").toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.play();

            dormir.setDisable(true);
            vadeco.setDisable(true);
            estudar.setDisable(true);

            next.setText("Terminar, tchê");
            next.setOnAction(e -> System.exit(0));
        }
    }
    //aqui são funçoes da qmcScene-1.fxml
    @FXML
    private void piorar(){
        frankText.setText("Realmente\nMenos cinco");
        horas--;
        fase2();

    }

    @FXML
    private void desculpar(){
        alunoText.setText(null);
        frankText.setText("Desculpa Rádio pelamor de Deus eu preciso de hora pfvr nunca te pedi nada");
        fase2();
    }

    @FXML
    private void fdc(){
        frankText.setText("M E N O S C I N C O ");
        horas--;
        fase2();
    }

    @FXML
    public void fase2(){

    }
}

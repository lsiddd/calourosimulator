package com.crapgames.calourosimulator.viewsControl.pcna.arc1.quemistry;

import com.crapgames.calourosimulator.assets.FXML.fxmlCaller;
import javafx.animation.Animation;
import javafx.animation.Transition;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;

/**
 * Created by lucas on 18/04/16.
 */
public class Quemistry {
    int horas = 20;
    int faltas = 0;
    int aux = 0;
    int aux2 = 0;
    int aux3 = 0;


    @FXML Button dormir = new Button();
    @FXML Button estudar = new Button();
    @FXML Button vadeco = new Button();
    @FXML Button next = new Button();
    @FXML Text frankText = new Text();
    @FXML Text alunoText = new Text();
    @FXML Button piora = new Button();
    @FXML Button dsclp = new Button();
    @FXML Button fdc = new Button();

    @FXML
    private void next() throws IOException{
        if(aux == 0) {
            textAnimation(frankText, "Meu Nome é Rádio: É uma habilidade básica de toda engenharia");
            textAnimation(alunoText,"Aluno: como sefaz metanfetamina?");
            aux++;
        }
        else if(aux == 1){
            textAnimation(frankText,"Meu Nome é Rádio: o quê?");
            textAnimation(alunoText,"Aluno: Science, bitch!");
            aux++;
        }
        else if(aux == 2){
            textAnimation(frankText,"Meu Nome é Rádio: eu não estudei pelo rádio em capanema pra isso, vou tirar sua carga horária");
            textAnimation(alunoText,"Jamile: Francamente!? Retiro o que eu disse (E então pinga uma gota de suor hetero dos olhos de um aluno)");

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
    public void resetScene1(){
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
            textAnimation(frankText,"Dormindo na aula? Na equação \n Mg + HCl → MgCl2 + H2 considerando o coeficiente 6 para cada produto os dos reagentes será:");
            textAnimation(alunoText,null);
            dormir.setText("3 e 6");
            dormir.setOnAction(event -> {
                horas-=5;
                textAnimation(frankText,"você errou, perdeu horas");
                resetScene1();
            });
            estudar.setText("6 e 6");
            estudar.setOnAction(event -> {
                horas-=5;
                textAnimation(frankText,"você errou, perdeu horas");
                resetScene1();
            });
            vadeco.setText("6 e 12");
            vadeco.setOnAction(event -> {
                horas+=5;
                textAnimation(frankText,"acertô mizeravi");
                resetScene1();
            });

            aux2++;

        }
        else if(aux2 == 1) {
            textAnimation(frankText,"Sendo e a massa molar do cálcio igual a 40 g/mol, qual a quantidade mínima diária de átomos de cálcio a ser ingerida para que uma pessoa supra suas necessidades?\n");
            textAnimation(alunoText,null);
            dormir.setText("7,5 × 10^21");
            dormir.setOnAction(event -> {
                horas -= 5;
                textAnimation(frankText,"você errou, perdeu horas");
                resetScene1();
            });
            estudar.setText("1,5 × 10^22");
            estudar.setOnAction(event -> {
                horas += 5;
                textAnimation(frankText,"acertô mizeravi");
                resetScene1();
            });
            vadeco.setText("7,5 × 10^23");
            vadeco.setOnAction(event -> {
                textAnimation(frankText,"você errou, perdeu horas");
                horas -= 5;
                resetScene1();
            });
            aux2++;
        }

        else if (aux2 == 2){
            textAnimation(frankText, "Suas faltas excederam o limite, mais uma e estará reprovado");
            textAnimation(alunoText, null);
            resetScene1();
            aux2++;
        }
        else if (aux2 == 3){
            textAnimation(frankText, "Você foi reprovado por faltas(dormir na chamada)");
            textAnimation(alunoText, null);

            dormir.setDisable(true);
            vadeco.setDisable(true);
            estudar.setDisable(true);

            next.setDisable(false);
            next.setOnAction(e-> System.exit(0));
            next.setText("Sair");
        }
    }

    @FXML
    private void estudar(){
        this.horas++;
        textAnimation(frankText,"você ganhou horas, parabains");
        if(horas == 40){
            textAnimation(frankText,"Walter, o que aconteceu?");
            textAnimation(alunoText,"Eu ganhei");

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
        textAnimation(frankText,"Meu nome é Rádio: (você faltou, não sabe o que ele disse, ow)");
        textAnimation(alunoText,null);
        faltas++;

        if(faltas > 5) {
            textAnimation(alunoText,"aaand tu reprovaste, tchê\ntente de novo");

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
        textAnimation(frankText,"Realmente\nMenos cinco");
        horas--;
        fase2();

    }

    @FXML
    private void desculpar(){
        textAnimation(alunoText,null);
        textAnimation(frankText,"Desculpa Rádio pelamor de Deus eu preciso de hora pfvr nunca te pedi nada");
        fase2();
    }

    @FXML
    private void fdc(){
        textAnimation(frankText,"M E N O S C I N C O ");
        horas--;
        fase2();
    }

    @FXML
    private void fase2(){
        textAnimation(frankText, "É hora de aprsentar alguns conceitos mais básicos da química, afinal, esta aula está muito ácida(trilha de risadas)");
        fdc.setText("Suicidio");

        fdc.setOnAction(e1 -> {
            fdc.setDisable(true);
            textAnimation(frankText, "Não se precipite, para tudo tem \"solução\"");
        });

        piora.setText("frank para pfvr");
        piora.setOnAction(e2 ->{
            textAnimation(frankText, "impossível, uma reação em cadeia se iniciou");
        });

        dsclp.setText("HAHAHA");
        dsclp.setOnAction(e3 ->{
            textAnimation(frankText, "Aluno: oh não frank foi possuído pelo espírito de sid... o que faremos?");
            piora.setDisable(true);
            dsclp.setText("próx.");
            dsclp.setOnAction(e3_1 -> {
                textAnimation(frankText, "1. Iniciar  exorcismo\n2. deixa quieto\n3. sei lá, depois eu vejo");

                piora.setDisable(false); fdc.setDisable(false);

                piora.setText("1");dsclp.setText("2");fdc.setText("3");

                piora.setOnAction(e3_1_1 -> {
                    textAnimation(frankText, "Como?");
                });
                dsclp.setOnAction(e3_1_2 -> {
                    textAnimation(frankText, "Frank desaprendeu tudo o que sabia de química e a culpa é sua(e do sid[perdi])");

                    piora.setText("Piora");

                    piora.setOnAction(event -> {
                        dsclp.setDisable(true); fdc.setDisable(true);
                        piora.setText("Finalizar"); piora.setOnAction(event1 -> System.exit(0));
                        textAnimation(frankText, "Exatamente.. Não há mais nada para lhe ensinar sobre este lugar\nvocê ganhou " + horas + " horas e traumas emocionais");
                    });
                });
                fdc.setOnAction(e_3_3 -> {
                    piora.setDisable(true);
                    dsclp.setDisable(true);

                    fdc.setOnAction(event -> System.exit(0));

                    textAnimation(frankText, "Aparentemente você também foi possuído, nada poderá te fazer aprender química...");
                });
            });
        });


    }

    @FXML private void textAnimation(Text textbox, String text){//vai controlar animação na setagem de textos
        if (text != null) {
            final Animation animation = new Transition() {
                {
                    setCycleDuration(Duration.millis(2000));
                }

                protected void interpolate(double frac) {
                    final int length = text.length();
                    final int n = Math.round(length * (float) frac);
                    textbox.setText(text.substring(0, n));
                }

            };
            animation.play();
        }
        else{textbox.setText(null);}
    }
}
package com.crapgames.calourosimulator.views.pcna.arc1.physics;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

/**
 * Created by lucas on 26/04/16.
 */
public class Physics {
    static int aux = 0;
    static int horas = 0;
    String text = ".";

    @FXML Button botao1 = new Button();
    @FXML Button botao2 = new Button();
    @FXML Button botao3 = new Button();
    @FXML Button botao4 = new Button();

    @FXML Text text1 = new Text();

    @FXML private void next(){
        switch (aux){
            case 0:
                text1.setText("Agora começamos o nosso curso de revisão de \nFísica do Ensino médio. Basicamente revisaremos \na parte de cinética de mecânica que trata sobre \ncomo as forças atuam sobre o corpo em movimento.");
                aux++;
                break;
            case 1:
                text1.setText("O método" +
                        "que vou usar para avaliar vocês, será \natravés de um teste logo após tópico. Estou me \nformando sem desblocar e não vi ninguém tirar as \n40 de física comigo.");
                aux++;
                break;
            case 2:
                text1.setText("o isso significa? Que ninguém consegue? \nNão, eu sou o kakashi.");
                aux++;
                break;
            case 3:
                text1.setText("Então vamos começar, do que trata a cinética?");

                botao1.setText("a) Sobre o episodio VII");
                botao2.setText("b) Sobre o filme porno");
                botao3.setText("c) Sobre a ética no \ncinema");
                botao4.setText("d) Sobre a ação das \nforças nas mudanças \nde movimento dos \ncorpos");

                setDisable(false);

                botao1.setOnAction(e -> {
                    text1.setText("Resposta correta!\nclique para continuar");
                    aux++;
                    horas+=5;
                    setDisable(true);
                });
                botao2.setOnAction(e2 -> {
                    text1.setText("Faz sentido\nclique para continuar");
                    aux++;
                    setDisable(true);
                });
                botao3.setOnAction(e3 -> {
                    text1.setText("Resposta absurda\nclique para continuar");
                    aux++;
                    setDisable(true);
                });
                botao4.setOnAction(e4 -> {
                    text1.setText("Resposta quase certa\nclique para continuar");
                    horas+=3;
                    aux++;
                    setDisable(true);
                });
                break;
            case 4:
                botao1.setText(null);botao2.setText(null);botao3.setText(null);botao4.setText(null);
                aux++;
                text1.setText("Agora vamos fazer uma dinâmica em grupo, vocês \nvão ter a experiência de vivência de uma equipe \nde engenheiros para solucionar o problema de \navião que precisa decolar sem cair. Formem \ngrupos e utilizem os enunciados da lei de newton:");
                break;
            case 5:
                text1.setText("1- Tudo o que se mexe, vai se mexer até o \nestagiário fazer merda.");
                aux++;
                break;
            case 6:
                text1.setText("2- Tuda merda de estagiário continua estando \nna merda até que alguém venha consertar.");
                aux++;
                break;
            case 7:
                text1.setText("3- Toda ação de um estágio, hé uma reação \npreocupante de seus superiores.");
                aux++;
                break;
            case 8:
                text1.setText("Qual o empuxo na asa direita a 300km/h?\n" +
                        "Em qual temperatura pode ser soldada a cadeira do holandes?\n" +
                        "Quando o berg pula de paraquedas?\n" +
                        "Quais são o grandmother e o grandfather do co-piloto?");
                aux++;
                break;
            case 9:
                text1.setText("Resolva e clique na imagem...");
                break;
            case 10:
                text1.setText("O avião caiu, mas em compensação aconteceu um forró :)");
        }
    }

    @FXML private void setDisable(boolean state){
        botao1.setDisable(state);
        botao2.setDisable(state);
        botao3.setDisable(state);
        botao4.setDisable(state);
    }

}

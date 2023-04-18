package com.example.buscaminas;

import com.example.buscaminas.Tile;
import com.example.buscaminas.Node;
import com.example.buscaminas.LinkedList;
import com.example.buscaminas.Time;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class HelloController {

    private boolean game_start = false;

    private int Dturns = 0;

    private int Eturns = 0;

    private int flags = 0;

    private int Hturns = 0;

    boolean[][]matrix = new boolean[8][8];

    boolean[][]isClicked = new boolean[8][8];

    @FXML
    private Label Title;

    @FXML
    private Button btn0x0;

    @FXML
    private Button btn0x1;

    @FXML
    private Button btn0x2;

    @FXML
    private Button btn0x3;

    @FXML
    private Button btn0x4;

    @FXML
    private Button btn0x5;

    @FXML
    private Button btn0x6;

    @FXML
    private Button btn0x7;

    @FXML
    private Button btn1x0;

    @FXML
    private Button btn1x1;

    @FXML
    private Button btn1x2;

    @FXML
    private Button btn1x3;

    @FXML
    private Button btn1x4;

    @FXML
    private Button btn1x5;

    @FXML
    private Button btn1x6;

    @FXML
    private Button btn1x7;

    @FXML
    private Button btn2x0;

    @FXML
    private Button btn2x1;

    @FXML
    private Button btn2x2;

    @FXML
    private Button btn2x3;

    @FXML
    private Button btn2x4;

    @FXML
    private Button btn2x5;

    @FXML
    private Button btn2x6;

    @FXML
    private Button btn2x7;

    @FXML
    private Button btn3x0;

    @FXML
    private Button btn3x1;

    @FXML
    private Button btn3x2;

    @FXML
    private Button btn3x3;

    @FXML
    private Button btn3x4;

    @FXML
    private Button btn3x5;

    @FXML
    private Button btn3x6;

    @FXML
    private Button btn3x7;

    @FXML
    private Button btn4x0;

    @FXML
    private Button btn4x1;

    @FXML
    private Button btn4x2;

    @FXML
    private Button btn4x3;

    @FXML
    private Button btn4x4;

    @FXML
    private Button btn4x5;

    @FXML
    private Button btn4x6;

    @FXML
    private Button btn4x7;

    @FXML
    private Button btn5x0;

    @FXML
    private Button btn5x1;

    @FXML
    private Button btn5x2;

    @FXML
    private Button btn5x3;

    @FXML
    private Button btn5x4;

    @FXML
    private Button btn5x5;

    @FXML
    private Button btn5x6;

    @FXML
    private Button btn5x7;

    @FXML
    private Button btn6x0;

    @FXML
    private Button btn6x1;

    @FXML
    private Button btn6x2;

    @FXML
    private Button btn6x3;

    @FXML
    private Button btn6x4;

    @FXML
    private Button btn6x5;

    @FXML
    private Button btn6x6;

    @FXML
    private Button btn6x7;

    @FXML
    private Button btn7x0;

    @FXML
    private Button btn7x1;

    @FXML
    private Button btn7x2;

    @FXML
    private Button btn7x3;

    @FXML
    private Button btn7x4;

    @FXML
    private Button btn7x5;

    @FXML
    private Button btn7x6;

    @FXML
    private Button btn7x7;

    @FXML
    private Button btnHelp;

    @FXML
    private Button btnDummy;

    @FXML
    private Button btnExpert;

    @FXML
    private Text fldMine;

    @FXML
    private Text fldTime;

    @FXML
    private Label txtMine;

    @FXML
    private Label txtTime;

    @FXML
    private GridPane grid;

    Time time = new Time("0:0");

    Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1),
            e -> {
                time.secondPass();
                fldTime.setText(time.getCurrentTime());
            }
    ));

    int x_pos(int x, int y){
        int cont = 0;
        if (x + 1 > 7){
            cont = 0;
        }
        else if (matrix[x + 1][y] == true){
            cont++;
        }
        return cont;
    }
    int x_neg(int x, int y){
        int cont = 0;
        if (x - 1 < 0){
            cont = 0;
        }
        else if (matrix[x - 1][y] == true){
            cont++;
        }
        return cont;
    }
    int y_pos(int x, int y){
        int cont = 0;
        if (y + 1 > 7){
            cont = 0;
        }
        else if (matrix[x][y + 1] == true){
            cont++;
        }
        return cont;
    }
    int y_neg(int x, int y){
        int cont = 0;
        if (y - 1 < 0){
            cont = 0;
        }
        else if (matrix[x][y - 1] == true){
            cont++;
        }
        return cont;
    }
    int x_pos_y_pos(int x, int y){
        int cont = 0;
        if (x + 1 > 7){
            cont = 0;
        }
        else if (y + 1 > 7){
            cont = 0;
        }
        else if (matrix[x + 1][y + 1] == true){
            cont++;
        }
        return cont;
    }
    int x_neg_y_pos(int x, int y){
        int cont = 0;
        if (x - 1 < 0){
            cont = 0;
        }
        else if (y + 1 > 7){
            cont = 0;
        }
        else if (matrix[x - 1][y + 1] == true){
            cont++;
        }
        return cont;
    }
    int x_pos_y_neg(int x, int y){
        int cont = 0;
        if (x + 1 > 7){
            cont = 0;
        }
        else if (y - 1 < 0){
            cont = 0;
        }
        else if (matrix[x + 1][y - 1] == true){
            cont++;
        }
        return cont;
    }
    int x_neg_y_neg(int x, int y){
        int cont = 0;
        if (x - 1 < 0){
            cont = 0;
        }
        else if (y - 1 < 0){
            cont = 0;
        }
        else if (matrix[x - 1][y - 1] == true){
            cont++;
        }
        return cont;
    }
    int totalBombs(int x, int y){
        int result = 0;
        result = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                + x_neg_y_neg(x, y);
        return result;
    }

    @FXML
    void clickHelp(ActionEvent event) {
        int x = 0;
        int y = 0;
        if (Hturns == 5){
            for (y = 0; y < 7; y++){
            }
                for (x = 0; x < 7; x++){
                    if (matrix[x][y] == false){
                        System.out.println("Selecciona la casilla:");
                        System.out.println(x);
                        System.out.println(y);
                        break;
                    }
                }
        }
        else {
            System.out.println("Para una pista deben pasar 5 turnos");
        }
    }
    @FXML
    void click0x0(ActionEvent event) {
        int x = 0;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x1(ActionEvent event) {
        int x = 0;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x2(ActionEvent event) {
        int x = 0;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x3(ActionEvent event) {
        int x = 0;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x4(ActionEvent event) {
        int x = 0;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x5(ActionEvent event) {
        int x = 0;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x6(ActionEvent event) {
        int x = 0;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click0x7(ActionEvent event) {
        int x = 0;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn0x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x0(ActionEvent event) {
        int x = 1;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x1(ActionEvent event) {
        int x = 1;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x2(ActionEvent event) {
        int x = 1;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x3(ActionEvent event) {
        int x = 1;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x4(ActionEvent event) {
        int x = 1;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x5(ActionEvent event) {
        int x = 1;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x6(ActionEvent event) {
        int x = 1;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click1x7(ActionEvent event) {
        int x = 1;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn1x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x0(ActionEvent event) {
        int x = 2;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x1(ActionEvent event) {
        int x = 2;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x2(ActionEvent event) {
        int x = 2;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x3(ActionEvent event) {
        int x = 2;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x4(ActionEvent event) {
        int x = 2;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x5(ActionEvent event) {
        int x = 2;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x6(ActionEvent event) {
        int x = 2;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click2x7(ActionEvent event) {
        int x = 2;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn2x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x0(ActionEvent event) {
        int x = 3;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x1(ActionEvent event) {
        int x = 3;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x2(ActionEvent event) {
        int x = 3;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x3(ActionEvent event) {
        int x = 3;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x4(ActionEvent event) {
        int x = 3;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x5(ActionEvent event) {
        int x = 3;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x6(ActionEvent event) {
        int x = 3;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click3x7(ActionEvent event) {
        int x = 3;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn3x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x0(ActionEvent event) {
        int x = 4;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x1(ActionEvent event) {
        int x = 4;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x2(ActionEvent event) {
        int x = 4;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x3(ActionEvent event) {
        int x = 4;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x4(ActionEvent event) {
        int x = 4;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x5(ActionEvent event) {
        int x = 4;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x6(ActionEvent event) {
        int x = 4;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click4x7(ActionEvent event) {
        int x = 4;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn4x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x0(ActionEvent event) {
        int x = 5;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x1(ActionEvent event) {
        int x = 5;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x2(ActionEvent event) {
        int x = 5;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x3(ActionEvent event) {
        int x = 5;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x4(ActionEvent event) {
        int x = 5;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x5(ActionEvent event) {
        int x = 5;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x6(ActionEvent event) {
        int x = 5;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click5x7(ActionEvent event) {
        int x = 5;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn5x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x0(ActionEvent event) {
        int x = 6;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x1(ActionEvent event) {
        int x = 6;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x2(ActionEvent event) {
        int x = 6;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x3(ActionEvent event) {
        int x = 6;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x4(ActionEvent event) {
        int x = 6;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x4.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x5(ActionEvent event) {
        int x = 6;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x6(ActionEvent event) {
        int x = 6;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click6x7(ActionEvent event) {
        int x = 6;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn6x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x0(ActionEvent event) {
        int x = 7;
        int y = 0;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x0.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x1(ActionEvent event) {
        int x = 7;
        int y = 1;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x1.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x2(ActionEvent event) {
        int x = 7;
        int y = 2;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x2.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x3(ActionEvent event) {
        int x = 7;
        int y = 3;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x3.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x4(ActionEvent event) {
        int x = 7;
        int y = 4;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x4.setText(String.valueOf(bombs));
            dummy();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x5(ActionEvent event) {
        int x = 7;
        int y = 5;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x5.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x6(ActionEvent event) {
        int x = 7;
        int y = 6;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x6.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }

    @FXML
    void click7x7(ActionEvent event) {
        int x = 7;
        int y = 7;
        int bombs = 0;
        if (matrix[x][y] == false){
            Hturns++;
            isClicked[x][y] = true;
            bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                    + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                    + x_neg_y_neg(x, y);
            btn7x7.setText(String.valueOf(bombs));
            dummy();
            expert();
        }
        else{
            timeline.pause();
            System.out.println("Juego Terminado");
        }
    }
    @FXML
    void rclick0x0(MouseEvent event) {
        int x = 0;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x1(MouseEvent event) {
        int x = 0;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x2(MouseEvent event) {
        int x = 0;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x3(MouseEvent event) {
        int x = 0;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x4(MouseEvent event) {
        int x = 0;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x5(MouseEvent event) {
        int x = 0;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x6(MouseEvent event) {
        int x = 0;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick0x7(MouseEvent event) {
        int x = 0;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn0x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x0(MouseEvent event) {
        int x = 1;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x1(MouseEvent event) {
        int x = 1;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x2(MouseEvent event) {
        int x = 1;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x3(MouseEvent event) {
        int x = 1;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x4(MouseEvent event) {
        int x = 1;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x5(MouseEvent event) {
        int x = 1;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x6(MouseEvent event) {
        int x = 1;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick1x7(MouseEvent event) {
        int x = 1;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn1x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x0(MouseEvent event) {
        int x = 2;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x1(MouseEvent event) {
        int x = 2;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x2(MouseEvent event) {
        int x = 2;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x3(MouseEvent event) {
        int x = 2;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x4(MouseEvent event) {
        int x = 2;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x5(MouseEvent event) {
        int x = 2;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x6(MouseEvent event) {
        int x = 2;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick2x7(MouseEvent event) {
        int x = 2;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn2x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x0(MouseEvent event) {
        int x = 3;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x1(MouseEvent event) {
        int x = 3;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x2(MouseEvent event) {
        int x = 3;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x3(MouseEvent event) {
        int x = 3;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x4(MouseEvent event) {
        int x = 3;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x5(MouseEvent event) {
        int x = 3;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x6(MouseEvent event) {
        int x = 3;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick3x7(MouseEvent event) {
        int x = 3;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn3x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x0(MouseEvent event) {
        int x = 4;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x1(MouseEvent event) {
        int x = 4;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x2(MouseEvent event) {
        int x = 4;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x3(MouseEvent event) {
        int x = 4;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x4(MouseEvent event) {
        int x = 4;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x5(MouseEvent event) {
        int x = 4;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x6(MouseEvent event) {
        int x = 4;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick4x7(MouseEvent event) {
        int x = 4;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn4x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x0(MouseEvent event) {
        int x = 5;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x1(MouseEvent event) {
        int x = 5;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x2(MouseEvent event) {
        int x = 5;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x3(MouseEvent event) {
        int x = 5;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x4(MouseEvent event) {
        int x = 5;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x5(MouseEvent event) {
        int x = 5;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x6(MouseEvent event) {
        int x = 5;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick5x7(MouseEvent event) {
        int x = 5;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn5x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x0(MouseEvent event) {
        int x = 6;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x1(MouseEvent event) {
        int x = 6;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x2(MouseEvent event) {
        int x = 6;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x3(MouseEvent event) {
        int x = 6;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x4(MouseEvent event) {
        int x = 6;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x5(MouseEvent event) {
        int x = 6;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x6(MouseEvent event) {
        int x = 6;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick6x7(MouseEvent event) {
        int x = 6;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn6x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x0(MouseEvent event) {
        int x = 7;
        int y = 0;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x0.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x1(MouseEvent event) {
        int x = 7;
        int y = 1;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x1.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x2(MouseEvent event) {
        int x = 7;
        int y = 2;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x2.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x3(MouseEvent event) {
        int x = 7;
        int y = 3;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x3.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x4(MouseEvent event) {
        int x = 7;
        int y = 4;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x4.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x5(MouseEvent event) {
        int x = 7;
        int y = 5;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x5.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x6(MouseEvent event) {
        int x = 7;
        int y = 6;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x6.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }

    @FXML
    void rclick7x7(MouseEvent event) {
        int x = 7;
        int y = 7;
        if (event.getButton() == MouseButton.SECONDARY){
            isClicked[x][y] = true;
            flags++;
            btn7x7.setStyle("-fx-background-color: #0000FF; ");
            fldMine.setText(String.valueOf(flags));
        }
    }
    void dummy(){
        int bombs = 0;
        int x = (int)(Math.random() * 8);
        int y = (int)(Math.random() * 8);
        Button[][] btn = {{btn0x0, btn1x0, btn2x0, btn3x0, btn4x0, btn5x0, btn6x0, btn7x0},
                {btn0x1, btn1x1, btn2x1, btn3x1, btn4x1, btn5x1, btn6x1, btn7x1},
                {btn0x2, btn1x2, btn2x2, btn3x2, btn4x2, btn5x2, btn6x2, btn7x2},
                {btn0x3, btn1x3, btn2x3, btn3x3, btn4x3, btn5x3, btn6x3, btn7x3},
                {btn0x4, btn1x4, btn2x4, btn3x4, btn4x4, btn5x4, btn6x4, btn7x4},
                {btn0x5, btn1x5, btn2x5, btn3x5, btn4x5, btn5x5, btn6x5, btn7x5},
                {btn0x6, btn1x6, btn2x6, btn3x6, btn4x6, btn5x6, btn6x6, btn7x6},
                {btn0x7, btn1x7, btn2x7, btn3x7, btn4x7, btn5x7, btn6x7, btn7x7}};
        if (Dturns > 0) {
            if(matrix[x][y] == true){
                timeline.pause();
                System.out.print("Juego Terminado");
                btn[x][y].setStyle("-fx-background-color: #ff0000; ");
            }
            else if (isClicked[x][y] == false) {
                bombs = x_pos(x, y) + x_neg(x, y) + y_pos(x, y) + y_neg(x, y)
                        + x_pos_y_pos(x, y) + x_neg_y_pos(x, y) + x_pos_y_neg(x, y)
                        + x_neg_y_neg(x, y);
                btn[x][y].setText(String.valueOf(bombs));
                btn[x][y].setStyle("-fx-background-color: #e6d7ff; ");
            }
        }
        else{
            Dturns = 0;
        }
    }

    void expert(){
        int i = 0;
        int j = 0;
        Button[][] btn = {{btn0x0, btn1x0, btn2x0, btn3x0, btn4x0, btn5x0, btn6x0, btn7x0},
                {btn0x1, btn1x1, btn2x1, btn3x1, btn4x1, btn5x1, btn6x1, btn7x1},
                {btn0x2, btn1x2, btn2x2, btn3x2, btn4x2, btn5x2, btn6x2, btn7x2},
                {btn0x3, btn1x3, btn2x3, btn3x3, btn4x3, btn5x3, btn6x3, btn7x3},
                {btn0x4, btn1x4, btn2x4, btn3x4, btn4x4, btn5x4, btn6x4, btn7x4},
                {btn0x5, btn1x5, btn2x5, btn3x5, btn4x5, btn5x5, btn6x5, btn7x5},
                {btn0x6, btn1x6, btn2x6, btn3x6, btn4x6, btn5x6, btn6x6, btn7x6},
                {btn0x7, btn1x7, btn2x7, btn3x7, btn4x7, btn5x7, btn6x7, btn7x7}};
        if (Eturns > 0){
            LinkedList SafeList = new LinkedList();
            LinkedList UncertainList = new LinkedList();
            LinkedList GeneralList = new LinkedList();
            for (j = 0; j < 8; j++){
                for (i = 0; i < 8; i++){
                    if (isClicked[i][j] == false) {
                        GeneralList.insertLast(btn[i][j]);
                    }
                }
            }
            System.out.println("Lista General:");
            GeneralList.displayList();
            System.out.println("Lista Segura");
            SafeList.displayList();
            System.out.println("Lista Incertidumbre");
            UncertainList.displayList();
            int x = 0;
            int y = 0;
            for (x = 0; x < 8; x++){
                for (y = 0; y < 8; y++){
                    if (totalBombs(x + 1, y) == 0){
                        SafeList.insertLast(GeneralList.find(btn[x][y]).getData());
                        GeneralList.deleteFirst();
                    }
                    else{
                        UncertainList.insertLast(GeneralList.find(btn[x][y]).getData());
                        GeneralList.deleteFirst();
                    }
                }
            }
            System.out.println("Lista General:");
            GeneralList.displayList();
            System.out.println("Lista Segura");
            SafeList.displayList();
            System.out.println("Lista Incertidumbre");
            UncertainList.displayList();
        }
        else{
            Eturns = 0;
        }
    }
    @FXML
    void clickDummy(ActionEvent event) {
        game_start = true;
        int x = 0;
        int y = 0;
        if (game_start){
            Dturns++;
            fldTime.setText(time.getCurrentTime());
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
            for (y = 0; y < 8; y++){
                for (x = 0; x < 8; x++){
                    Tile tiles = new Tile(x, y, Math.random() < 0.3, false);
                    matrix[x][y] = tiles.get_hasBomb();
                    System.out.print(matrix[x][y] + " ");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("La matriz de juego ya fue definida");
        }
    }

    @FXML
    void clickExpert(ActionEvent event) {
        game_start = true;
        int x = 0;
        int y = 0;
        if (game_start){
            Eturns++;
            fldTime.setText(time.getCurrentTime());
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
            for (y = 0; y < 8; y++){
                for (x = 0; x < 8; x++){
                    Tile tiles = new Tile(x, x, Math.random() < 0.3, false);
                    matrix[x][y] = tiles.get_hasBomb();
                    isClicked[x][y] = tiles.isClicked();
                    System.out.print(matrix[x][y] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("La matriz de juego ya fue definida");
        }
    }
}

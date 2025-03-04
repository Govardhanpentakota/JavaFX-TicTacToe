package tictactoygame;

import java.util.ArrayList;
import java.util.Random;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class TicTacToyGame extends Application {

    //Button btn0 = new Button();
    Button btn1 = new Button();
    Button btn2 = new Button();
    Button btn3 = new Button();
    Button btn4 = new Button();
    Button btn5 = new Button();
    Button btn6 = new Button();
    Button btn7 = new Button();
    Button btn8 = new Button();
    Button btn9 = new Button();

    @Override
    public void start(Stage primaryStage) {

        btn1.setText(" ");
        btn1.setOnAction(event -> {
            playGame(1, btn1);
        });

        btn2.setText(" ");
        btn2.setOnAction(event -> {
            playGame(2, btn2);
        });

        btn3.setText(" ");
        btn3.setOnAction(event -> {
            playGame(3, btn3);
        });

        btn4.setText(" ");
        btn4.setOnAction(event -> {
            playGame(4, btn4);
        });

        btn5.setText(" ");
        btn5.setOnAction(event -> {
            playGame(5, btn5);
        });

        btn6.setText(" ");
        btn6.setOnAction(event -> {
            playGame(6, btn6);
        });

        btn7.setText(" ");
        btn7.setOnAction(event -> {
            playGame(7, btn7);
        });

        btn8.setText(" ");
        btn8.setOnAction(event -> {
            playGame(8, btn8);
        });

        btn9.setText(" ");
        btn9.setOnAction(event -> {
            playGame(9, btn9);
        });

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        grid.add(btn1, 0, 0);
        grid.add(btn2, 1, 0);
        grid.add(btn3, 2, 0);
        grid.add(btn4, 0, 1);
        grid.add(btn5, 1, 1);
        grid.add(btn6, 2, 1);
        grid.add(btn7, 0, 2);
        grid.add(btn8, 1, 2);
        grid.add(btn9, 2, 2);

        Scene scene = new Scene(grid, 400, 400);
        scene.getStylesheets()
                .add(TicTacToyGame.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("Tic Toy Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    ArrayList<Integer> player1 = new ArrayList<>();
    ArrayList<Integer> player2 = new ArrayList<>();
    int Activeplayer = 1;

    void playGame(int CellId, Button SelectedButton) {
        System.out.println("CellId: " + CellId);
        if (Activeplayer == 1) {
            SelectedButton.setText("X");
            player1.add(CellId);
            Activeplayer = 2;
            Autoplayer();
        } else if (Activeplayer == 2) {
            SelectedButton.setText("O");
            player2.add(CellId);
            Activeplayer = 1;
        }
        SelectedButton.setDisable(true);

        CheckerWinner();

    }

    void CheckerWinner() {
        int winner = -1;
        //Rows
        if (player1.contains(0) && player1.contains(1) && player1.contains(2)) {
            winner = 1;
        }
        if (player2.contains(0) && player2.contains(1) && player2.contains(2)) {
            winner = 2;
        }
        if (player1.contains(3) && player1.contains(4) && player1.contains(5)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(4) && player2.contains(5)) {
            winner = 2;
        }
        if (player1.contains(6) && player1.contains(7) && player1.contains(8)) {
            winner = 1;
        }
        if (player2.contains(6) && player2.contains(7) && player2.contains(8)) {
            winner = 2;
        }
        //Colums
        if (player1.contains(0) && player1.contains(3) && player1.contains(7)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winner = 2;
        }
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winner = 1;
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winner = 2;
        }
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winner = 2;
        }
        //Cross
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winner = 1;
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winner = 2;
        }
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winner = 1;
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winner = 2;
        }

        if (winner != -1) {
            String Msg = "";
            if (winner == 1) {
                Msg = "player 1 is the winner";
            }
            if (winner == 2) {
                Msg = "player 2 is the winner";
            }

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Game Info");
            alert.setContentText(Msg);
            alert.setHeaderText("Playing Info");
            alert.show();
        }
    }

    void Autoplayer() {
        ArrayList<Integer> Emptycells = new ArrayList<>();
        for (int cell = 1; cell < 10; cell++) {
            if (!(player1.contains(cell)) && !(player2.contains(cell))) {
                Emptycells.add(cell);
            }
        }
        Random r = new Random();
        int randindex = r.nextInt(Emptycells.size());
        int CellId = Emptycells.get(randindex);
        Button SelectedButton;
        switch (CellId) {
            case 1:
                SelectedButton = btn1;
                break;
            case 2:
                SelectedButton = btn2;
                break;
            case 3:
                SelectedButton = btn3;
                break;
            case 4:
                SelectedButton = btn4;
                break;
            case 5:
                SelectedButton = btn5;
                break;
            case 6:
                SelectedButton = btn6;
                break;
            case 7:
                SelectedButton = btn7;
                break;
            case 8:
                SelectedButton = btn8;
                break;
            case 9:
                SelectedButton = btn9;
                break;
            default:
                SelectedButton = btn1;
        }
        playGame(CellId, SelectedButton);
        SelectedButton.setDisable(true);
    }

    public static void main(String[] args) {
        launch(args);
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameView extends Frame {
    private Button[] buttons;
    private Button newGameButton;
    private Label statusLabel;

    public GameView() {
        setLayout(null);
        setSize(800, 600);
        setLocation(400, 200);
        setBackground(Color.black);
        setForeground(Color.white);

        buttons = new Button[9];
        int x = 8, y = 28;

        for (int i = 0; i < 9; i++) {
            buttons[i] = new Button();
            buttons[i].setSize(100, 100);
            buttons[i].setLocation(x, y);
            buttons[i].setFont(new Font("", Font.BOLD, 40));
            buttons[i].setBackground(new Color(255, 141, 28));
            add(buttons[i]);
            x += 100;
            if (i % 3 == 2) { // Move to the next row
                x = 8;
                y += 100;
            }
        }

        newGameButton = new Button("New Game");
        newGameButton.setSize(150, 40);
        newGameButton.setLocation(500, 300);
        newGameButton.setFont(new Font("", Font.BOLD, 20));
        newGameButton.setForeground(Color.black);
        add(newGameButton);

        statusLabel = new Label("");
        statusLabel.setSize(300, 50);
        statusLabel.setLocation(320, 100);
        statusLabel.setFont(new Font("", Font.BOLD, 20));
        add(statusLabel);

        setVisible(true);
    }

    public void setButtonLabel(int index, String label) {
        buttons[index].setLabel(label);
    }

    public void clearBoard() {
        for (Button button : buttons) {
            button.setLabel("");
        }
        statusLabel.setText("");
    }

    public void setStatus(String status) {
        statusLabel.setText(status);
    }

    public Button[] getButtons() {
        return buttons;
    }

    public Button getNewGameButton() {
        return newGameButton;
    }
}

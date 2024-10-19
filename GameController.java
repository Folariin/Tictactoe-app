import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class GameController implements ActionListener {
    private GameModel model;
    private GameView view;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        
        for (Button button : view.getButtons()) {
            button.addActionListener(this);
        }
        
        view.getNewGameButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getNewGameButton()) {
            model.resetGame();
            view.clearBoard();
            view.setStatus("");
        } else {
            for (int i = 0; i < view.getButtons().length; i++) {
                if (e.getSource() == view.getButtons()[i]) {
                    if (model.makeMove(i)) {
                        view.setButtonLabel(i, model.getBoard()[i]);
                        String winner = model.getWinner();
                        if (!winner.isEmpty()) {
                            view.setStatus(winner + " wins!");
                        }
                    }
                    break;
                }
            }
        }
    }
}

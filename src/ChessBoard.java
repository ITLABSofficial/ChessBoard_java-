import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int boardSize = 8;
        int cellSize = 60;

        // Satranç tahtasını çiz
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE);
                } else {
                    g.setColor(Color.BLACK);
                }
                g.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Satranç Tahtası/ Chess board");
        ChessBoard chessBoard = new ChessBoard();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 480);
        frame.add(chessBoard);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class chessbord extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int boardSize = 8;
        int cellSize = 60; // Her bir hücrenin boyutu (px)

        // Satranç tahtasını çiz
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.WHITE); // Beyaz kare
                } else {
                    g.setColor(Color.BLACK); // Siyah kare
                }
                g.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Satranç Tahtası");
        ChessBoard chessBoard = new ChessBoard();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 480); // 8x8 kare * 60px
        frame.add(chessBoard);
        frame.setVisible(true);
    }
}

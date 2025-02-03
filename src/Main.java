import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
        // ChessBoard
        ChessBoard chessBoard = new ChessBoard();

        // Pencereyi başlatıyoruz
        JFrame frame = new JFrame("Satranç Tahtası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(480, 480); // 8x8 kare * 60px
        frame.add(chessBoard);
        frame.setVisible(true);
    }
}

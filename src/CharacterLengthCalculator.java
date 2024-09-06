import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CharacterLengthCalculator extends JPanel {

    private Font font;

    public CharacterLengthCalculator(Font font) {
        this.font = font;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics();

        char[] characters = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '`', '{', '|', '}', '~'
        };
        for (int i = 0; i < characters.length; i++) {
            int length = metrics.charWidth(characters[i]);
            g.drawString("Length of '" + characters[i] + "': " + length, 10, 20 + (i * 20));
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Character Length Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Example font with size 12, bold and italic
        Font font = new Font("Calibri", Font.BOLD | Font.ITALIC, 30);
        CharacterLengthCalculator panel = new CharacterLengthCalculator(font);

        frame.add(panel);
        frame.setVisible(true);
    }
}

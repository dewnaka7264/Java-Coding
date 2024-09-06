package BigJava;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class imageDisplay
{
    public static void main(String[] args) throws Exception
    {
        URL imageLocation = new URL(
                "http://horstmann.com/bigjava/duke.gif");
        JOptionPane.showMessageDialog(null, "Hello", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
        System.exit(0);
    }
}

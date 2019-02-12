package github;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = JOptionPane.showInputDialog(null, "Please enter your name");
        JOptionPane.showMessageDialog(null,"Hello " + name + "!");
    }
}

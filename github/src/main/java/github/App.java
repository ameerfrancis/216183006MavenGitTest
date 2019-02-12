package github;
import javax.swing.JOptionPane;

public class App 
{
    public static void main( String[] args )
    {
        String studentID = JOptionPane.showInputDialog(null, "Please enter your student ID");
        JOptionPane.showMessageDialog(null,"Hello " + studentID + "!");
    }
}

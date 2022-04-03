import javax.swing.JOptionPane;

public class GUI {
    public static void main (String[] args){
        String name = JOptionPane.showInputDialog("What is your name ");
        JOptionPane.showMessageDialog(null , "hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("what is your age"));
        JOptionPane.showMessageDialog(null , "you are "+ age + " year old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("what is your age "));
        JOptionPane.showMessageDialog(null, "your height is "+ height + " cm long.");

    }
}
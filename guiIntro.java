import javax.swing.JOptionPane;
public class guiIntro {
    public static void main(String[] args){

        String name=JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null,"Hello "+name);

        int age=Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        if (age<=18){
            JOptionPane.showMessageDialog(null,"You are "+age+" years old"+" you can enter");
        }else {
            JOptionPane.showMessageDialog(null,"you can not enter");
        }













    }
}

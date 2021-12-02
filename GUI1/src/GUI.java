import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
public class GUI 
{
    JFrame frame;
    JButton ok,cancel;
    JTextField text;
public void initialization()
{
ok = new JButton("OK"); 
cancel = new JButton("Cancel");
frame = new JFrame("My Frame");
text = new JTextField("My Text Field");
frame.setLayout(new FlowLayout());
frame.add(ok);
frame.add(cancel);
frame.add(text);

frame.setVisible(true);
frame.setSize(200,150);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public GUI()
{
    initialization();
}
}

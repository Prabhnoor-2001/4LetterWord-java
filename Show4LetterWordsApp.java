import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Show4LetterWordsApp extends JFrame  {
  JButton btnGet;
  JTextField jtfEnter;
  JTextArea display;
  private ArrayList<String> words = new ArrayList<String>();

  public Show4LetterWordsApp() {
	jtfEnter = new JTextField("Enter Word", 20);
    display = new JTextArea(10,40);
    btnGet = new JButton("Get 4 letter words");
    btnGet.addActionListener(new MyListener());
    jtfEnter.addActionListener(new MyListener());
    JPanel commandpanel = new JPanel();
    commandpanel.add(new JLabel("Enter word: "));
    commandpanel.add(jtfEnter);
    commandpanel.add(btnGet);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().add(commandpanel, BorderLayout.NORTH);
    getContentPane().add(display, BorderLayout.CENTER);
    setSize(600, 300);
    setVisible(true);
  }
  class MyListener implements ActionListener{
    public void actionPerformed(ActionEvent e) {
	  if (e.getSource() == jtfEnter) {
	    //complete this
		words.add(jtfEnter.getText());
		display.append(jtfEnter.getText()+"\n");
		jtfEnter.setText("");
		
	  }
	  else if (e.getSource() == btnGet) {
        //complete this
		display.setText("");
		for (String word: words){
			if(word.length() == 4)
				display.append(word+"\n");
		}
      }
    }
  }
  public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      public void run() {new Show4LetterWordsApp();}
    });
  }
}

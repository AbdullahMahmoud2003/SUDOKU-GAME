import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainMenu extends JFrame implements ActionListener{
	JButton newGame= new JButton("NEW GAME");
	JButton settings= new JButton("SETTINGS");
	JButton exit= new JButton("EXIT");
	JLabel title=new JLabel("SUDOKU");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	
	mainMenu(){
		this.setTitle("SUDOKU");
		this.setLayout(null);
		this.setSize(600,600);
		this.setBackground(Color.WHITE);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        title.setBounds(156,40,300,64);
        title.setForeground(Color.BLUE);
        title.setFont(new Font("",Font.BOLD,64));
        title.setFocusable(false);
        
        newGame.setBounds(194,150,200,50);
        newGame.setBackground(Color.BLUE);
        newGame.setForeground(Color.WHITE);
        newGame.setFocusable(false);
        newGame.addActionListener(this);
        
        settings.setBounds(194,250,200,50);
        settings.setBackground(Color.BLUE);
        settings.setForeground(Color.WHITE);
        settings.setFocusable(false);
        settings.addActionListener(this);
        
        exit.setBounds(194,350,200,50);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        exit.setFocusable(false);
        exit.addActionListener(this);
        
        coder.setBounds(194,430,300,64);
        coder.setForeground(Color.BLUE);
        coder.setFont(new Font("",Font.BOLD,16));
        coder.setFocusable(false);
        
        this.add(title);
        this.add(newGame);
        this.add(settings);
        this.add(exit);
        this.add(coder);
	}
	
	
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == exit)
        {
            System.exit(0);
        }

        if(e.getSource() == newGame)
        {
        	new newGame();
            this.dispose();
        }
        if(e.getSource() == settings)
        {
            this.dispose();
        }

    }

}

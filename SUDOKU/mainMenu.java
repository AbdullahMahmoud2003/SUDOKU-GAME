import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainMenu extends JFrame implements ActionListener{
	JButton newGame= new JButton("NEW GAME");
	JButton settingsButt= new JButton("SETTINGS");
	JButton exit= new JButton("EXIT");
	JLabel title=new JLabel("SUDOKU");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	
	mainMenu(){
		this.setTitle("SUDOKU");
		this.setLayout(null);
		this.setSize(600,600);
		this.getContentPane().setBackground(settings.defaultColor);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        title.setBounds(156,40,300,64);
        title.setForeground(settings.defaultAntiColor);
        title.setFont(new Font("",Font.BOLD,64));
        title.setFocusable(false);
        
        newGame.setBounds(194,150,200,50);
        newGame.setBackground(settings.defaultAntiColor);
        newGame.setForeground(settings.defaultColor);
        newGame.setFocusable(false);
        newGame.addActionListener(this);
        
        settingsButt.setBounds(194,250,200,50);
        settingsButt.setBackground(settings.defaultAntiColor);
        settingsButt.setForeground(settings.defaultColor);
        settingsButt.setFocusable(false);
        settingsButt.addActionListener(this);
        
        exit.setBounds(194,350,200,50);
        exit.setBackground(settings.defaultAntiColor);
        exit.setForeground(settings.defaultColor);
        exit.setFocusable(false);
        exit.addActionListener(this);
        
        coder.setBounds(194,430,300,64);
        coder.setForeground(settings.defaultAntiColor);
        coder.setFont(new Font("",Font.BOLD,16));
        coder.setFocusable(false);
        
        this.add(title);
        this.add(newGame);
        this.add(settingsButt);
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
        if(e.getSource() == settingsButt)
        {
        	new settings();
            this.dispose();
        }

    }

}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class settings extends JFrame implements ActionListener{
	static Color defaultColor= Color.WHITE;
	static Color defaultAntiColor=Color.BLUE;
	
	JButton darkTheme=new JButton("DARK THEME");
	JButton chances=new JButton("CHANCES");
	JLabel title=new JLabel("SETTINGS");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	JButton back=new JButton("BACK");
	
	settings(){
		this.setTitle("SUDOKU");
		this.setLayout(null);
		this.setSize(600,600);
		this.getContentPane().setBackground(settings.defaultColor);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        title.setBounds(130,40,400,64);
        title.setForeground(settings.defaultAntiColor);
        title.setFont(new Font("",Font.BOLD,64));
        title.setFocusable(false);
        
        darkTheme.setBounds(194,150,200,50);
        darkTheme.setBackground(settings.defaultAntiColor);
        darkTheme.setForeground(settings.defaultColor);
        darkTheme.setFocusable(false);
        darkTheme.addActionListener(this);
        
        chances.setBounds(194,250,200,50);
        chances.setBackground(settings.defaultAntiColor);
        chances.setForeground(settings.defaultColor);
        chances.setFocusable(false);
        chances.addActionListener(this);
        
        back.setBounds(194,350,200,50);
        back.setBackground(settings.defaultAntiColor);
        back.setForeground(settings.defaultColor);
        back.setFocusable(false);
        back.addActionListener(this);
        
        coder.setBounds(194,430,300,64);
        coder.setForeground(settings.defaultAntiColor);
        coder.setFont(new Font("",Font.BOLD,16));
        coder.setFocusable(false);
        
        this.add(title);
        this.add(darkTheme);
        this.add(chances);
        this.add(coder);
        this.add(back);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back)
        {
            new mainMenu();
            this.dispose();
        }
        if(e.getSource()==darkTheme)
        {
        	defaultColor=Color.BLACK;
        	defaultAntiColor=Color.GREEN;
        }

    }
	
}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class settings extends JFrame implements ActionListener{
	static Color defaultColor= Color.WHITE;
	static Color defaultAntiColor=Color.BLUE;
	static boolean colorChanged=false;
	static int getChances=3;
	
	JButton darkTheme=new JButton("DARK THEME");
	JButton chances=new JButton("VALUE OF CHANCES");
	JLabel title=new JLabel("SETTINGS");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	JButton back=new JButton("BACK");
	JPanel chancesPanel=new JPanel();
	static JLabel remValue=new JLabel();
	
	settings(){
		if(getChances==-1)
			remValue.setText("Infinite number");
		else remValue.setText(String.valueOf(getChances));
		
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
        
        darkTheme.setBounds(194,150,200,70);
        darkTheme.setBackground(settings.defaultAntiColor);
        darkTheme.setForeground(settings.defaultColor);
        darkTheme.setFocusable(false);
        darkTheme.addActionListener(this);
        
        chances.setBackground(settings.defaultAntiColor);
        chances.setForeground(settings.defaultColor);
        chances.setFont(new Font("",Font.BOLD,16));
        chances.setFocusable(false);
        chances.addActionListener(this);
        remValue.setForeground(settings.defaultColor);
        remValue.setFont(new Font("",Font.BOLD,16));
        
        chancesPanel.setBounds(194,250,200,70);
        chancesPanel.setBackground(settings.defaultAntiColor);
        chancesPanel.setFocusable(false);
        chancesPanel.add(chances);
        chancesPanel.add(remValue);
        
        back.setBounds(194,350,200,70);
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
        this.add(chancesPanel);
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
        	if(colorChanged)
        	{
        		defaultColor=Color.WHITE;
        		defaultAntiColor=Color.BLUE;
        		colorChanged=false;
        	}else {
            	defaultColor=Color.BLACK;
            	defaultAntiColor=Color.GREEN;
            	colorChanged=true;
        	}
        	new settings();
        	this.dispose();
        }
        if(e.getSource()==chances)
        {
        	if(getChances==3)
        		getChances=5;
        	else if(getChances==5)
        		getChances=10;
        	else if(getChances==10)
        		getChances=-1;
        	else getChances=3;
    		if(getChances==-1)
    			remValue.setText("Infinite number");
    		else remValue.setText(String.valueOf(getChances));
        }

    }
	
}

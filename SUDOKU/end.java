import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class end extends JFrame implements ActionListener{
	
	String win="YOU WIN!";
	String lose="YOU LOSE";
	int show =0;
	JButton exit= new JButton("EXIT");
	JButton mainMenu=new JButton("MAIN MENU");
	JLabel text=new JLabel();
	JLabel score=new JLabel();
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	end(int state){
		this.setTitle("SUDOKU");
		this.setLayout(null);
		this.setSize(600,600);
		this.getContentPane().setBackground(settings.defaultColor);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        if(state==1)
        {
        	text.setText(win);
        	int result=timer.elapsedTime;
        	if(result<=420000+420000*newGame.choice)
        		show = 10;
        	else {
        		result-=(420000+420000*newGame.choice);
        		show=9-result/(60000+60000*newGame.choice);
        		if(show<0)
        			show=0;
        	}
        }else {
        	show=0;
        	text.setText(lose);
        }
        text.setBounds(141,50,300,50);
        text.setForeground(settings.defaultAntiColor);
        text.setFont(new Font("",Font.BOLD,43));
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setFocusable(false);
        
        score.setText("YOU GOT "+String.valueOf(show)+"!");
        score.setBounds(141,130,300,50);
        score.setForeground(settings.defaultAntiColor);
        score.setFont(new Font("",Font.BOLD,32));
        score.setHorizontalAlignment(SwingConstants.CENTER);
        score.setFocusable(false);
        
        mainMenu.setBounds(197,230,190,50);
        mainMenu.setBackground(settings.defaultAntiColor);
        mainMenu.setForeground(settings.defaultColor);
        mainMenu.setFocusable(false);
        mainMenu.addActionListener(this);
        
        exit.setBounds(197,330,190,50);
        exit.setBackground(settings.defaultAntiColor);
        exit.setForeground(settings.defaultColor);
        exit.setFocusable(false);
        exit.addActionListener(this);
        
        coder.setBounds(192,430,300,64);
        coder.setForeground(settings.defaultAntiColor);
        coder.setFont(new Font("",Font.BOLD,16));
        coder.setFocusable(false);
        
        this.add(text);
        this.add(score);
        this.add(mainMenu);
        this.add(exit);
        this.add(coder);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==exit)
		{
			System.exit(0);
		}
		if(e.getSource()==mainMenu)
			{
				this.dispose();
				new mainMenu();
			}
	}

}

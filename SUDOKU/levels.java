import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class levels extends JFrame implements ActionListener{
	
	JLabel title=new JLabel(newGame.levelType);
	JButton back=new JButton("BACK");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	JPanel levelsPanel=new JPanel();
	JButton[] levels=new JButton[9];
	static int level=0;
	static board borde;
	int station=0;
	
	levels(int choose){
		station=choose;
		
		this.setTitle("SUDOKU");
		this.setLayout(null);
		this.setSize(600,600);
		this.getContentPane().setBackground(settings.defaultColor);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		
        title.setBounds(123,40,400,64);
        title.setForeground(settings.defaultAntiColor);
        title.setFont(new Font("",Font.BOLD,64));
        title.setFocusable(false);
        
        for(int i=0;i<9;i++)
        {
            this.add(levels[i]=new JButton());
            levels[i].addActionListener(this);
            int f=0;
            if(i/3==1)
            	f=70;
            else if(i/3==2)
            	f=140;
        	levels[i].setText(String.valueOf(i+1));
        	levels[i].setBounds(123+132*(i%3),150+f,99,32);
            levels[i].setBackground(settings.defaultAntiColor);
            levels[i].setForeground(settings.defaultColor);
            levels[i].setFont(new Font("",Font.BOLD,32));
            levels[i].setFocusable(false);
        }
        
        back.setBounds(204,370,200,50);
        back.setBackground(settings.defaultAntiColor);
        back.setForeground(settings.defaultColor);
        back.setFocusable(false);
        back.addActionListener(this);
        
        coder.setBounds(204,430,300,64);
        coder.setForeground(settings.defaultAntiColor);
        coder.setFont(new Font("",Font.BOLD,16));
        coder.setFocusable(false);
        
        
        this.add(title);
        this.add(back);
        this.add(coder);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==back)
			{
				new newGame();
				this.dispose();
			}
			for(int i=0;i<9;i++)
			{
				if(e.getSource()==levels[i])
				{
					level=i+9*station;
					borde=new board();
					this.dispose();
				}
			}
			
        }

}

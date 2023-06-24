import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class board extends JFrame implements ActionListener{
	
	JLabel title=new JLabel("SUDOKU");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	
	JButton[][] buttons=new JButton[9][9];
	JButton[][] numbers=new JButton[3][3];
	JButton back=new JButton("BACK");
	
	board()
	{
		this.setTitle("SUDOKU");
		this.setLayout(null);
		this.setSize(1580,800);
		this.getContentPane().setBackground(settings.defaultColor);
		this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setFocusable(false);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        
        title.setBounds(650,20,280,64);
        title.setForeground(settings.defaultAntiColor);
        title.setFont(new Font("",Font.BOLD,64));
        title.setFocusable(false);
        
        coder.setBounds(650,730,300,64);
        coder.setForeground(settings.defaultAntiColor);
        coder.setFont(new Font("",Font.BOLD,21));
        coder.setFocusable(false);
        
        back.setBounds(1020,515,210,50);
        back.setBackground(settings.defaultAntiColor);
        back.setForeground(settings.defaultColor);
        back.setFocusable(false);
        back.addActionListener(this);
        
        for(int j=0;j<9;j++)
        {
        	int posH=93+j*70;
        	for(int i=0;i<9;i++)
        	{
        		this.add(buttons[j][i]=new JButton());
        		buttons[j][i].setBounds(175+i*70,posH,70,70);
                buttons[j][i].setBackground(settings.defaultAntiColor);
                buttons[j][i].setForeground(settings.defaultColor);
                buttons[j][i].setFont(new Font("",Font.BOLD,32));
                buttons[j][i].setFocusable(false);
        	}
        }
        
        for(int j=0;j<3;j++)
        {
        	int posH=303+j*70;
        	for(int i=0;i<3;i++)
        	{
        		this.add(numbers[j][i]=new JButton());
        		numbers[j][i].setText(String.valueOf(i+1+j*3));
        		numbers[j][i].setBounds(1020+i*70,posH,70,70);
                numbers[j][i].setBackground(settings.defaultAntiColor);
                numbers[j][i].setForeground(settings.defaultColor);
                numbers[j][i].setFont(new Font("",Font.BOLD,32));
                numbers[j][i].setFocusable(false);
        	}
        }
        
        this.add(title);
        this.add(coder);
        this.add(back);
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==back)
			{
				new levels();
				this.dispose();
			}
        }
	
}

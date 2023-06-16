import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class newGame extends JFrame implements ActionListener{
	
	JButton easy=new JButton("EASY");
	JButton medium=new JButton("MEDIUM");
	JButton hard=new JButton("HARD");
	JButton back=new JButton("BACK");
	JLabel title=new JLabel("SUDOKU");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");

	newGame(){
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
        
        easy.setBounds(194,150,200,50);
        easy.setBackground(Color.BLUE);
        easy.setForeground(Color.WHITE);
        easy.setFocusable(false);
        easy.addActionListener(this);
        
        medium.setBounds(194,230,200,50);
        medium.setBackground(Color.BLUE);
        medium.setForeground(Color.WHITE);
        medium.setFocusable(false);
        medium.addActionListener(this);
        
        hard.setBounds(194,310,200,50);
        hard.setBackground(Color.BLUE);
        hard.setForeground(Color.WHITE);
        hard.setFocusable(false);
        hard.addActionListener(this);
        
        back.setBounds(194,390,200,50);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.addActionListener(this);
        
        coder.setBounds(194,460,300,64);
        coder.setForeground(Color.BLUE);
        coder.setFont(new Font("",Font.BOLD,16));
        coder.setFocusable(false);
        
        this.add(title);
        this.add(easy);
        this.add(medium);
        this.add(hard);
        this.add(back);
        this.add(coder);
	}
	
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == easy)
        {
            this.dispose();
        }

        if(e.getSource() == medium)
        {
            this.dispose();
        }
        if(e.getSource() == hard)
        {
            this.dispose();
        }
        if(e.getSource()==back)
        {
        	new mainMenu();
        	this.dispose();
        }

    }
}

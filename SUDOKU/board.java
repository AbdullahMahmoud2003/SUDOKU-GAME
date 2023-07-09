import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class board extends JFrame implements ActionListener{
	
	static int chances=3;
	JLabel title=new JLabel("SUDOKU");
	JLabel coder=new JLabel("BY ABDULLAH MAHMOUD");
	JLabel remChances=new JLabel("REMAINING CHANCES =");
	static JLabel remValue=new JLabel();
	static JLabel playerTimerLabel = new JLabel();
	static JButton[][] buttons=new JButton[9][9];
	static JButton[][] numbers=new JButton[3][3];
	JPanel chancesPanel=new JPanel();
	JPanel timePanel=new JPanel();
	JButton back=new JButton("BACK");
	static timer playerTimer=new timer();
	
    static  Timer timer = new Timer(1000, new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            playerTimerLabel.setText("Time = "+playerTimer.minutes_string+":"+playerTimer.seconds_string);
        }

    });
	
	board()
	{
		playerTimer.reset();
		playerTimer.start();
		timer.start();
		chances=settings.getChances;
		if(chances==-1)
			remValue.setText("Infinite number");
		else remValue.setText(String.valueOf(chances));
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
        
        remChances.setBounds(20,40,10,20);
        remChances.setForeground(settings.defaultColor);
        remChances.setFont(new Font("",Font.BOLD,17));
        remValue.setForeground(settings.defaultColor);
        remValue.setFont(new Font("",Font.BOLD,16));
        
        chancesPanel.setBounds(1020,440,210,60);
        chancesPanel.setBackground(settings.defaultAntiColor);
        chancesPanel.add(remChances);
        chancesPanel.add(remValue);
        
        playerTimerLabel.setFocusable(false);
        playerTimerLabel.setBounds(1020, 515, 210, 20);
        playerTimerLabel.setForeground(settings.defaultColor);
        playerTimerLabel.setFont(new Font("", Font.BOLD, 17));
        
        timePanel.setBounds(1020,520,210,35);
        timePanel.setBackground(settings.defaultAntiColor);
        timePanel.add(playerTimerLabel);
        
        back.setBounds(1020,575,210,60);
        back.setBackground(settings.defaultAntiColor);
        back.setForeground(settings.defaultColor);
        back.setFocusable(false);
        back.addActionListener(this);
        
        for(int j=0;j<9;j++)
        {
            int spaces=-9;
        	int posH=93+j*70;
        	if(j%3==0)
        		posH+=3;
        	for(int i=0;i<9;i++)
        	{
        		if(i%3==0)
        			spaces+=3;
        		this.add(buttons[j][i]=new JButton(matches.Games[levels.level].valueOf(matches.Games[levels.level].charAt(i+9*j))));
        		buttons[j][i].setBounds(175+i*70+spaces,posH,70,70);
                buttons[j][i].setBackground(settings.defaultAntiColor);
                buttons[j][i].setForeground(settings.defaultColor);
                buttons[j][i].setFont(new Font("",Font.BOLD,32));
                buttons[j][i].setFocusable(false);
        	}
        }
        
        for(int j=0;j<3;j++)
        {
        	int posH=203+j*70;
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
        this.add(chancesPanel);
        this.add(timePanel);
        this.add(back);
		new buttonsCatcher();
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
			
			if(e.getSource()==back)
			{
				new levels(newGame.choice);
				this.dispose();
			}
        }
	
}

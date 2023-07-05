import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonsCatcher implements ActionListener{
	
	buttonsCatcher(){
		for(int j=0;j<9;j++)
		{
			for(int i=0;i<9;i++)
			{
				board.buttons[j][i].addActionListener(this);
			}
		}
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int j=0;j<9;j++)
		{
			for(int i=0;i<9;i++)
			{
				if(e.getSource()==board.buttons[j][i]&&board.buttons[j][i].getText().equals(" "))
				{
					
					for(int f=0;f<9;f++)
						for(int g=0;g<9;g++)
							board.buttons[f][g].setBackground(settings.defaultAntiColor);
					
					
					board.buttons[j][i].setBackground(Color.DARK_GRAY);
					new numberCatcher(j,i);
				}
			}
		}
	}
}

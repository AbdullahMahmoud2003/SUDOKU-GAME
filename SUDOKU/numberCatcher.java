import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numberCatcher implements ActionListener{
	int row,col;
	static int duplicate=1;
	boolean hasPressed=false;
	
	numberCatcher(int row,int col)
	{
		duplicate=1;
		this.row=row;
		this.col=col;
		
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				board.numbers[j][i].addActionListener(this);
			}
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int j=0;j<3;j++)
		{
			for(int i=0;i<3;i++)
			{
				if(e.getSource()==board.numbers[j][i]&&board.buttons[row][col].getBackground()==Color.DARK_GRAY)
				{
					if(j*3+i+1==matches.easySols[levels.level].charAt(row*9+col)-'0')
					{
						board.buttons[row][col].setText(String.valueOf(j*3+i+1));
						hasPressed=true;
						board.buttons[row][col].setBackground(settings.defaultAntiColor);
					}else {
						if(board.chances!=0)
						{
							board.chances--;
							board.remValue.setText(String.valueOf(board.chances));
							board.buttons[row][col].setBackground(Color.RED);
						}else if(duplicate==1){
							duplicate=0;
							new newGame();
							levels.borde.dispose();
						}
					}
				}
			}
		}

	}
}

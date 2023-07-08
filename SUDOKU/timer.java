import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;


public class timer {
	
    JLabel timeLabel = new JLabel();
  static   int timeMinutes=0;
    static int elapsedTime = 0;
    int seconds =0;
    int minutes =timeMinutes;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
	
    Timer timer = new Timer(1000, new ActionListener() {

        public void actionPerformed(ActionEvent e) {

            elapsedTime=elapsedTime+1000;
            minutes = (elapsedTime/60000) % 60;
            seconds = (elapsedTime/1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
        }

    });
    
    timer(){

        timeLabel.setBounds(100,100,200,100);
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);


    }
    
    void start() {
        timer.start();
    }

    void stop() {
        timer.stop();
    }
    
    void reset() {
        timer.stop();
        elapsedTime=0;
        seconds =0;
        minutes=0;

        seconds_string = String.format("%02d", seconds);
        minutes_string = String.format("%02d", minutes);

    }

}

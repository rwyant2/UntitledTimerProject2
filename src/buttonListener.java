import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Richard on 5/30/2017.
 */
public class buttonListener implements ActionListener {

    PocketTimer gui; // parent GUI
    Thread countdown;
    int timeLeft;
    timerListener tL = new timerListener(this); // send this listener to timerListener
    Timer t = new Timer(1000,tL);

    public buttonListener(PocketTimer in){
        gui = in;
    }

    public void actionPerformed(ActionEvent e) {
        gui.start.setEnabled(false);
        gui.seconds.setEnabled(false);
        timeLeft = (int) gui.seconds.getValue();
        gui.lblCountdown.setVisible(true);
        gui.lblCountdown.setText(String.valueOf(timeLeft));
        t.setLogTimers(true);
        t.start();
    }
}

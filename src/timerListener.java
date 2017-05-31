import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Richard on 5/23/2017.
 */
public class timerListener implements ActionListener {

    buttonListener parentBL;

    public timerListener(buttonListener parent) {
        parentBL = parent;
    }

    public void actionPerformed (ActionEvent e) {
        parentBL.timeLeft--;
        parentBL.gui.lblCountdown.setText(String.valueOf(parentBL.timeLeft));
        if(parentBL.timeLeft == 0) {
            parentBL.t.stop();
            parentBL.gui.start.setEnabled(true);
            parentBL.gui.seconds.setEnabled(true);
        }
    }
}

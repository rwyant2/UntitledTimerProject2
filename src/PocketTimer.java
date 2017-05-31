import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Richard on 5/22/2017.
 */
public class PocketTimer {
    private JPanel timerPanel;
    JSpinner seconds;
    private JLabel secLabel;
    JButton start;
    JLabel lblCountdown;
    private int startTime;
    private int timeLeft;
    private buttonListener bL = new buttonListener(this);

    public PocketTimer() {
        seconds.setModel(new SpinnerNumberModel(1,1,60,1));
        seconds.setEditor(new JSpinner.NumberEditor(seconds,"#"));
        start.addActionListener(bL);
    }

 /*   private void createUIComponents() {
        seconds.setModel(new SpinnerNumberModel(1,1,60,1));
        seconds.setEditor(new JSpinner.NumberEditor(seconds,"#"));
    }
*/

    public static void main(String[] args) {
        JFrame frame = new JFrame("PocketTimer");
        frame.setContentPane(new PocketTimer().timerPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}

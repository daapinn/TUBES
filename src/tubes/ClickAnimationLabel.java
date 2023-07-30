package tubes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickAnimationLabel extends JLabel {
    private Timer animationTimer;

    public ClickAnimationLabel(Icon icon) {
        super(icon);

        // Create the animation timer with a 100ms delay
        animationTimer = new Timer(100, new ActionListener() {
            int clickCount = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (clickCount < 5) { // You can adjust the number of animation iterations
                    if (clickCount % 2 == 0) {
                        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                    } else {
                        setBorder(BorderFactory.createLineBorder(Color.RED, 5));
                    }
                    clickCount++;
                } else {
                    setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
                    animationTimer.stop();
                }
            }
        });

        // Add a mouse listener to trigger the animation
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startClickAnimation();
            }
        });
    }

    private void startClickAnimation() {
        animationTimer.restart();
    }
}

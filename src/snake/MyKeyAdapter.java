/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.event.*;

/**
 *
 * @author Usuario
 */
public class MyKeyAdapter extends KeyAdapter {

    private static char direction = 'R';

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_A -> {
                if (direction != 'R') {
                    direction = 'L';
                }
            }
            case KeyEvent.VK_D -> {
                if (direction != 'L') {
                    direction = 'R';
                }
            }
            case KeyEvent.VK_W -> {
                if (direction != 'D') {
                    direction = 'U';
                }
            }
            case KeyEvent.VK_S -> {
                if (direction != 'U') {
                    direction = 'D';
                }
            }
        }
    }

    public void moveSnake(int x[], int y[], int unitSize, int bodyParts) {

        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U' ->
                y[0] = y[0] - unitSize;
            case 'D' ->
                y[0] = y[0] + unitSize;
            case 'L' ->
                x[0] = x[0] - unitSize;
            case 'R' ->
                x[0] = x[0] + unitSize;
        }
    }

}

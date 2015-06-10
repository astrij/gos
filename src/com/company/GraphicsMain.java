package com.company;

import javafx.scene.shape.TriangleMesh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GraphicsMain extends JFrame implements MouseListener {
    Graphics2D gr2d;

    public GraphicsMain() throws HeadlessException {
        super("simpleApp");
        setSize(700, 600);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponents(g);
        gr2d = (Graphics2D) g;
        for (int i = 0; i < 150; i++) {

            gr2d.setPaint(Color.BLUE);
            gr2d.drawLine(400 + i, 400 - i, 400 + i, 400 + i);
        }


    }


    @Override
    public void mouseClicked(MouseEvent e) {
        super.repaint();
        for (int i = 0; i < 10; i++) {
            gr2d.setPaint(Color.YELLOW);
            gr2d.drawLine(400 + i, 400 - i, 400 + i, 400 + i);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.removeAll();
        for (int i = 0; i < 200; i++) {
            gr2d.setPaint(Color.RED);
            gr2d.drawLine(400 + i, 400 - i, 400 + i, 400 + i);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        super.removeAll();
        for (int i = 0; i < 300; i++) {
            gr2d.setPaint(Color.BLACK);
            gr2d.drawLine(400 + i, 400 - i, 400 + i, 400 + i);
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

package com.company;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI extends JPanel implements MouseListener {
    private Triangle triangle;
    private int width = 100;
    private int height = 100;

    public GUI(int x, int y, int width, int height) {

        triangle = new Triangle(width, height, Color.blue, 5);


    }

    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        triangle = new Triangle(width, height, Color.blue, 5);
        triangle.drawMe(g2d, new Point(100, 140), 1);
    }

    public void mouseClicked(MouseEvent e) {
        triangle = new Triangle(width, height, Color.blue, 5);

        repaint();
    }


    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    public void setUpGUI() {
        JFrame mainFrame = new JFrame();

        mainFrame.addMouseListener(this);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.getContentPane().add(this);
        mainFrame.setVisible(true);
    }

    public static void main(String args[]) {
        GUI gui = new GUI(0, 0, 100, 100);
        gui.setUpGUI();
    }


}
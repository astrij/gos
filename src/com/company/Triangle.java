package com.company;

import java.awt.*;

/**
 * Created by fravia on 11.06.15.
 */
public class Triangle {
    protected int hight;
    protected int width;
    protected Color color;
    protected int koef;

    public Triangle(int hight, int width, Color color, int koef) {
        this.hight = hight;
        this.width = width;
        this.color = color;
        this.koef = koef;
    }

    public void drawMe(Graphics g, Point location, int koef) {
        g.setColor(color);
        Point point2 = new Point(location.x + width*koef, location.y*koef);
        Point point3 = new Point(location.x + (width / 2)*koef, location.y - hight*koef);
        g.drawLine(location.x, location.y, point2.x, point2.y);
        g.drawLine(location.x, location.y, point3.x, point3.y);
        g.drawLine(point2.x, point2.y, point3.x, point3.y);
        int[] x = new int[3];
        int[] y = new int[3];
        x[0]=location.x;
        x[1]=point2.x;
        x[2]=point3.x;
        y[0]=location.y;
        y[1]=point2.y;
        y[2]=point3.y;
        int n =3;
        Polygon polygon=new Polygon(x,y,n);
        g.fillPolygon(polygon);
    }
}

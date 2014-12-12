/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ummundopequeno;

/**
 *
 * @author Alex
 */
public class Brother implements Comparable<Brother> {
    private String Name;
    private int x;
    private int y;
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Brother o) {
        if (this.distance == o.distance)
            return 0;
        if (o.distance < this.distance)
            return 1;
        else
            return -1;
    }

}

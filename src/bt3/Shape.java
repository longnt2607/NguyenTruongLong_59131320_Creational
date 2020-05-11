/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author long
 */
public abstract class Shape {
    
    private String brush, paper, frame;
    
    public abstract String Draw();

    public Shape() {
    }

    public Shape(String brush, String paper, String frame) {
        this.brush = brush; // cọ vẽ
        this.paper = paper; // giấy
        this.frame = frame; // đóng khung
    }

    @Override
    public String toString() {
        return Draw() + ", " + brush + ", " + paper + ", " + frame;
    }

    public String getBrush() {
        return brush;
    }

    public void setBrush(String brush) {
        this.brush = brush;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }
}

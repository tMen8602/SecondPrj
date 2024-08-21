
/*
 * @ (#) Rectangle.java   1.0 21/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package edu.fit;

/**
 * @version 1.0
 * @description
 * @author: Trong Men
 * @date: 21/08/2024
 */
public class Rectangle {
    private double width;
    private double length;

    public Rectangle() {
        this.width = 0.0;
        this.length = 0.0;
    }

    public Rectangle(double width, double length) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }
}

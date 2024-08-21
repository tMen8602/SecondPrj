
/*
 * @ (#) Main.java   1.0 21/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */

package edu.fit;

import java.util.Scanner;

/**
 * @version 1.0
 * @description
 * @author: Trong Men
 * @date: 21/08/2024
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, length);
        System.out.println("Rectangle: " + rectangle.toString());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());

    }
}

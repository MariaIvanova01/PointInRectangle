package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] inputCoordinates = getInputCoordinates(scan);

        Point bottomLeft = new Point(inputCoordinates[0], inputCoordinates[1]);
        Point topRight = new Point(inputCoordinates[2],inputCoordinates[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int countNewCoordinates = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countNewCoordinates; i++) {
            int[] newCoordinates = getInputCoordinates(scan);

            Point newPoint = new Point(newCoordinates[0], newCoordinates[1]);

            boolean contains = rectangle.contains(newPoint);
            System.out.println(contains);
        }

    }

    private static int[] getInputCoordinates(Scanner scan) {
        return Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}

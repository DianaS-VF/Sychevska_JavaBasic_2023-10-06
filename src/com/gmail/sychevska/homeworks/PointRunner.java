package com.gmail.sychevska.homeworks;

public class PointRunner {
    public static void main(String[] args) {
        Point firstPoint = new Point(10, 10);
        Point secondPoint = new Point(20, 20);
        Point thirdPoint = new Point(30, 30);

        System.out.println("First Point coordinates: (" + firstPoint.getX() + "; " + firstPoint.getY() + ")");
        firstPoint.setX(77);
        firstPoint.setY(88);
        System.out.println("First Point coordinates changed to: (" + firstPoint.getX() + "; " + firstPoint.getY() + ")");

        System.out.println("\nDistance from First Point to Second Point: " + firstPoint.calculateDistanceToPoint(secondPoint));
        System.out.println("Distance between First Point and Third Point: " + Point.calculateDistanceBetweenPoints(firstPoint, thirdPoint));


        System.out.println("\nCompare First Point and Second Point: " + Point.comparePoints(firstPoint, secondPoint));

        Point copiedFirstPoint = new Point(firstPoint);
        System.out.println("\nCopied First Point: " + copiedFirstPoint);

        Point clonedFirstPoint = Point.clone(firstPoint);
        System.out.println("Cloned First Point: " + clonedFirstPoint);
    }
}

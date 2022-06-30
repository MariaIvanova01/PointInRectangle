# PointInRectangle

Create a class Point and a class Rectangle. The Point should hold coordinates X and Y and the Rectangle should hold 2 Points – its bottom left and top right corners. In the Rectangle class, you should implement a contains(Point point) method that returns true or false, based on whether the Point given as an attribute is inside or outside of the Rectangle object. Points on the side of a Square are considered inside.

Input
-------

•	On the first line read the coordinates of the bottom left and top right corner of the Rectangle in the format: "{bottomLeftX} {bottomLeftY} {topRightX} {topRightY}".

•	On the second line, read an integer N and on the next N lines, read the coordinates of points.


Examples
------------

Input | Output
------|---------
0 0 3 3 |
5 |
0 0 | true
0 1 | true
4 4 | false
5 3 | false
1 2 | true

Input | Output
------|--------
2 -3 12 3 |
4 |
8 -1 | true
11 3 | true
1 1 | false
2 4 | false


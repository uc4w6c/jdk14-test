package com.example.jdk13;

class RecordsTest {
    public static void main(String[] args) {
	record Point(int x, int y) {}
	Point point = new Point(5, 10);
	System.out.println(point.x());
	System.out.println(point);
    }
}

package com.example;

class TextBlock {
    public static void main(String[] args) {
	var l = new Leaf(3);
	System.out.println(l.val());
	System.out.println(l);
    }

    record Leaf(int val) {}
}

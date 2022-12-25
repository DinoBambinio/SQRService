package org.example;

public class SQRService {

    public int calc(int min, int max) {
        int counter = 0;
        for (int operation = 10; operation < 99; operation++) {
            int squareNumber = operation * operation;
            if (squareNumber >= min && squareNumber <= max) {
                counter++;
            }
        }
        return (counter);
    }
}
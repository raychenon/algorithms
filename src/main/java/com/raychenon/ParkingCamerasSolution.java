package com.raychenon;

public class ParkingCamerasSolution {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int example1 = findMinimumNumberOfCameras(1, new int[] { 1, 2, 3, 4, 5});
        // expected 2
        System.out.println("Example1 minimum number of cameras = " + example1);

        int example2 = findMinimumNumberOfCameras(2, new int[] { 2, 4, 5, 6, 7, 9, 11, 12});
        // expected 3
        System.out.println("Example2 minimum number of cameras = " + example2);
        
        int example3 = findMinimumNumberOfCameras(10, new int[] { 1, 15, 30, 40, 50});
        // expected 3
        System.out.println("Example3 minimum number of cameras = " + example3);
    }

    
    public static int findMinimumNumberOfCameras(int cameraRange, int[] parkingSpaces){

        return 2;
    }
}

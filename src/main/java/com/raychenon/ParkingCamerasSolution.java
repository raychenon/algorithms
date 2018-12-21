package com.raychenon;

public class ParkingCamerasSolution {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int example1 = findMinimumNumberOfCameras(1, new int[]{1, 2, 3, 4, 5});
        // expected 2
        System.out.println("Example1 minimum number of cameras = " + example1);

        int example2 = findMinimumNumberOfCameras(2, new int[]{2, 4, 5, 6, 7, 9, 11, 12});
        // expected 3
        System.out.println("Example2 minimum number of cameras = " + example2);

        int example3 = findMinimumNumberOfCameras(10, new int[]{1, 15, 30, 40, 50});
        // expected 3
        System.out.println("Example3 minimum number of cameras = " + example3);
    }

    /**
     *
     * time complexity O(n), space complexity O(1)
     * @param cameraRange
     * @param parkingSpaces
     * @return the minimum number of cameras to
     */
    public static int findMinimumNumberOfCameras(int cameraRange, int[] parkingSpaces) {

        int numberOfCameras, currentToPreviousSpace, coveredParkingSpace;
        numberOfCameras = currentToPreviousSpace = coveredParkingSpace = 0;

        for (int currentIndex = 0; currentIndex < parkingSpaces.length; currentIndex++) {

            if (currentIndex > 0) {
                currentToPreviousSpace = parkingSpaces[currentIndex] - parkingSpaces[currentIndex - 1];
            }
            if (currentIndex == parkingSpaces.length - 1) {
                numberOfCameras++;
            }

            // Core idea : any parking out of range on left or right side will have its own camera.

            // if the covered parking space is bigger than 2 camera range,
            // put a camera for each parking spot (P1,P2)
            // P1 <------------><------------><-------> P2
            //        range         range
            //    |-----------------------------------|
            //             *coveredParkingSpace*
            // After P2, reset the coveredParkingSpace .
            if ((currentToPreviousSpace <= cameraRange) &&
                    ((coveredParkingSpace + currentToPreviousSpace) <= (2 * cameraRange))) {
                coveredParkingSpace = coveredParkingSpace + currentToPreviousSpace;
            } else {
                numberOfCameras++;
                coveredParkingSpace = 0;
            }
        }

        return numberOfCameras;
    }
}

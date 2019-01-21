package com.raychenon;

/**
 * https://docs.google.com/document/d/12UMQ9bBb_sDu-cz8-pVsv-PRvXl08ibNfc0yTM32USo/edit#heading=h.e189oszewkho
 */
public class ParkingCamerasSolution {

    /**
     *
     * time complexity O(n), space complexity O(1)
     * @param cameraRange
     * @param parkingSpaces
     * @return the minimum number of cameras to cover the parking spaces
     */
    public static int findMinimumNumberOfCameras(int cameraRange, int[] parkingSpaces) {

        int numberOfCameras, currentToPreviousSpace, coveredParkingSpace;
        numberOfCameras = currentToPreviousSpace = coveredParkingSpace = 0;

        for (int currentIndex = 0; currentIndex < parkingSpaces.length; currentIndex++) {

            if (currentIndex > 0) {
                currentToPreviousSpace = parkingSpaces[currentIndex] - parkingSpaces[currentIndex - 1];
            }
            // at the last index, count the missing camera to close the coverage
            // note : handle when the array is empty
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
            if (( cameraRange >= currentToPreviousSpace) &&
                    ((2 * cameraRange) >= (coveredParkingSpace + currentToPreviousSpace))) {
                // The trick to avoid an inner loop ( thus quadratic run time) is to accumulate the space
                // between the last known camera position and the current index : in variable 'coveredParkingSpace'
                coveredParkingSpace = coveredParkingSpace + currentToPreviousSpace;
            } else {
                numberOfCameras++;
                coveredParkingSpace = 0;
            }
        }

        return numberOfCameras;
    }
}

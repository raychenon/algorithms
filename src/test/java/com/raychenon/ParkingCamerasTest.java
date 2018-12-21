package com.raychenon;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkingCamerasTest {
    
    @Test
    public void assertParkingCameras() {
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(1, new int[] { 1, 2, 3, 4, 5}), 2);
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(2, new int[] { 2, 4, 5, 6, 7, 9, 11, 12}), 3);
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(10, new int[] { 1, 15, 30, 40, 50}), 3);
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(10, new int[] { 1, 15, 30,31,32,33,39, 40, 50}), 3);

        //  REMEMBER that camera can only be installed on top of an existing parking space.
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(10, new int[] { 10, 19, 30}), 2);
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(10, new int[] { 10, 20, 30}), 1);
        
        // range = 0 means that the number of cameras is equal to the number of parking spaces.
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(0, new int[] { 1, 2, 3,4,5}), 5);

        // empty parking spaces
        assertEquals(ParkingCamerasSolution.findMinimumNumberOfCameras(1, new int[] { }), 0);
    }

}

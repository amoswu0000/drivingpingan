package com.roiland.service.drivingpingan.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDrivingpingan {

        DrivingpinganDelegate drivingpinganDelegate = new DrivingpinganDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = drivingpinganDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
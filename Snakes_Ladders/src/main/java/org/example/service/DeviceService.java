package org.example.service;

import java.util.Random;

public class DeviceService {
    public static int roll(){
        return new Random().nextInt(6) + 1;
    }
}

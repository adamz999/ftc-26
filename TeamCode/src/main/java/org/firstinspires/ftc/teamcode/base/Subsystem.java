package org.firstinspires.ftc.teamcode.base;

import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class Subsystem {
    private final HardwareMap hardwareMap;

    public Subsystem(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
    }
    public abstract void init();

    public void periodic() {}

    public void stop() {}
}

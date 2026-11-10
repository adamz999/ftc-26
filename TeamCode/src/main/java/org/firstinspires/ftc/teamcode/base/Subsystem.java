package org.firstinspires.ftc.teamcode.base;

import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class Subsystem {
    protected final HardwareMap hardwareMap = Robot.HARDWARE_MAP;

    public abstract void init();

    public void periodic() {}

    public void stop() {}
}

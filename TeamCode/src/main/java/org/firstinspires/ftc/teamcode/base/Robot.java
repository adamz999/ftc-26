package org.firstinspires.ftc.teamcode.base;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.ArrayList;
import java.util.List;

public abstract class Robot extends LinearOpMode {
    public static HardwareMap HARDWARE_MAP;

    private final ElapsedTime runtime = new ElapsedTime();
    public final List<Subsystem> subsystems = new ArrayList<>();
    public boolean autoPeriodic = false;

    public abstract void initialize();

    public void periodic() {}

    public void onStop() {}

    @Override
    public final void runOpMode() {
        HARDWARE_MAP = this.hardwareMap;
        initialize();

        for (Subsystem sub : subsystems) {
            sub.init();
        }

        runtime.reset();
        waitForStart();

        while (opModeIsActive()) {
            if(autoPeriodic){
                for (Subsystem sub: subsystems){
                    sub.periodic();
                }
            }
            periodic();
        }

        onStop();

        for (Subsystem sub : subsystems) {
            sub.stop();
        }
    }

    public double getElapsedTime(){
        return runtime.seconds();
    }
}
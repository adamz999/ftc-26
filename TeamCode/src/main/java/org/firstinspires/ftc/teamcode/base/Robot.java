package org.firstinspires.ftc.teamcode.base;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.ArrayList;
import java.util.List;

public abstract class Robot extends LinearOpMode {

    private final ElapsedTime runtime = new ElapsedTime();
    public final List<Subsystem> subsystems = new ArrayList<>();

    public abstract void initialize();

    public void periodic() {}

    public void onStop() {}

    @Override
    public final void runOpMode() {
        initialize();

        for (Subsystem sub : subsystems) {
            sub.init();
        }

        runtime.reset();
        waitForStart();

        while (opModeIsActive()) {
            for (Subsystem sub : subsystems) {
                sub.periodic();
            }

            periodic();
        }

        for (Subsystem sub : subsystems) {
            sub.stop();
        }

        onStop();
    }

    public double getElapsedTime(){
        return runtime.seconds();
    }
}
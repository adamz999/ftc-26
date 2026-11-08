package org.firstinspires.ftc.teamcode.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.base.Robot;
import org.firstinspires.ftc.teamcode.subsystems.Odometry;

@TeleOp(name = "Test")
public class Test extends Robot {

    private Odometry odometry;

    @Override
    public void initialize(){
        odometry = new Odometry(hardwareMap);
        subsystems.add(odometry);
    }

    @Override
    public void periodic(){
        odometry.periodic();
    }

    @Override
    public void onStop(){
        odometry.stop();
    }
}

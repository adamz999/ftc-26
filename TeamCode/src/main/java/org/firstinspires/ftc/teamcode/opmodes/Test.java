package org.firstinspires.ftc.teamcode.opmodes;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;
import org.firstinspires.ftc.teamcode.base.Robot;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.Odometry;

@TeleOp(name = "Test")
public class Test extends Robot {

    private Odometry odometry;
    private Drivetrain drivetrain;

    // change this with code
    private Pose2d initialPose = new Pose2d(new Vector2d(0, 0), 0);

    @Override
    public void initialize(){
        odometry.setPose(initialPose);
        subsystems.add(odometry);
    }

    @Override
    public void periodic(){
        odometry.periodic();

        drivetrain.drive(
                -gamepad1.left_stick_y,
                gamepad1.left_stick_x,
                gamepad1.right_stick_x
        );
    }

    @Override
    public void onStop(){

    }
}

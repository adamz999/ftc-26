/**

package org.firstinspires.ftc.teamcode.opmodes;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;
import org.firstinspires.ftc.teamcode.Constants;

@TeleOp(name="Tracking", group="Linear OpMode")
public class TrackingOpMode extends LinearOpMode {

    private ElapsedTime runtime = new ElapsedTime();

    // blue only rn

    // get this from odometry / imu
    private Pose2D currentPose = new Pose2D(DistanceUnit.INCH, 0, 0, AngleUnit.DEGREES, 0);


    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();
        runtime.reset();

        Pose2D targetHivePose = null;

        while (opModeIsActive()) {

            Pose2D pose1 = Constants.Field.BLUE_HIVE_1;
            Pose2D pose2 = Constants.Field.BLUE_HIVE_2;

            double distanceToHive1 = Math.hypot(
                    currentPose.getX(DistanceUnit.INCH) - pose1.getX(DistanceUnit.INCH),
                    currentPose.getY(DistanceUnit.INCH) - pose1.getY(DistanceUnit.INCH));

            double distanceToHive2 = Math.hypot(
                    currentPose.getX(DistanceUnit.INCH) - pose2.getX(DistanceUnit.INCH),
                    currentPose.getY(DistanceUnit.INCH) - pose2.getY(DistanceUnit.INCH));

            targetHivePose = (distanceToHive1 < distanceToHive2) ? pose1 : pose2;

            double targetAngle = Math.toDegrees(Math.atan2(
                    targetHivePose.getY(DistanceUnit.INCH) - currentPose.getY(DistanceUnit.INCH),
                    targetHivePose.getX(DistanceUnit.INCH) - currentPose.getX(DistanceUnit.INCH)
            ));

            double headingError = targetAngle -
                    currentPose.getHeading(AngleUnit.DEGREES);

            headingError = Math.toDegrees(Math.atan2(
                    Math.sin(Math.toRadians(headingError)),
                    Math.cos(Math.toRadians(headingError))
            ));

            // uyse heading error to turn with motor / turret gear





        }
    }
}

**/
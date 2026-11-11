package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.IMU;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.base.Subsystem;

public class Drivetrain extends Subsystem {

    private DcMotor frontLeft, backLeft, frontRight, backRight;
    private IMU imu;

    @Override
    public void init() {
        frontLeft = hardwareMap.get(DcMotor.class, Constants.Hardware.FRONT_LEFT);
        backLeft = hardwareMap.get(DcMotor.class, Constants.Hardware.BACK_LEFT);
        frontRight = hardwareMap.get(DcMotor.class, Constants.Hardware.FRONT_RIGHT);
        backRight = hardwareMap.get(DcMotor.class, Constants.Hardware.BACK_RIGHT);

        imu = hardwareMap.get(IMU.class, Constants.Hardware.IMU);

        RevHubOrientationOnRobot.LogoFacingDirection logoFacingDirection = RevHubOrientationOnRobot.LogoFacingDirection.FORWARD;
        RevHubOrientationOnRobot.UsbFacingDirection usbFacingDirection = RevHubOrientationOnRobot.UsbFacingDirection.UP;

        RevHubOrientationOnRobot orientation = new RevHubOrientationOnRobot(logoFacingDirection, usbFacingDirection);

        imu.initialize((new IMU.Parameters(orientation)));
    }

    @Override
    public void periodic(){
        // lol
    }

    @Override
    public void stop(){
        drive(0,0,0);
    }

    public void drive(double forward, double right, double rotate){
        double theta = Math.atan2(forward, right);
        double r = Math.hypot(right, forward);

        theta = AngleUnit.normalizeRadians(theta -
                imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS));

        double newForward = r * Math.sin(theta);
        double newRight = r * Math.cos(theta);

        double frontLeftPower = newForward + newRight + rotate;
        double frontRightPower = newForward - newRight - rotate;
        double backRightPower = newForward + newRight - rotate;
        double backLeftPower = newForward - newRight + rotate;

        double maxPower = 1.0;
        double maxSpeed = 1.0;

        maxPower = Math.max(maxPower, Math.abs(frontLeftPower));
        maxPower = Math.max(maxPower, Math.abs(frontRightPower));
        maxPower = Math.max(maxPower, Math.abs(backRightPower));
        maxPower = Math.max(maxPower, Math.abs(backLeftPower));

        frontLeft.setPower(maxSpeed * (frontLeftPower / maxPower));
        frontRight.setPower(maxSpeed * (frontRightPower / maxPower));
        backLeft.setPower(maxSpeed * (backLeftPower / maxPower));
        backRight.setPower(maxSpeed * (backRightPower / maxPower));

    }
}

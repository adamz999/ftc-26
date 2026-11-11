package org.firstinspires.ftc.teamcode.base;

import org.firstinspires.ftc.teamcode.RobotConfig;

public final class Kinematics {

    private Kinematics(){}

    public static double ShooterFlightTime(double xInches, double rpm, double theta){
        return (30 * xInches) / (Math.PI * rpm * RobotConfig.Shooter.FLYWHEEL_RADIUS_INCHES * Math.cos(Math.toRadians(theta)));
    }

}

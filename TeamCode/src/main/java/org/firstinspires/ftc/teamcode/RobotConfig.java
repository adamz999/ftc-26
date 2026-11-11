package org.firstinspires.ftc.teamcode;


public class RobotConfig {

    // seperate file

    public static class Shooter {
        public static final double FLYWHEEL_RADIUS_INCHES = 1;
        public static final double MAX_ANGLE = 0;
        public static final double MIN_ANGLE = 0;

    }

    public static final class Odometry {
        public static final double IN_PER_TICK = 0;

        // y position of the parallel encoder (in tick units)
        public static final double PAR_Y_TICKS = 0;

        // x position of the perpendicular encoder (in tick units)
        public static final double PERP_X_TICKS = 0;
    }

    public enum Alliance {
        BLUE,
        RED
    }

    public static class Game {
        public static final Alliance ALLIANCE = Alliance.BLUE;
    }

    public static class Hardware {
        public static final String FRONT_LEFT = "frontLeftMotor";
        public static final String BACK_LEFT = "backLeftMotor";
        public static final String FRONT_RIGHT = "frontRightMotor";
        public static final String BACK_RIGHT = "backRightMotor";

        public static final String IMU = "imu";
    }

    public static class Field {
//        public static final Pose2d RED_HIVE_1 = new Pose2d(new Vector2d(0, 0), 0);
//
//        public static final Pose2d RED_HIVE_2 = new Pose2d(new Vector2d(0, 0), 0);
//
//        public static final Pose2d BLUE_HIVE_1 = new Pose2d(new Vector2d(0, 0), 0);
//
//        public static final Pose2d BLUE_HIVE_2 = new Pose2d(new Vector2d(0, 0), 0);
    }


}

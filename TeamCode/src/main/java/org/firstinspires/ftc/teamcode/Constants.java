package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;


public class Constants {

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
        public static final Pose2d RED_HIVE_1 = new Pose2d(new Vector2d(0, 0), 0);

        public static final Pose2d RED_HIVE_2 = new Pose2d(new Vector2d(0, 0), 0);

        public static final Pose2d BLUE_HIVE_1 = new Pose2d(new Vector2d(0, 0), 0);

        public static final Pose2d BLUE_HIVE_2 = new Pose2d(new Vector2d(0, 0), 0);
    }


}

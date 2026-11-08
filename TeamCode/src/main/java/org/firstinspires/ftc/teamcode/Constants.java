package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.navigation.Pose2D;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class Constants {

    public enum Alliance {
        BLUE,
        RED
    }



    public static class Game {
        public static final Alliance ALLIANCE = Alliance.BLUE;
    }

    public static class Hardware {

    }

    public static class Field {
        public static final Pose2D RED_HIVE_1 = new Pose2D(DistanceUnit.INCH, 0, 0, AngleUnit.DEGREES, 0);

        public static final Pose2D RED_HIVE_2 = new Pose2D(DistanceUnit.INCH, 0, 0, AngleUnit.DEGREES, 0);

        public static final Pose2D BLUE_HIVE_1 = new Pose2D(DistanceUnit.INCH, 0, 0, AngleUnit.DEGREES, 0);

        public static final Pose2D BLUE_HIVE_2 = new Pose2D(DistanceUnit.INCH, 0, 0, AngleUnit.DEGREES, 0);
    }


}

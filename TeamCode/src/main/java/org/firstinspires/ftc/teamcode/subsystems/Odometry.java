package org.firstinspires.ftc.teamcode.subsystems;


import com.pedropathing.math.Pose;
import com.qualcomm.robotcore.hardware.IMU;
import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.base.Subsystem;


public class Odometry extends Subsystem {

    private TwoDeadWheelLocalizer twoDeadWheelLocalizer;
    private Pose velocity;

    @Override
    public void init() {
        twoDeadWheelLocalizer = new TwoDeadWheelLocalizer(
                hardwareMap,
                hardwareMap.get(IMU.class, "imu"),
                Constants.Odometry.IN_PER_TICK,
                getPose()
        );
    }

    @Override
    public void periodic(){
        velocity = twoDeadWheelLocalizer.update();
    }

    @Override
    public void stop(){

    }

    public Pose2d getPose() {
        return twoDeadWheelLocalizer.getPose();
    }

    public void setPose(Pose2d pose) {
        twoDeadWheelLocalizer.setPose(pose);
    }

    public PoseVelocity2d getVelocity(){
        return velocity;
    }

}

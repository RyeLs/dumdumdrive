// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrainsub extends SubsystemBase {
    private final Spark frontright = new Spark(1);
    private final Spark backright = new Spark (2);
MotorControllerGroup m_right = new MotorControllerGroup(frontright,backright);

    private final Spark frontleft = new Spark (3);
    private final Spark backleft = new Spark (4);
MotorControllerGroup m_left = new MotorControllerGroup(frontleft, backleft);
  
DifferentialDrive drive = new DifferentialDrive(m_right,m_left);

  private Encoder right =new Encoder (5,6);
 // private Encoder left =new Encoder (7,8);

  
/** Creates a new drivetrainsub. */
  public drivetrainsub() {}
/**
 * Makes drive into tank drive
 * @param leftSpeed robots left side speed
 * @param rightSpeed robots right side speed
 */
public void tankdrive(double leftSpeed,double rightSpeed) {
  drive.tankDrive(-leftSpeed, rightSpeed);
}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public double distanceget() {
    return right.getDistance();
  }
public static void tankDrive(double d, double e) {
}
}

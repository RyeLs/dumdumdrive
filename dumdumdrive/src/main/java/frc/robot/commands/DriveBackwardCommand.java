// Copyright (c) FIRST and other WPILib contributors. 
// Open Source Software; you can modify and/or share it under the terms of 
// the WPILib BSD license file in the root directory of this project. 

package frc.robot.commands; 


import edu.wpi.first.wpilibj2.command.CommandBase; 
import frc.robot.subsystems.drivetrainsub; 


/** An example command that uses an example subsystem. */ 

public class DriveBackwardCommand extends CommandBase { 
  double distance;
  
  drivetrainsub m_subsystem = new drivetrainsub(); 

  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"}) 
  /** 
   * Creates a new ExampleCommand. 
   * 
   * @param subsystem The subsystem used by this command. 
   */ 

  public DriveBackwardCommand(drivetrainsub subsystem) { 
    m_subsystem = subsystem; 
    // Use addRequirements() here to declare subsystem dependencies. 

  } 

  // Called when the command is initially scheduled. 
  //TODO put something plz
  @Override 
  public void initialize() { 
  
  }
  // Called every time the scheduler runs while the command is scheduled. 
  @Override 
  public void execute() {
    drivetrainsub.tankDrive(-1.0,-1);
  } 


  // Called once the command ends or is interrupted. 
  @Override 
  public void end(boolean interrupted) {
    drivetrainsub.tankDrive(0.0,0.0);
  } 

  // Returns true when the command should end. 
  @Override 
  public boolean isFinished() { 
    if (-distance == m_subsystem.distanceget() ) {
      return true;
    
    }
    return false;
    
  } 

} 

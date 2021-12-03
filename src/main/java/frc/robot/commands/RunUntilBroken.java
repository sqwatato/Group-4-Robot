// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class RunUntilBroken extends CommandBase {
  /** Creates a new RunUntilBroken. */
  private Intake intake;
  public RunUntilBroken() {
    // Use addRequirements() here to declare subsystem dependencies.
    intake = new Intake();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {
    intake.run(0);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() 
  {
    intake.run(0.2);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) 
  {
    intake.run(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return intake.isBroken();
  }
}

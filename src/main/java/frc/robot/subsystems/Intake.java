// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.BaseTalon;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private BaseTalon motor;
  private final int MOTORID = 0;
  private final int BBID = 0;
  private DigitalInput bb;
  public Intake() {
    motor = new TalonSRX(MOTORID);
    motor.configVoltageCompSaturation(10);
    motor.configFactoryDefault();
    motor.setInverted(false);
    motor.enableVoltageCompensation(true);
    bb = new DigitalInput(BBID);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }

  public void run(double power)
  {
    motor.set(ControlMode.PercentOutput, power);
  }

  public boolean isBroken()
  {
    return bb.get();
  }
}

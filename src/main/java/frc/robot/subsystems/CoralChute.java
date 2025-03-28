// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;


import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class CoralChute extends SubsystemBase
{
  private final SparkMax motor;

  public CoralChute(int motorID)
  {
    motor = new SparkMax(motorID, MotorType.kBrushed);
  }

  @Override
  public void periodic()
  {
  }

  @Override
  public void simulationPeriodic()
  {
  }

  public void setMotor(double speed) {
    motor.set(speed);
  }




}

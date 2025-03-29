// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class CoralChute extends SubsystemBase
{
  private final SparkMax motor;

  // Pololu Distance Sensor
  private final Counter distanceDetector;

  public CoralChute(int motorID)
  {
    motor = new SparkMax(motorID, MotorType.kBrushed);
    
    distanceDetector = new Counter(Counter.Mode.kSemiperiod);
    distanceDetector.setUpSource(0);
    distanceDetector.setSemiPeriodMode(true);
  }

  @Override
  public void periodic()
  {
    SmartDashboard.putNumber("Distance", getDistance());
  }

  @Override
  public void simulationPeriodic()
  {
  }

  public void setMotor(double speed) {
    motor.set(speed);
  }

  public double getDistance() {
    double pulseWidthSeconds = distanceDetector.getPeriod();
    double correctedPulseWidth = pulseWidthSeconds * 1000000;
    return 4 * (correctedPulseWidth - 1000);
  }


}

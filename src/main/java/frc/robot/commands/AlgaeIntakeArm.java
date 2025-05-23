// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.AlgaeChute;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class AlgaeIntakeArm extends Command {
  private final AlgaeChute algaeChutesubsystem;
  private final double speed;
  public AlgaeIntakeArm(AlgaeChute subsystem, double speed) {
    this.algaeChutesubsystem = subsystem;
    this.speed = speed;
    
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    algaeChutesubsystem.setArmMotor(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    algaeChutesubsystem.setArmMotor(0);
}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}


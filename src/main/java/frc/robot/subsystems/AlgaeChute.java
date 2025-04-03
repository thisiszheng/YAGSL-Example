
package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class AlgaeChute extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private final SparkMax rollerMotor;
  private final SparkMax leftArmMotor;
  private final SparkMax rightArmMotor;

  public AlgaeChute(int motor1ID, int motor2ID, int motor3ID)
  {
    rollerMotor = new SparkMax(motor1ID, MotorType.kBrushed);
    leftArmMotor = new SparkMax(motor2ID, MotorType.kBrushed);
    rightArmMotor = new SparkMax(motor3ID, MotorType.kBrushed);
  }
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void setRollerMotor(double speed) {
    rollerMotor.set(speed);
  }

  public void setArmMotor(double speed) {
    leftArmMotor.set(speed);
    rightArmMotor.set(speed);
  }

}



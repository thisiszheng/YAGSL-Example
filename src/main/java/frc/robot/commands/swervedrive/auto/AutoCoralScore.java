// package frc.robot.commands.swervedrive.auto;

// import edu.wpi.first.math.MathUtil;
// import edu.wpi.first.math.controller.PIDController;
// import edu.wpi.first.math.geometry.Translation2d;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj2.command.Command;
// import frc.robot.subsystems.swervedrive.SwerveSubsystem;

// import frc.robot.subsystems.CoralChute;
// import frc.robot.commands.CoralChuteCommand;

// public class AutoCoralScore extends Command
// {

//   private final SwerveSubsystem drivebase;
//   private final CoralChuteCommand coralchute;

//   public AutoCoralScore(SwerveSubsystem drivebase, CoralChuteCommand coralchute)
//   {
//     this.drivebase = drivebase;
//     this.coralchute = coralchute;
//     // each subsystem used by the command must be passed into the
//     // addRequirements() method (which takes a vararg of Subsystem)
//     addRequirements(this.drivebase);
//   }

//   /**
//    * The initial subroutine of a command.  Called once when the command is initially scheduled.
//    */
//   @Override
//   public void initialize()
//   {

//   }

//   /**
//    * The main body of a command.  Called repeatedly while the command is scheduled. (That is, it is called repeatedly
//    * until {@link #isFinished()}) returns true.)
//    */
//   @Override
//   public void execute()
//   {
//     SmartDashboard.putBoolean("At Tolerance", controller.atSetpoint());

//     double translationVal = MathUtil.clamp(controller.calculate(drivebase.getPitch().getDegrees(), 0.0), -0.5,
//                                            0.5);
//     drivebase.drive(new Translation2d(translationVal, 0.0), 0.0, true);
//   }

//   /**
//    * <p>
//    * Returns whether this command has finished. Once a command finishes -- indicated by this method returning true --
//    * the scheduler will call its {@link #end(boolean)} method.
//    * </p><p>
//    * Returning false will result in the command never ending automatically. It may still be cancelled manually or
//    * interrupted by another command. Hard coding this command to always return true will result in the command executing
//    * once and finishing immediately. It is recommended to use *
//    * {@link edu.wpi.first.wpilibj2.command.InstantCommand InstantCommand} for such an operation.
//    * </p>
//    *
//    * @return whether this command has finished.
//    */
//   @Override
//   public boolean isFinished()
//   {
//     return controller.atSetpoint();
//   }

//   /**
//    * The action to take when the command ends. Called when either the command finishes normally -- that is it is called
//    * when {@link #isFinished()} returns true -- or when  it is interrupted/canceled. This is where you may want to wrap
//    * up loose ends, like shutting off a motor that was being used in the command.
//    *
//    * @param interrupted whether the command was interrupted/canceled
//    */
//   @Override
//   public void end(boolean interrupted)
//   {
//     swerveSubsystem.lock();
//   }
// }
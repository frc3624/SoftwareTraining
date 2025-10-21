package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeMotor;

public class IntakeMotorCommand extends CommandBase {
    private final IntakeMotor intakeSubsystem;

    public IntakeMotorCommand(IntakeMotor subsystem) {
        intakeSubsystem = subsystem;
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        intakeSubsystem.setSpeed(0.35); 
    }

    @Override
    public void end(boolean interrupted) {
        intakeSubsystem.stop(); 
    }

    @Override
    public boolean isFinished() {
        return false; 
    }
}

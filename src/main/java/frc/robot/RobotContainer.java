package frc.robot;

import frc.robot.subsystems.IntakeMotor;
import frc.robot.commands.IntakeMotorCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
    private final IntakeMotor intakeMotor = new IntakeMotor();
    private final IntakeMotorCommand intakeCommand = new IntakeMotorCommand(intakeMotor);
    private final CommandXboxController controller = new CommandXboxController(0);

    public RobotContainer() {
        configureBindings();
    }

    private void configureBindings() {
        controller.a().whileTrue(intakeCommand);
    }
}

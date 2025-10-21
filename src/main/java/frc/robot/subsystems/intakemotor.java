package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class IntakeMotor extends SubsystemBase {
    private final CANSparkMax motor;

    public IntakeMotor() {
        motor = new CANSparkMax(1, MotorType.kBrushless); // Replace 1 with your CAN ID
    }

    public void setSpeed(double speed) {
        motor.set(speed);
    }

    public void stop() {
        motor.set(0);
    }
}

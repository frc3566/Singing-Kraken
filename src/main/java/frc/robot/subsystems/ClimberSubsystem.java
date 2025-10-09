package frc.robot.subsystems;
import java.util.ResourceBundle.Control;

import com.revrobotics.spark.SparkMax;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.spark.SparkBase.ControlType;

public class ClimberSubsystem extends SubsystemBase {
    public SparkMax leftClimber;

    public ClimberSubsystem() {
        leftClimber = new SparkMax(12, SparkMax.MotorType.kBrushless);
    }

    public void setPower(double power) {
        leftClimber.set(power);
    }

    public void stop() {
        leftClimber.stopMotor();
    }
}

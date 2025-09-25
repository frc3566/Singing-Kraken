// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix6.hardware.TalonFX;
import com.ctre.phoenix6.Orchestra;

public class ExampleSubsystem extends SubsystemBase {
  private final TalonFX m_talon;
  private final Orchestra m_orchestra;

  /** Creates a new ExampleSubsystem. */
  public ExampleSubsystem() {
    m_talon = new TalonFX(0);
    m_orchestra = new Orchestra();
    // Add a single device to the orchestra
    m_orchestra.addInstrument(new TalonFX(0));
    var status = m_orchestra.loadMusic("ymca.chrp");
    if (!status.isOK()) {
      System.out.println("Failed to load music: " + status);
    }
    else{
      System.out.println("Load successful!");
    }
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public void playMusic() {
    m_orchestra.play();
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
  }

  public void stopMusic() {
    m_orchestra.stop();
  }

  public void pauseMusic() {
    m_orchestra.pause();
  }

  public boolean isPlaying() {
    return m_orchestra.isPlaying();
  }
  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
// limit switch import
// motor import
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ElevatorSubsystem extends SubsystemBase {
  
  private final motor = new motor(); // create motor object (not sure what motor; temporary)
  private static final double MAX_SPEED = 0.8; // set limit for max speed (80%)
  // need feedforward for gravity?
  
  public ElevatorSubsystem() {}


  public void moveElevator() { // elevator motor will move under set conditions
    if((speed > 0 && limitswitch.get()) || (speed < 0 && limitswitch.get())); { // activates limit switches if elevator has hit top or bottom and stops it (not sure whatlimit switch - needs to be adjusted)
      speed = 0; // stops if it hits a limit switch
    }
    //Feed forward for gravity?
  }

  public void stopsElevatorMotor() {
    motor.set(0); // stops the motor - sets to 0
  }

}

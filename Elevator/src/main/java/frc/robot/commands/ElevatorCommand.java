package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
//other imports (joystick)
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorCommand extends Command {
    private final ElevatorSubsystem elevator; // elevator subsystem
    private final Joystick joystick; // joystick input

    public ElevatorCommand(ElevatorSubsystem elevator, Joystick joystick) {
        this.elevator = elevator; // links to subsystem?
        this.joystick = joystick;

    }

    // not sure what to put for this
    @Override
    public void execute() {
    }

    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

import ftclib.subsystems.Subsystem;

public class Drive extends Subsystem {

    private DcMotor frontleftDrive;
    private DcMotor frontrightDrive;
    private DcMotor backleftDrive;
    private DcMotor backrightDrive;


    public Drive(HardwareMap ahwMap){
        hwMap = ahwMap;
        //Add actuators and sensors here

        frontleftDrive = hwMap.dcMotor.get(ActuatorMap.frontleft);
        frontrightDrive = hwMap.dcMotor.get(ActuatorMap.frontright);
        backleftDrive = hwMap.dcMotor.get(ActuatorMap.backleft);
        backrightDrive = hwMap.dcMotor.get(ActuatorMap.backright);

    }

    public void tankDrive(double forward, double rotation, double strafe){
        frontleftDrive.setPower((forward + rotation - strafe) * 1);
        backleftDrive.setPower((forward + rotation + strafe) * 1);
        frontrightDrive.setPower((forward - rotation + strafe) * -1);
        backrightDrive.setPower((forward - rotation - strafe) * -1);
    }

}

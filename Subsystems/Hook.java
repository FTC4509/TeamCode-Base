package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.ToolClasses.ActuatorMap;

import ftclib.subsystems.Subsystem;

public class Hook extends Subsystem {

     private DcMotor hookMotor;


    public Hook(HardwareMap ahwMap){
        hwMap = ahwMap;
        //Add actuators and sensors here

        hookMotor = hwMap.dcMotor.get(ActuatorMap.hook);

    }

    public void hookMove(double direction){
        hookMotor.setPower(direction);
    }


}

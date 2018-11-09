package org.firstinspires.ftc.teamcode.ToolClasses;

import com.qualcomm.robotcore.hardware.Gamepad;

public class Controls{

    private Gamepad gamepad1;
    private Gamepad gamepad2;

    public Controls(Gamepad g1, Gamepad g2){
        gamepad1 = g1;
        gamepad2 = g2;

    }

   public double forward(){
        return gamepad1.left_stick_x;
   }
   public double rotation(){
       
        return gamepad1.left_stick_y;
   }
   public double strafe(){
        return gamepad1.right_stick_x;
   }

     public double getHook(){
        return gamepad2.left_stick_y;
    }
/*
    public float leftStrafe(){
        return gamepad1.left_trigger;
    }
    public float rightStrafe(){
        return gamepad1.right_trigger;
    }
    */
}

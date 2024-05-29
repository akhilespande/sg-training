package com.akhilesh.programs.classandobject;
//stores the value for light
public class Light {
    /*
    true : if light is on
    false : if light is off
     */
    // state of light
   boolean isOn;

   // behavior  : for turning on light
   public void turnOn(){
     isOn = true;
     System.out.println("Light on ? "+ isOn);
   }

   // behavior  : for turning off light
    public void turnOff(){
       isOn = false;
       System.out.println("Light off ? "+isOn);
    }
}

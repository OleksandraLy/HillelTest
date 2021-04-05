package com.hillel.lesson8homework;

public class Robin {
    /*Создайте класс с 3 параметрами final. Создайте в
    нем конструктор по-умолчанию и конструктор со всеми параметрами. Создайте для всех полей getter и setter.*/

    public final String BELLY_FEATHERS = "red";
    public final String WINGS_FEATHERS = "grey with white";
    public final String TAIL_FEATHERS = "black";

    public Robin() {
    }
    public Robin (String BELLY_FEATHERS, String WINGS_FEATHERS, String TAIL_FEATHERS){
        /*this.BELLY_FEATHERS=BELLY_FEATHERS;
        this.WINGS_FEATHERS=WINGS_FEATHERS;
        this.TAIL_FEATHERS=TAIL_FEATHERS;
        не можна присвоїти значення змінним зі статусом final - вони не змінюються
    }*/


}
    public String getBELLY_FEATHERS(){
        return BELLY_FEATHERS;
    }
    public void setBELLY_FEATHERS(String BELLY_FEATHERS) {
       // this.BELLY_FEATHERS=BELLY_FEATHERS;
    }
    public String getWINGS_FEATHERS() {
        return WINGS_FEATHERS;
    }
    public void setWINGS_FEATHERS(String WINGS_FEATHERS){
    //this.WINGS_FEATHERS=WINGS_FEATHERS;
    }
    public String getTAIL_FEATHERS() {
        return TAIL_FEATHERS;
    }
    public void setTAIL_FEATHERS(String TAIL_FEATHERS){
        //this.TAIL_FEATHERS=TAIL_FEATHERS;
    }
}



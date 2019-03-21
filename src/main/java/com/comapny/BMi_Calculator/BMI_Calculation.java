package com.comapny.BMi_Calculator;

import java.text.DecimalFormat;

public class BMI_Calculation {

    public String bmi_info(float bmi) {
        if (bmi < 18.5) {

            return "Niedowaga";
        } else if (bmi >= 18.6 && bmi <= 25) {
            return "Waga w normie";
        } else if (bmi >= 25.1 && bmi <= 30) {
            return "Nadwaga";
        }else if (bmi >= 30.1 && bmi <= 35) {
            return "I stopień otyłości";
        }else if (bmi >= 35.1 && bmi <= 39.9) {
            return "II stopien otyłości";
        }
        return "Otyłość skrajna";
    }

    public float calc(int a,int b){

        try {
            float c = b / 100f;
            return   (a / (c * c));
        }catch (NullPointerException e){
            return 0;
        }


    }

}

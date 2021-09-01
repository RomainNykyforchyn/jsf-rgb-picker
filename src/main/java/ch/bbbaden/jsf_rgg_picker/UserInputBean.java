/*
 * 01.09.2021
 * UserInputBean
 * Romain
 */
package ch.bbbaden.jsf_rgg_picker;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Romain
 */
@Named(value = "userInputBean")
@ApplicationScoped
public class UserInputBean {
    private String userInputRed = "0";
    private String userInputGreen = "0";
    private String userInputBlue = "0";
    private String hexColor;
    private int[] rgbNumbers=new int[256];

    public UserInputBean() {
        for(int i=0;i<256;i++){
            rgbNumbers[i]=i;
        }
    }

    public int[] getRgbNumbers() {
        return rgbNumbers;
    }
    
    

    public String getUserInputRed() {
        return userInputRed;
    }

    public void setUserInputRed(String userInputRed) {
        this.userInputRed = userInputRed;
    }

    public String getUserInputGreen() {
        return userInputGreen;
    }

    public void setUserInputGreen(String userInputGreen) {
        this.userInputGreen = userInputGreen;
    }

    public String getUserInputBlue() {
        return userInputBlue;
    }

    public void setUserInputBlue(String userInputBlue) {
        this.userInputBlue = userInputBlue;
    }
    
}

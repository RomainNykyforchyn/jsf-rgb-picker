package ch.bbbaden.jsf_rgb_picker;

import static java.lang.Integer.toHexString;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Named(value = "formController")
@ApplicationScoped
public class FormController {
    @Inject
    private UserInputBean userInputBean;
    private String backGroundColor = "#FFFFFF";

    public String getColor(){
        String red = convertToHex(Integer.parseInt(userInputBean.getUserInputRed()));
        String green = convertToHex(Integer.parseInt(userInputBean.getUserInputGreen()));
        String blue = convertToHex(Integer.parseInt(userInputBean.getUserInputBlue()));
        String output= "#"+red+green+blue;
        System.out.println(output);
        return output;
    }
    private String convertToHex(int x){
        String output = "";
        if(x<=15){
            output = "0"+toHexString(x);
        }else{
            output = toHexString(x);
        }
        return output;
    }

    public void setBackGroundColor() {
        
        this.backGroundColor = "#"+getColor();
    }
    public String forward(){
        setBackGroundColor();
        return "index.xhtml";
    }
    
}

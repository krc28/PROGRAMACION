package co.com.tcs.certification.datausa.questions;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Verifydata implements Question {

    private List<String> data;

    public Verifydata(List<String> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean flag=false;
        String value;
        List<Object> dataApi = SerenityRest.lastResponse().jsonPath().getList("data");
        for (int i = 0; i < dataApi.size(); i++) {
            String currentObject = dataApi.get(i).toString();
            for (int j = 0; j < data.size(); j++) {
                if (currentObject.contains(data.get(j) + "=")){
                    flag=true;
                }else{
                    flag=false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        return flag;
    }

    public static Verifydata text(List<String> data){
        return new Verifydata(data);
    }
}

package action;

import com.opensymphony.xwork2.ActionSupport;
import model.DistanceCalculatorModel;

public class DistanceCalculatorAction extends ActionSupport {
   private DistanceCalculatorModel model = new DistanceCalculatorModel();
   private String toCity;
    private String fromCity;
    private String calculationType;

   @Override
   public String execute() throws Exception{
       model.calculateDistance(toCity ,fromCity, calculationType);
       return SUCCESS;
   }

    public DistanceCalculatorModel getModel() {
        return model;
    }

    public void setModel(DistanceCalculatorModel model) {
        this.model = model;
    }

    public String getToCity() {
        return toCity;
    }

    public void setToCity(String toCity) {
        this.toCity = toCity;
    }

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }
}

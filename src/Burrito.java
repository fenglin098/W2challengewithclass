public class Burrito {
    private String rice;
    private String bean;
    private String meat;
    private String salsa;
    private String veggies;

    public Burrito(){
    }

    public Burrito(String rice, String bean, String meat,String salsa, String veggies){
        this.rice=rice;
        this.bean=bean;
        this.meat=meat;
        this.salsa=salsa;
        this.veggies=veggies;

    }
    public String getRice(){
        return this.rice;
    }
    public void setRice(String rice){
        this.rice = rice;
    }
    public String getBean(){
        return this.bean;
    }
    public void setBean(String bean){
        this.bean = bean;
    }
    public String getMeat(){
        return this.meat;
    }
    public void setMeat(String meat){
        this.meat = meat;
    }

    public String getSalsa(){
        return this.salsa;
    }
    public void setSalsa(String salsa){
        this.salsa = salsa;
    }
    public String getVeggies(){
        return this.veggies;
    }
    public void setVeggies(String veggies){
        this.veggies = veggies;
    }


    public void displayText(int x){

        System.out.println("Burrito "+x+":"+rice+", "+meat+", "+bean+", "+salsa+", "+veggies);
    }
}

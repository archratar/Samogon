package Samogon;

/**
 * Created by arch on 6/20/17.
 */
public class Apparat {

    private Shlang shlang;
    private Cooler cooler;
    private Heater heater;
    private Deflegmator deflegmator;

    public Apparat(Shlang shlang, Cooler cooler, Heater heater, Deflegmator deflegmator) {
        this.shlang = shlang;
        this.cooler = cooler;
        this.heater = heater;
        this.deflegmator = deflegmator;
    }
    public Apparat(){

    }

    public String brewBuhlo(Grape grape, String source, String base){
        if(source.equals("sugar") && base.equals("water")) {
            return "wine";
        }else if(source.equals("salt") && base.equals("apple juice")){
            return "burda";
        }
        return "hahaha";
    }

    public Shlang getShlang() {
        return shlang;
    }

    public void setShlang(Shlang shlang) {
        this.shlang = shlang;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public void setCooler(Cooler cooler) {
        this.cooler = cooler;
    }

    public Heater getHeater() {
        return heater;
    }

    public void setHeater(Heater heater) {
        this.heater = heater;
    }

    public Deflegmator getDeflegmator() {
        return deflegmator;
    }

    public void setDeflegmator(Deflegmator deflegmator) {
        this.deflegmator = deflegmator;
    }
}

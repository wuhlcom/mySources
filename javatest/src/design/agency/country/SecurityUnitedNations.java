package design.agency.country;

public class SecurityUnitedNations extends UnitedNations {

    private USA usa;
    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String msg, Country country) {
        if (country.equals(usa)){
            iraq.getMsg(msg);
        }else if(country.equals(iraq)){
            usa.getMsg(msg);
        }
    }
}

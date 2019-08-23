package design.agency.country;

abstract public class Country {

    protected UnitedNations unitedNations;

    public Country(UnitedNations unitedNations) {
        this.unitedNations = unitedNations;
    }

    abstract public void declare(String msg);
    abstract public void getMsg(String msg);
}

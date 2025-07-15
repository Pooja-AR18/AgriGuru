package com.agriguru.model;

public class PriceRequest {
    private String crop;
    private String market;
    private String state;
    private String district;
    private String phone;

    // Getters and Setters
    public String getCrop() { return crop; }
    public void setCrop(String crop) { this.crop = crop; }

    public String getMarket() { return market; }
    public void setMarket(String market) { this.market = market; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}

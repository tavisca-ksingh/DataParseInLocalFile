package com.example.employeeData.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.xml.annotate.JacksonXmlElementWrapper;

import java.util.List;

@JsonPropertyOrder({ "manufacturer_name", "country", "other_phones" })
public class Manufacturer {
    @JsonProperty("manufacturer_name")
    private String name;

    @JsonProperty("country")
    private String country;

    // new annotation
    @JacksonXmlElementWrapper(localName="other_phones")
    private List<String> phone;

    public Manufacturer(String name, String country, List<String> phone) {
        this.name = name;
        this.country = country;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }
}

package com.example.employeeData.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneDetails {
    @JsonProperty("manufacturer")
    private Manufacturer manufacturer;

    @JsonProperty("phone_name")
    private String name;

    @JsonProperty("display_size")
    private String displaySize;

    @JsonProperty("internal_memory")
    private String memory;

    public PhoneDetails(String name, String displaySize, String memory,Manufacturer manufacturer ) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.displaySize = displaySize;
        this.memory = memory;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(String displaySize) {
        this.displaySize = displaySize;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}

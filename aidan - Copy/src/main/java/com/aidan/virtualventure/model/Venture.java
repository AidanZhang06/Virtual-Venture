package com.aidan.virtualventure.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Venture {

    private final UUID id;
    private final String email;
    private final String password;
    private final String fname;
    private final String lname;
    private final Date dob;
    private final String startupName;
    private final String location;
    private final int doe;
    private final String website;
    private final String vision;
    private final String pitch;
    private final File financials;
    private final String[] tags;

    public Venture(@JsonProperty("id") UUID id,
                   @JsonProperty("email") String email,
                   @JsonProperty("password") String password,
                   @JsonProperty("fname") String fname,
                   @JsonProperty("lname") String lname,
                   @JsonProperty("dob") Date dob,
                   @JsonProperty("startupName") String startupName,
                   @JsonProperty("location") String location,
                   @JsonProperty("doe") int doe,
                   @JsonProperty("website") String website,
                   @JsonProperty("vision") String vision,
                   @JsonProperty("pitch") String pitch,
                   @JsonProperty("financials") File financials,
                   @JsonProperty("tags") String[] tags) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.startupName = startupName;
        this.location = location;
        this.doe = doe;
        this.website = website;
        this.vision = vision;
        this.pitch = pitch;
        this.financials = financials;
        this.tags = tags;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public Date getDob() {
        return dob;
    }

    public String getStartupName() {
        return startupName;
    }

    public String getLocation() {
        return location;
    }

    public int getDoe() {
        return doe;
    }

    public String getWebsite() {
        return website;
    }

    public String getVision() {
        return vision;
    }

    public String getPitch() {
        return pitch;
    }

    public File getFinancials() {
        return financials;
    }

    public String[] getTags() {
        return tags;
    }

    @Override
    public String toString() {
        return "Venture{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", dob=" + dob +
                ", startupName='" + startupName + '\'' +
                ", location='" + location + '\'' +
                ", doe=" + doe +
                ", website='" + website + '\'' +
                ", vision='" + vision + '\'' +
                ", pitch='" + pitch + '\'' +
                ", financials=" + financials +
                ", tags=" + Arrays.toString(tags) +
                '}';
    }
}


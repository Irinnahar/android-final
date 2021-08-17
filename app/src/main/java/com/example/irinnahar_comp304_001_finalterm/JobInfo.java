package com.example.irinnahar_comp304_001_finalterm;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class JobInfo {

    @PrimaryKey @NonNull
    private String jobCode;

    @ColumnInfo(name = "title")
    private String jobTitle;

    @ColumnInfo(name = "name")
    private String companyName;

    @ColumnInfo(name = "longitude")
    private double companyLat;

    @ColumnInfo(name = "latitude")
    private double companyLng;

    @ColumnInfo(name = "salary")
    private String salary;


    public JobInfo() {

    }
    public JobInfo(String jobCode, String jobTitle, String companyName, double companyLat, double companyLng, String salary) {
        this.jobCode = jobCode;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.companyLat = companyLat;
        this.companyLng = companyLng;
        this.salary = salary;
    }

    public double getCompanyLat() {
        return companyLat;
    }

    public void setCompanyLat(double companyLat) {
        this.companyLat = companyLat;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getCompanyLng() {
        return companyLng;
    }

    public void setCompanyLng(double companyLng) {
        this.companyLng = companyLng;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return jobTitle;
    }
}

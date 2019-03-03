package com.example.sarah.paramedicsguide;
/*
public class Hospital {String hospitalName;
    String hospitalID;
    String hospitalEmail;
    String hospitalPassword;

    public Hospital() {
    }

    public Hospital(String hospitalName, String hospitalID, String hospitalEmail, String hospitalPassword) {
        this.hospitalName = hospitalName;
        this.hospitalID = hospitalID;
        this.hospitalEmail = hospitalEmail;
        this.hospitalPassword = hospitalPassword;
    }


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalEmail() {
        return hospitalEmail;
    }

    public void setHospitalEmail(String hospitalEmail) {
        this.hospitalEmail = hospitalEmail;
    }

    public String getHospitalPassword() {
        return hospitalPassword;
    }

    public void setHospitalPassword(String hospitalPassword) {
        this.hospitalPassword = hospitalPassword;
    }

}
*/
public class Hospital {
    String id;
    String name;
    double locationX;
    double locationY;
    long phone;
    String password;
    String category;
    String email;



    public Hospital() {
    }

    public Hospital(String id) {
        this.id = id;
    }

    public Hospital(String id, String name, double locationX, double locationY, long phone, String password , String category) {
        this.id = id;
        this.name = name;
        this.locationX = locationX;
        this.locationY = locationY;
        this.phone = phone;
        this.password = password;
        this.category = category;
    }
    public Hospital(String hospitalName, String hospitalID, String hospitalEmail, String hospitalPassword) {
        this.name = hospitalName;
        this.id = hospitalID;
        this.email = hospitalEmail;
        this.password = hospitalPassword;
    }

    public String getCategory() {
        return category;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLocationX() {
        return locationX;
    }
    public double getLocationY() {
        return locationY;
    }


    public long getPhone() {
        return phone;
    }





    public String getPassword() {
        return password;
    }



    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationX(double locationX) {
        this.locationX = locationX;
    }
    public void setLocationY(double locationY) {
        this.locationY = locationY;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void logIn(String id, String password) {

    }

    public void logOut(String id) {

    }

    public void modifyHospitalEmail( String email) {

    }

    public void modifyHospitalPassword( String password) {

    }
}


package com.example.myapplication;

import com.google.gson.annotations.SerializedName;

public class Personn {
    @SerializedName("id")
    String id;
    String name;
    String email;
    String address;
    String gender;
    Phone phone;

    public Personn(String name, String email, String id, Phone phone, String address, String gender) {

        this.name = name;
        this.email = email;
        this.id = id;
        this.phone = phone;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }


  public Phone getPhone(){
        return phone;
  }




    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
    public class Phone{
        @SerializedName("mobile")
        String mobile;
        String home;
        String office;

        public Phone(String mobile, String home, String office) {
            this.mobile = mobile;
            this.home = home;
            this.office = office;
        }

        public String getMobile() {
            return mobile;
        }

        public String getHome() {
            return home;
        }

        public String getOffice() {
            return office;
        }
    }

}


package com.tilly.grocerymerchantapp.Models.Register_Model;

public class MerchantRegister {
    public String mer_name, email_address, mobile_number, enter_Password, re_Enter_Password;

    public MerchantRegister(String mer_name, String email_address, String mobile_number, String enter_Password, String re_Enter_Password) {
        this.mer_name = mer_name;
        this.email_address = email_address;
        this.mobile_number = mobile_number;
        this.enter_Password = enter_Password;
        this.re_Enter_Password = re_Enter_Password;
    }


    public String getMer_name() {
        return mer_name;
    }

    public void setMer_name(String mer_name) {
        this.mer_name = mer_name;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public void setMobile_number(String mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getEnter_Password() {
        return enter_Password;
    }

    public void setEnter_Password(String enter_Password) {
        this.enter_Password = enter_Password;
    }

    public String getRe_Enter_Password() {
        return re_Enter_Password;
    }

    public void setRe_Enter_Password(String re_Enter_Password) {
        this.re_Enter_Password = re_Enter_Password;
    }
}

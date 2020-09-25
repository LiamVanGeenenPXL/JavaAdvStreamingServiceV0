package be.pxl.ja.streamingservice.model;

import java.util.List;

public class Account {
    private String email;
    private String password;
    private PaymentInfo paymentInfo;
    private StreamingPlan streamingPlan;
    private List<Profile> profiles;

    public Account(Profile profile) {
        Profile prof = new Profile("profile1");
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
        //
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public StreamingPlan getStreamingPlan() {
        return streamingPlan;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public Profile getFirstProfile(){
        return profiles.get(0);
    }

    public boolean verifyPassword(String pass){
        if (pass == password){
            return true;
        }
        else {
            return false;
        }
    }

}

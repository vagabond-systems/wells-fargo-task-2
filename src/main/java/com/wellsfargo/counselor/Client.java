package com.wellsfargo.counselor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Client {

    @Id
    @GeneratedValue()
    private long Clientid;

    @Column(nullable = false)
    private String Clientname;

    @Column(nullable = false)
    private String Advisorid;

    protected Client() {

    }

    public Client(long Clientid, String Clientname, String Advisorid) {
        this.Clientid = Clientid;
        this.Clientname = Clientname;
        this.Advisorid = Advisorid;
    }
    public long getClientid() {
        return Clientid;
    }

    public void setClientid(String Clientid) {
        this.Clientid = Long.parseLong(Clientid);
    }

    public String Clientname() {
        return Clientname;
    }

    public void setClientname(String Clientname) {
        this.Clientname = Clientname;
    }

    public String getAdvisorid() {
        return Advisorid;
    }

    public void setAdvisorid(String Advisorid) {
        this.Advisorid = Advisorid;
    }

}
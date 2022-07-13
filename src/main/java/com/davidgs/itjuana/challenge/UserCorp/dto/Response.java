package com.davidgs.itjuana.challenge.UserCorp.dto;


public class Response {

    private String resp;
    private int code;

    public String getResp() {
        return resp;
    }

    public void setResp(String resp) {
        this.resp = resp;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Response(String resp, int code){
        this.resp = resp;
        this.code = code;
    }
}

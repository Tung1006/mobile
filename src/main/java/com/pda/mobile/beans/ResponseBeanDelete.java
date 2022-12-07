package com.pda.mobile.beans;


import com.pda.mobile.model.entities.PcccBuilderPcccUnit;
import com.pda.mobile.model.entities.PcccBuilderVerhicle;
import com.pda.mobile.model.entities.PcccInfringeHandle;

public class ResponseBeanDelete {

    private int status = 200;
    private String errCode = "";
    private Object message = "Success";

    public ResponseBeanDelete() {
        // TODO Auto-generated constructor stub
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public void setData(PcccBuilderPcccUnit delete) {
    }

    public void setData(PcccBuilderVerhicle delete) {
    }

    public void setData(PcccInfringeHandle delete) {
    }

}

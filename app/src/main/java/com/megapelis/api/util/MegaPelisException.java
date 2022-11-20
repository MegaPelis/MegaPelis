package com.megapelis.api.util;

import com.megapelis.api.model.enums.APIStatusEnum;

public class MegaPelisException extends Exception{

    private APIStatusEnum status;

    public MegaPelisException(APIStatusEnum status){
        super(status.getMessageBackend());
        this.status = status;
    }

    public APIStatusEnum getStatus() {
        return status;
    }

    public void setStatus(APIStatusEnum status) {
        this.status = status;
    }
}

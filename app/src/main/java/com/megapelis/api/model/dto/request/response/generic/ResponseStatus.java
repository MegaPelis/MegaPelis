package com.megapelis.api.model.dto.request.response.generic;

import java.io.Serializable;

/**
 * Clase {@link ResponseStatus}
 * @author sergio.barrios.
 */
public class ResponseStatus implements Serializable {
    private String code;
    private String messageBackend;
    private String messageFrontend;

    public ResponseStatus(){}

    public ResponseStatus(String code, String messageBackend, String messageFrontend) {
        this.code = code;
        this.messageBackend = messageBackend;
        this.messageFrontend = messageFrontend;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessageBackend() {
        return messageBackend;
    }

    public void setMessageBackend(String messageBackend) {
        this.messageBackend = messageBackend;
    }

    public String getMessageFrontend() {
        return messageFrontend;
    }

    public void setMessageFrontend(String messageFrontend) {
        this.messageFrontend = messageFrontend;
    }
}

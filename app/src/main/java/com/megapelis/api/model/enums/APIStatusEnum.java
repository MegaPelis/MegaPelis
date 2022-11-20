package com.megapelis.api.model.enums;

/**
 * Clase {@link APIStatusEnum}
 * @author sergio.barrios.
 */
public enum APIStatusEnum {

    SUCCESS("200", "La petición se ha procesado exitosamente!", "Super todo ha salido bien!"),
    ERROR("500", "No se ha procesado la petición.", "Lo sentimos hemos tenido una falla, vuelva a intentar mas tarde."),
    ERROR_SDK_JAVA_VERSION("500", "La versión del sdk de java no es valida", "Uy hemos tenido un problema interno, vuelva a intentar mas tarde.");

    private final String code;
    private final String messageBackend;
    private final String messageFrontend;

    APIStatusEnum(String code, String messageBackend, String messageFrontend){
        this.code = code;
        this.messageBackend = messageBackend;
        this.messageFrontend = messageFrontend;
    }

    public String getCode() {
        return code;
    }

    public String getMessageBackend() {
        return messageBackend;
    }

    public String getMessageFrontend() {
        return messageFrontend;
    }
}

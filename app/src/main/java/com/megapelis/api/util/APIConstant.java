package com.megapelis.api.util;

public class APIConstant {

    public static final String STRING_CMM_UTF_8 = "UTF-8";
    public static final String STRING_CMM_DATE_ZONE = "America/Bogota";
    public static final String STRING_CMM_DATE_TIME_FORMAT = "yyyy/MM/dd hh:mm:ss";

    public static final String STRING_API_SERVICE_PROPERTY_SERVICE = "service";

    public static final String STRING_API_GATEWAY_PATH = "https://kfuwtxyz42.execute-api.us-east-1.amazonaws.com/pdn";
    public static final String STRING_API_GATEWAY_PATH_MOVIE_SERIE = "/movie-serie";

    public static final boolean BOOLEAN_API_MOCK_STATUS = Boolean.FALSE.booleanValue();
    public static final String STRING_API_MOCK_PATH = "https://github.com/MegaPelis/resource/tree/master/json/response";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_FIND_ALL_MOVIE = "/movie-serie/findByAllMovie.json";


    public static final String STRING_API_HTTP_PROPERTY_CONTENT_TYPE_NAME = "Content-Type";
    public static final String STRING_API_HTTP_PROPERTY_CONTENT_TYPE_VALUE = "application/json; charset=utf8";
    public static final String STRING_API_HTTP_PROPERTY_ACCEPT_NAME = "Accept";
    public static final String STRING_API_HTTP_PROPERTY_ACCEPT_VALUE = "application/json";
    public static final String STRING_API_HTTP_PROPERTY_METHOD_NAME = "Method";
    public static final String STRING_API_HTTP_PROPERTY_METHOD_VALUE_POST = "POST";
    public static final String STRING_API_HTTP_PROPERTY_METHOD_VALUE_GET = "GET";

    private APIConstant(){}
}

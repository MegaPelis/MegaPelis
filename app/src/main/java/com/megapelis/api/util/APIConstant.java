package com.megapelis.api.util;

public class APIConstant {

    public static final String STRING_CMM_UTF_8 = "UTF-8";
    public static final String STRING_CMM_DATE_ZONE = "America/Bogota";
    public static final String STRING_CMM_DATE_TIME_FORMAT = "yyyy/MM/dd hh:mm:ss";
    public static final String STRING_CMM_REPLACE = "%DATA%";

    public static final String STRING_API_SERVICE_PROPERTY_SERVICE = "service";

    public static final String STRING_API_GATEWAY_PATH = "https://kfuwtxyz42.execute-api.us-east-1.amazonaws.com/pdn";
    public static final String STRING_API_GATEWAY_PATH_MOVIE_SERIE = "/movie-serie";
    public static final String STRING_API_GATEWAY_PATH_MOVIE = "/movie";

    public static final boolean BOOLEAN_API_MOCK_STATUS = Boolean.FALSE.booleanValue();
    public static final String STRING_API_MOCK_PATH = null;

    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_FIND_ALL = "/movie-serie."+STRING_CMM_REPLACE+".findByAll.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_FIND_BY_ID = "/movie-serie."+STRING_CMM_REPLACE+".findById.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_SAVE = "/movie-serie."+STRING_CMM_REPLACE+".save.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_UPDATE = "/movie-serie."+STRING_CMM_REPLACE+".update.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_UPDATE_STATUS = "/movie-serie."+STRING_CMM_REPLACE+".updateStatus.json";

    public static final String STRING_API_MOCK_PATH_MOVIE_TMDB_JSON_FIND_BY_ID = "/movie-service-tmdb.findById.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_TMDB_JSON_FIND_ALL_POPULAR = "/movie-service-tmdb.findAllByPopular.json";

    public static final String STRING_API_HTTP_PROPERTY_CONTENT_TYPE_NAME = "Content-Type";
    public static final String STRING_API_HTTP_PROPERTY_CONTENT_TYPE_VALUE = "application/json; charset=utf8";
    public static final String STRING_API_HTTP_PROPERTY_ACCEPT_NAME = "Accept";
    public static final String STRING_API_HTTP_PROPERTY_ACCEPT_VALUE = "application/json";
    public static final String STRING_API_HTTP_PROPERTY_METHOD_NAME = "Method";
    public static final String STRING_API_HTTP_PROPERTY_METHOD_VALUE_POST = "POST";
    public static final String STRING_API_HTTP_PROPERTY_METHOD_VALUE_GET = "GET";

    public static final String STRING_DROPBOX_CLIENT = "dropbox/MegaPelis";
    public static final String STRING_DROPBOX_TOKEN =  "sl.BT5QhH8PD1r186ZZA-q7h9YGw_xZYuKg5uRFqzew5hjfsPhRVMGrDittPod1kSkvt_hebtHn3eBJxR-Dss4VKZrBwHOTeJJHPekjU1qZbrXm08um1JnTn648EU7kX7MChASIAto";

    private APIConstant(){}
}

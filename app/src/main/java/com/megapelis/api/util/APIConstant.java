package com.megapelis.api.util;

public class APIConstant {

    public static final String STRING_CMM_UTF_8 = "UTF-8";
    public static final String STRING_CMM_DATE_ZONE = "America/Bogota";
    public static final String STRING_CMM_DATE_TIME_FORMAT = "yyyy/MM/dd hh:mm:ss";
    public static final String STRING_CMM_REPLACE = "%DATA%";

    public static final String STRING_API_SERVICE_PROPERTY_SERVICE = "service";

    public static final String STRING_API_GATEWAY_PATH = "https://kfuwtxyz42.execute-api.us-east-1.amazonaws.com/pdn";
    public static final String STRING_API_GATEWAY_PATH_MOVIE_SERIE = "/movie-serie";
    public static final String STRING_API_GATEWAY_PATH_IMAGE = "/image";
    public static final String STRING_API_GATEWAY_PATH_MOVIE = "/movie";

    public static final boolean BOOLEAN_API_MOCK_STATUS = Boolean.FALSE.booleanValue();
    public static final String STRING_API_MOCK_PATH = null;

    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_FIND_ALL = "/movie-serie."+STRING_CMM_REPLACE+".findByAll.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_FIND_BY_ID = "/movie-serie."+STRING_CMM_REPLACE+".findById.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_SAVE = "/movie-serie."+STRING_CMM_REPLACE+".save.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_UPDATE = "/movie-serie."+STRING_CMM_REPLACE+".update.json";
    public static final String STRING_API_MOCK_PATH_MOVIE_SERIE_JSON_UPDATE_STATUS = "/movie-serie."+STRING_CMM_REPLACE+".updateStatus.json";
    public static final String STRING_API_MOCK_PATH_IMAGE_JSON_FIND_ALL_IMAGE = "/image.findAllImage.json";



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
    public static final String STRING_DROPBOX_TOKEN =  "sl.BVVOk-09cfpbkLFH_BZ2s6fwZ_LiQeepDg7NR0TjJLLUKt5yAXcAcJUuPL2juy4U8zpjKj-79x0ccIUomayZ6ToOfh77odahlKvFXDuNrvJMNvhejnfFOBMPL8MQKNfbUwHYxvk";

    public static final String STRING_SHARED_PREFERENCES_NAME = "megapelis";
    public static final String STRING_SHARED_PREFERENCES_DATA_IMAGE_FIND_ALL = "image/findAll";
    public static final String STRING_SHARED_PREFERENCES_DATA_MOVIE_FIND_ALL = "movie/findAll";
    public static final String STRING_SHARED_PREFERENCES_DATA_SERIE_FIND_ALL = "serie/findAll";

    private APIConstant(){}
}

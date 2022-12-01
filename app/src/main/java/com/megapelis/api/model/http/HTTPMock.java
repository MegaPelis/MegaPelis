package com.megapelis.api.model.http;

import com.megapelis.api.util.APIConstant;

public class HTTPMock {

    private String url;
    private String fileName;
    private boolean status;
    private String additional;

    public HTTPMock(String fileName) {
       this(APIConstant.STRING_API_MOCK_PATH, fileName);
    }

    public HTTPMock(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
        this.status = APIConstant.BOOLEAN_API_MOCK_STATUS;
    }

    public String url(){
        String buildUrl = null == url ? fileName : url.concat(fileName);
        boolean isReplace = buildUrl.contains(APIConstant.STRING_CMM_REPLACE);
        if(!isReplace)
            return buildUrl;
        if(null == additional)
            additional = "";
        return buildUrl.replaceAll(APIConstant.STRING_CMM_REPLACE, additional);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isStatus() {
        return status;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }
}

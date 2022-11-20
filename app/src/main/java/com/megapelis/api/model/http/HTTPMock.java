package com.megapelis.api.model.http;

import com.megapelis.api.util.APIConstant;

public class HTTPMock {

    private String url;
    private String fileName;
    private boolean status;

    public HTTPMock(String fileName) {
       this(APIConstant.STRING_API_MOCK_PATH, fileName);
    }

    public HTTPMock(String url, String fileName) {
        this.url = url;
        this.fileName = fileName;
        this.status = APIConstant.BOOLEAN_API_MOCK_STATUS;
    }

    public String url(){
        return url.concat(fileName);
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
}

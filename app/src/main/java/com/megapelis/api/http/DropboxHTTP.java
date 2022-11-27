package com.megapelis.api.http;

import com.dropbox.core.DbxException;
import com.dropbox.core.v2.DbxClientV2;
import com.megapelis.api.util.APICommon;

import java.io.InputStream;

public class DropboxHTTP {
    protected String token;

    public DropboxHTTP(String token){
        this.token = token;
    }

    public InputStream read(String fileName){
        try{
            DropboxClient.init(token);
            DbxClientV2 client =  DropboxClient.getClient();
            return client.files().download(fileName).getInputStream();
        }catch (DbxException exception){
            APICommon.output(exception);
        }
        return null;
    }
}

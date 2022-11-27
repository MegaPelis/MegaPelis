package com.megapelis.api.http;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.megapelis.api.util.APIConstant;

public class DropboxClient {

    private static DbxClientV2 sDbxClient;

    public static void init(String accessToken) {
        if (null == sDbxClient) {
            DbxRequestConfig requestConfig = DbxRequestConfig.newBuilder(APIConstant.STRING_DROPBOX_CLIENT)
                    .build();
            sDbxClient = new DbxClientV2(requestConfig, accessToken);
        }
    }

    public static DbxClientV2 getClient() {
        if (null == sDbxClient) {
            throw new IllegalStateException("Client not initialized.");
        }
        return sDbxClient;
    }
}

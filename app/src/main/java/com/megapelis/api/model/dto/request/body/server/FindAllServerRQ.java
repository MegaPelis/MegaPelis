package com.megapelis.api.model.dto.request.body.server;
/**
 * Clase {@link FindAllServerRQ}
 * @author yadir.garcia.
 */
public class FindAllServerRQ {
    private int page;

    public FindAllServerRQ() {
    }

    public FindAllServerRQ(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

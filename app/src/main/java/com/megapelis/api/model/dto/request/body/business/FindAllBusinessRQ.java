package com.megapelis.api.model.dto.request.body.business;
/**
 * Clase {@link FindAllBusinessRQ}
 * @author yadir.garcia.
 */
public class FindAllBusinessRQ {
    private int page;

    public FindAllBusinessRQ() {
    }

    public FindAllBusinessRQ(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

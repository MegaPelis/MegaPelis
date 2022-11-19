package com.megapelis.api.model.dto.request.body.image;
/**
 * Clase {@link FindAllImageRQ}
 * @author yadir.garcia.
 */
public class FindAllImageRQ {
    private int page;

    public FindAllImageRQ() {
    }

    public FindAllImageRQ(int page) {
        this.page = page;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

package com.demo.zeebemongoexporter.dto;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import com.demo.zeebemongoexporter.dto.BulkItemError;

//@JsonIgnoreProperties(ignoreUnknown = true)
public final class BulkItemIndex {

    private int status;
    private BulkItemError error;

    public int getStatus() {
        return status;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public BulkItemError getError() {
        return error;
    }

    public void setError(final BulkItemError error) {
        this.error = error;
    }
}

package com.demo.zeebemongoexporter.dto;

import com.demo.zeebemongoexporter.dto.BulkItem;

import java.util.Collections;
import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class BulkResponse {
    private boolean errors;
    private List<BulkItem> items = Collections.emptyList();

    public List<BulkItem> getItems() {
        return items;
    }

    public void setItems(final List<BulkItem> items) {
        this.items = items;
    }

    public void setErrors(final boolean errors) {
        this.errors = errors;
    }

    public boolean hasErrors() {
        return errors;
    }
}

package com.ufrn.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ufrn.entities.Question;

public class StackOverflowApiResponseDTO {
    private List<Question> items;
    private boolean hasMore;
    private int quotaMax;
    private int quotaRemaining;
    private int page;
    private int pageSize;
    private int total;

    public StackOverflowApiResponseDTO() {
    }

    @JsonCreator
    public StackOverflowApiResponseDTO(@JsonProperty("items") List<Question> items,
            @JsonProperty("has_more") boolean hasMore, @JsonProperty("quota_max") int quotaMax,
            @JsonProperty("quota_remaining") int quotaRemaining, @JsonProperty("page") int page,
            @JsonProperty("page_size") int pageSize, @JsonProperty("total") int total) {
        this.items = items;
        this.hasMore = hasMore;
        this.quotaMax = quotaMax;
        this.quotaRemaining = quotaRemaining;
        this.page = page;
        this.pageSize = pageSize;
        this.total = total;
    }

    public List<Question> getItems() {
        return items;
    }

    public void setItems(List<Question> items) {
        this.items = items;
    }

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public int getQuotaMax() {
        return quotaMax;
    }

    public void setQuotaMax(int quotaMax) {
        this.quotaMax = quotaMax;
    }

    public int getQuotaRemaining() {
        return quotaRemaining;
    }

    public void setQuotaRemaining(int quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "StackOverflowApiResponseDTO [hasMore=" + hasMore + ", items=" + "{}" + ", page=" + page + ", pageSize="
                + pageSize + ", quotaMax=" + quotaMax + ", quotaRemaining=" + quotaRemaining + ", total=" + total + "]";
    }
}

package com.ufrn.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PageDTO {

    @JsonProperty("items")
    private List<QuestionDTO> items;

    @JsonProperty("has_more")
    private boolean hasMore;

    @JsonProperty("quota_max")
    private int quotaMax;

    @JsonProperty("quota_remaining")
    private int quotaRemaining;

    @JsonProperty("page")
    private int page;

    @JsonProperty("page_size")
    private int pageSize;

    @JsonProperty("total")
    private int total;

    public List<QuestionDTO> getItems() {
        return items;
    }

    public void setItems(List<QuestionDTO> items) {
        this.items = items;
    }

    public boolean hasMore() {
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
        return "StackOverflowApiResponseDTO { \\n\\thasMore: " + hasMore + ", \\n\\titems: " + items + ", \\n\\tpage: "
                + page + ", \\n\\tpageSize: " + pageSize + ", \\n\\tquotaMax: " + quotaMax + ", \\n\\tquotaRemaining: "
                + quotaRemaining + ", \\n\\ttotal: " + total + "}";
    }
}

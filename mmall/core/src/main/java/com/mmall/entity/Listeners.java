package com.mmall.entity;

public class Listeners {
    private String id;

    private String name;

    private Integer pv;

    private Integer uv;

    private String createTime;

    private String rela;

    private String orders;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPv() {
        return pv;
    }

    public void setPv(Integer pv) {
        this.pv = pv;
    }

    public Integer getUv() {
        return uv;
    }

    public void setUv(Integer uv) {
        this.uv = uv;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getRela() {
        return rela;
    }

    public void setRela(String rela) {
        this.rela = rela == null ? null : rela.trim();
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders == null ? null : orders.trim();
    }
}
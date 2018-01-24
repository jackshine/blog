package com.liuyanzhao.blog.model;

import javax.persistence.*;

public class Category {
    @Id
    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "category_description")
    private String categoryDescription;

    @Column(name = "category_icon")
    private String categoryIcon;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_order")
    private Integer categoryOrder;

    @Column(name = "category_pid")
    private Integer categoryPid;

    @Column(name = "category_status")
    private Integer categoryStatus;

    /**
     * @return category_id
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * @param categoryId
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * @return category_description
     */
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * @param categoryDescription
     */
    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    /**
     * @return category_icon
     */
    public String getCategoryIcon() {
        return categoryIcon;
    }

    /**
     * @param categoryIcon
     */
    public void setCategoryIcon(String categoryIcon) {
        this.categoryIcon = categoryIcon;
    }

    /**
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * @return category_order
     */
    public Integer getCategoryOrder() {
        return categoryOrder;
    }

    /**
     * @param categoryOrder
     */
    public void setCategoryOrder(Integer categoryOrder) {
        this.categoryOrder = categoryOrder;
    }

    /**
     * @return category_pid
     */
    public Integer getCategoryPid() {
        return categoryPid;
    }

    /**
     * @param categoryPid
     */
    public void setCategoryPid(Integer categoryPid) {
        this.categoryPid = categoryPid;
    }

    /**
     * @return category_status
     */
    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    /**
     * @param categoryStatus
     */
    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }
}
package com.liuyanzhao.blog.model;

import javax.persistence.*;

public class Menu {
    @Id
    @Column(name = "menu_id")
    private Integer menuId;

    @Column(name = "menu_icon")
    private String menuIcon;

    @Column(name = "menu_level")
    private Integer menuLevel;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_order")
    private Integer menuOrder;

    @Column(name = "menu_status")
    private Integer menuStatus;

    @Column(name = "menu_url")
    private String menuUrl;

    /**
     * @return menu_id
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * @param menuId
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * @return menu_icon
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * @param menuIcon
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    /**
     * @return menu_level
     */
    public Integer getMenuLevel() {
        return menuLevel;
    }

    /**
     * @param menuLevel
     */
    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel = menuLevel;
    }

    /**
     * @return menu_name
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * @param menuName
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    /**
     * @return menu_order
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * @param menuOrder
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * @return menu_status
     */
    public Integer getMenuStatus() {
        return menuStatus;
    }

    /**
     * @param menuStatus
     */
    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }

    /**
     * @return menu_url
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * @param menuUrl
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
}
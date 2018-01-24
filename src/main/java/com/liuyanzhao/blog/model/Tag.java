package com.liuyanzhao.blog.model;

import javax.persistence.*;

public class Tag {
    @Id
    @Column(name = "tag_id")
    private Integer tagId;

    @Column(name = "tag_description")
    private String tagDescription;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_status")
    private Integer tagStatus;

    /**
     * @return tag_id
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * @return tag_description
     */
    public String getTagDescription() {
        return tagDescription;
    }

    /**
     * @param tagDescription
     */
    public void setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
    }

    /**
     * @return tag_name
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return tag_status
     */
    public Integer getTagStatus() {
        return tagStatus;
    }

    /**
     * @param tagStatus
     */
    public void setTagStatus(Integer tagStatus) {
        this.tagStatus = tagStatus;
    }
}
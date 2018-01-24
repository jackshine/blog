package com.liuyanzhao.blog.model;

import java.util.Date;
import javax.persistence.*;

public class Article {
    @Id
    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "article_child_category_id")
    private Integer articleChildCategoryId;

    @Column(name = "article_comment_count")
    private Integer articleCommentCount;

    @Column(name = "article_content")
    private String articleContent;

    @Column(name = "article_is_comment")
    private Integer articleIsComment;

    @Column(name = "article_like_count")
    private Integer articleLikeCount;

    @Column(name = "article_order")
    private Integer articleOrder;

    @Column(name = "article_parent_category_id")
    private Integer articleParentCategoryId;

    @Column(name = "article_post_time")
    private Date articlePostTime;

    @Column(name = "article_status")
    private Integer articleStatus;

    @Column(name = "article_tag_ids")
    private String articleTagIds;

    @Column(name = "article_title")
    private String articleTitle;

    @Column(name = "article_update_time")
    private Date articleUpdateTime;

    @Column(name = "article_user_id")
    private Integer articleUserId;

    @Column(name = "article_view_count")
    private Integer articleViewCount;

    /**
     * @return article_id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * @param articleId
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * @return article_child_category_id
     */
    public Integer getArticleChildCategoryId() {
        return articleChildCategoryId;
    }

    /**
     * @param articleChildCategoryId
     */
    public void setArticleChildCategoryId(Integer articleChildCategoryId) {
        this.articleChildCategoryId = articleChildCategoryId;
    }

    /**
     * @return article_comment_count
     */
    public Integer getArticleCommentCount() {
        return articleCommentCount;
    }

    /**
     * @param articleCommentCount
     */
    public void setArticleCommentCount(Integer articleCommentCount) {
        this.articleCommentCount = articleCommentCount;
    }

    /**
     * @return article_content
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * @param articleContent
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    /**
     * @return article_is_comment
     */
    public Integer getArticleIsComment() {
        return articleIsComment;
    }

    /**
     * @param articleIsComment
     */
    public void setArticleIsComment(Integer articleIsComment) {
        this.articleIsComment = articleIsComment;
    }

    /**
     * @return article_like_count
     */
    public Integer getArticleLikeCount() {
        return articleLikeCount;
    }

    /**
     * @param articleLikeCount
     */
    public void setArticleLikeCount(Integer articleLikeCount) {
        this.articleLikeCount = articleLikeCount;
    }

    /**
     * @return article_order
     */
    public Integer getArticleOrder() {
        return articleOrder;
    }

    /**
     * @param articleOrder
     */
    public void setArticleOrder(Integer articleOrder) {
        this.articleOrder = articleOrder;
    }

    /**
     * @return article_parent_category_id
     */
    public Integer getArticleParentCategoryId() {
        return articleParentCategoryId;
    }

    /**
     * @param articleParentCategoryId
     */
    public void setArticleParentCategoryId(Integer articleParentCategoryId) {
        this.articleParentCategoryId = articleParentCategoryId;
    }

    /**
     * @return article_post_time
     */
    public Date getArticlePostTime() {
        return articlePostTime;
    }

    /**
     * @param articlePostTime
     */
    public void setArticlePostTime(Date articlePostTime) {
        this.articlePostTime = articlePostTime;
    }

    /**
     * @return article_status
     */
    public Integer getArticleStatus() {
        return articleStatus;
    }

    /**
     * @param articleStatus
     */
    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    /**
     * @return article_tag_ids
     */
    public String getArticleTagIds() {
        return articleTagIds;
    }

    /**
     * @param articleTagIds
     */
    public void setArticleTagIds(String articleTagIds) {
        this.articleTagIds = articleTagIds;
    }

    /**
     * @return article_title
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * @param articleTitle
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    /**
     * @return article_update_time
     */
    public Date getArticleUpdateTime() {
        return articleUpdateTime;
    }

    /**
     * @param articleUpdateTime
     */
    public void setArticleUpdateTime(Date articleUpdateTime) {
        this.articleUpdateTime = articleUpdateTime;
    }

    /**
     * @return article_user_id
     */
    public Integer getArticleUserId() {
        return articleUserId;
    }

    /**
     * @param articleUserId
     */
    public void setArticleUserId(Integer articleUserId) {
        this.articleUserId = articleUserId;
    }

    /**
     * @return article_view_count
     */
    public Integer getArticleViewCount() {
        return articleViewCount;
    }

    /**
     * @param articleViewCount
     */
    public void setArticleViewCount(Integer articleViewCount) {
        this.articleViewCount = articleViewCount;
    }
}
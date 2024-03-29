package com.edmond.wiki.domain;

import java.io.Serializable;

/**
 * 电子书(Ebook)实体类
 *
 * @author makejava
 * @since 2024-02-11 10:01:59
 */
public class Ebook implements Serializable {
    private static final long serialVersionUID = 568426990626964536L;
    /**
     * id
     */
    private Long id;
    /**
     * 名称
     */
    private String name;
    /**
     * 分类1
     */
    private Long category1Id;
    /**
     * 分类2
     */
    private Long category2Id;
    /**
     * 描述
     */
    private String description;
    /**
     * 封面
     */
    private String cover;
    /**
     * 文档数
     */
    private Integer docCount;
    /**
     * 阅读数
     */
    private Integer viewCount;
    /**
     * 点赞数
     */
    private Integer voteCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategory1Id() {
        return category1Id;
    }

    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    public Long getCategory2Id() {
        return category2Id;
    }

    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDocCount() {
        return docCount;
    }

    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

}


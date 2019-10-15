package com.cdb.dflz.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable {
    /**
     * 问答表主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 知识表外键
     *
     * @mbggenerated
     */
    private String knowledgeid;

    /**
     * 问题内容
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 面向群体（1为党员、0为非党员）
     *
     * @mbggenerated
     */
    private Integer range;

    /**
     * 更新时间
     *
     * @mbggenerated
     */
    private Date updatetime;

    /**
     * 问题类型（1为多选、2为单选、3为判断）
     *
     * @mbggenerated
     */
    private Integer questiontype;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKnowledgeid() {
        return knowledgeid;
    }

    public void setKnowledgeid(String knowledgeid) {
        this.knowledgeid = knowledgeid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getQuestiontype() {
        return questiontype;
    }

    public void setQuestiontype(Integer questiontype) {
        this.questiontype = questiontype;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", knowledgeid=").append(knowledgeid);
        sb.append(", content=").append(content);
        sb.append(", range=").append(range);
        sb.append(", updatetime=").append(updatetime);
        sb.append(", questiontype=").append(questiontype);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
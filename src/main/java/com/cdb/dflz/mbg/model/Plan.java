package com.cdb.dflz.mbg.model;

import java.io.Serializable;

public class Plan implements Serializable {
    /**
     * 学习测试计划表主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 计划名称（例如2019年第XX周期学习测试计划。。）
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 周期Id
     *
     * @mbggenerated
     */
    private String cyclenum;

    /**
     * 周期下知识点ID集合
     *
     * @mbggenerated
     */
    private String knowledgeids;

    /**
     * 周期下问题ID集合
     *
     * @mbggenerated
     */
    private String questionids;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCyclenum() {
        return cyclenum;
    }

    public void setCyclenum(String cyclenum) {
        this.cyclenum = cyclenum;
    }

    public String getKnowledgeids() {
        return knowledgeids;
    }

    public void setKnowledgeids(String knowledgeids) {
        this.knowledgeids = knowledgeids;
    }

    public String getQuestionids() {
        return questionids;
    }

    public void setQuestionids(String questionids) {
        this.questionids = questionids;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", content=").append(content);
        sb.append(", cyclenum=").append(cyclenum);
        sb.append(", knowledgeids=").append(knowledgeids);
        sb.append(", questionids=").append(questionids);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.cdb.dflz.mbg.model;

import java.io.Serializable;

public class Option implements Serializable {
    /**
     * 选项答案表主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 外键问题表Id
     *
     * @mbggenerated
     */
    private String questionid;

    /**
     * 选项内容 （单个选项）
     *
     * @mbggenerated
     */
    private String content;

    /**
     * 答案（1为正确选项、0为错误选项）
     *
     * @mbggenerated
     */
    private Integer answer;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestionid() {
        return questionid;
    }

    public void setQuestionid(String questionid) {
        this.questionid = questionid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionid=").append(questionid);
        sb.append(", content=").append(content);
        sb.append(", answer=").append(answer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
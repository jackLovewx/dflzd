package com.cdb.dflz.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class LearnAndTestLog implements Serializable {
    /**
     * 学习测试记录表主键
     *
     * @mbggenerated
     */
    private String id;

    /**
     * 周期号（1-26）
     *
     * @mbggenerated
     */
    private Integer cyclenum;

    /**
     * 周一学习标识
     *
     * @mbggenerated
     */
    private Integer monlearnstatus;

    /**
     * 周二学习标识
     *
     * @mbggenerated
     */
    private Integer tueslearnstatus;

    /**
     * 周三学习标识
     *
     * @mbggenerated
     */
    private Integer wedlearnstatus;

    /**
     * 周四学习标识
     *
     * @mbggenerated
     */
    private Integer thurlearnstatus;

    /**
     * 周五学习标识
     *
     * @mbggenerated
     */
    private Integer frilearnstatus;

    /**
     * 本周期学习率
     *
     * @mbggenerated
     */
    private Float learnrate;

    /**
     * 周一测试标识
     *
     * @mbggenerated
     */
    private Integer monteststatus;

    /**
     * 周二测试标识
     *
     * @mbggenerated
     */
    private Integer tuesteststatus;

    /**
     * 周三测试标识
     *
     * @mbggenerated
     */
    private Integer wedteststatus;

    /**
     * 周四测试标识
     *
     * @mbggenerated
     */
    private Integer thurteststatus;

    /**
     * 周五测试标识
     *
     * @mbggenerated
     */
    private Integer friteststatus;

    /**
     * 测试率
     *
     * @mbggenerated
     */
    private Float testrate;

    /**
     * 测试正确率
     *
     * @mbggenerated
     */
    private Float testcorrectrate;

    /**
     * 用户ID
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * 用户名称
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 部门代码
     *
     * @mbggenerated
     */
    private String orgnum;

    /**
     * 记录创建时间
     *
     * @mbggenerated
     */
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCyclenum() {
        return cyclenum;
    }

    public void setCyclenum(Integer cyclenum) {
        this.cyclenum = cyclenum;
    }

    public Integer getMonlearnstatus() {
        return monlearnstatus;
    }

    public void setMonlearnstatus(Integer monlearnstatus) {
        this.monlearnstatus = monlearnstatus;
    }

    public Integer getTueslearnstatus() {
        return tueslearnstatus;
    }

    public void setTueslearnstatus(Integer tueslearnstatus) {
        this.tueslearnstatus = tueslearnstatus;
    }

    public Integer getWedlearnstatus() {
        return wedlearnstatus;
    }

    public void setWedlearnstatus(Integer wedlearnstatus) {
        this.wedlearnstatus = wedlearnstatus;
    }

    public Integer getThurlearnstatus() {
        return thurlearnstatus;
    }

    public void setThurlearnstatus(Integer thurlearnstatus) {
        this.thurlearnstatus = thurlearnstatus;
    }

    public Integer getFrilearnstatus() {
        return frilearnstatus;
    }

    public void setFrilearnstatus(Integer frilearnstatus) {
        this.frilearnstatus = frilearnstatus;
    }

    public Float getLearnrate() {
        return learnrate;
    }

    public void setLearnrate(Float learnrate) {
        this.learnrate = learnrate;
    }

    public Integer getMonteststatus() {
        return monteststatus;
    }

    public void setMonteststatus(Integer monteststatus) {
        this.monteststatus = monteststatus;
    }

    public Integer getTuesteststatus() {
        return tuesteststatus;
    }

    public void setTuesteststatus(Integer tuesteststatus) {
        this.tuesteststatus = tuesteststatus;
    }

    public Integer getWedteststatus() {
        return wedteststatus;
    }

    public void setWedteststatus(Integer wedteststatus) {
        this.wedteststatus = wedteststatus;
    }

    public Integer getThurteststatus() {
        return thurteststatus;
    }

    public void setThurteststatus(Integer thurteststatus) {
        this.thurteststatus = thurteststatus;
    }

    public Integer getFriteststatus() {
        return friteststatus;
    }

    public void setFriteststatus(Integer friteststatus) {
        this.friteststatus = friteststatus;
    }

    public Float getTestrate() {
        return testrate;
    }

    public void setTestrate(Float testrate) {
        this.testrate = testrate;
    }

    public Float getTestcorrectrate() {
        return testcorrectrate;
    }

    public void setTestcorrectrate(Float testcorrectrate) {
        this.testcorrectrate = testcorrectrate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOrgnum() {
        return orgnum;
    }

    public void setOrgnum(String orgnum) {
        this.orgnum = orgnum;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cyclenum=").append(cyclenum);
        sb.append(", monlearnstatus=").append(monlearnstatus);
        sb.append(", tueslearnstatus=").append(tueslearnstatus);
        sb.append(", wedlearnstatus=").append(wedlearnstatus);
        sb.append(", thurlearnstatus=").append(thurlearnstatus);
        sb.append(", frilearnstatus=").append(frilearnstatus);
        sb.append(", learnrate=").append(learnrate);
        sb.append(", monteststatus=").append(monteststatus);
        sb.append(", tuesteststatus=").append(tuesteststatus);
        sb.append(", wedteststatus=").append(wedteststatus);
        sb.append(", thurteststatus=").append(thurteststatus);
        sb.append(", friteststatus=").append(friteststatus);
        sb.append(", testrate=").append(testrate);
        sb.append(", testcorrectrate=").append(testcorrectrate);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", orgnum=").append(orgnum);
        sb.append(", createtime=").append(createtime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
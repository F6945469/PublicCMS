package com.publiccms.entities.sys;
// Generated 2016-11-19 15:33:56 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * SysDeptConfigId generated by hbm2java
 */
@Embeddable
public class SysDeptConfigId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "部门", condition = true)
    private int deptId;
    @GeneratorColumn(title = "配置", condition = true)
    private String config;

    public SysDeptConfigId() {
    }

    public SysDeptConfigId(int deptId, String config) {
        this.deptId = deptId;
        this.config = config;
    }

    @Column(name = "dept_id", nullable = false)
    public int getDeptId() {
        return this.deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    @Column(name = "config", nullable = false)
    public String getConfig() {
        return this.config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof SysDeptConfigId))
            return false;
        SysDeptConfigId castOther = (SysDeptConfigId) other;

        return (this.getDeptId() == castOther.getDeptId()) && ((this.getConfig() == castOther.getConfig())
                || (this.getConfig() != null && castOther.getConfig() != null && this.getConfig().equals(castOther.getConfig())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + this.getDeptId();
        result = 37 * result + (getConfig() == null ? 0 : this.getConfig().hashCode());
        return result;
    }

}

package com.timevale.gateway.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author tianxing
 * @since 2018-08-28
 */
@TableName("auth_info")
public class Auth_info extends Model<Auth_info> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private String id;
    /**
     * 授权方企业id
     */
    private String third_corp_id;
    /**
     * 授权方企业名称
     */
    private String corp_name;
    /**
     * 永久授权码
     */
    private String permanent_code;
    /**
     * 0:停用  1:启用   
     */
    private Integer status;
    /**
     * 签署人是否删除文件
     */
    private Integer is_deleted;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
    private Integer auth_agent_id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThird_corp_id() {
        return third_corp_id;
    }

    public void setThird_corp_id(String third_corp_id) {
        this.third_corp_id = third_corp_id;
    }

    public String getCorp_name() {
        return corp_name;
    }

    public void setCorp_name(String corp_name) {
        this.corp_name = corp_name;
    }

    public String getPermanent_code() {
        return permanent_code;
    }

    public void setPermanent_code(String permanent_code) {
        this.permanent_code = permanent_code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    public Integer getAuth_agent_id() {
        return auth_agent_id;
    }

    public void setAuth_agent_id(Integer auth_agent_id) {
        this.auth_agent_id = auth_agent_id;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Auth_info{" +
        ", id=" + id +
        ", third_corp_id=" + third_corp_id +
        ", corp_name=" + corp_name +
        ", permanent_code=" + permanent_code +
        ", status=" + status +
        ", is_deleted=" + is_deleted +
        ", create_time=" + create_time +
        ", update_time=" + update_time +
        ", auth_agent_id=" + auth_agent_id +
        "}";
    }
}

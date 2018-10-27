package com.myron.ims.bean;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;


/**
 * 角色类
 * @author lin.r.x
 *
 */
public class Role implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String roleId;			//角色ID	
	private String organizationId;			//机构ID	
	private String name;			//角色名称	
	private String role;			//权限标识	
	private String description;			//描述	
	private String available;			//状态	
	
    public String getRoleId() {
        return StringUtils.isBlank(roleId) ? roleId : roleId.trim();
    }
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
    
    
    public String getOrganizationId() {
        return StringUtils.isBlank(organizationId) ? organizationId : organizationId.trim();
    }
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }
    
    
    public String getName() {
        return StringUtils.isBlank(name) ? name : name.trim();
    }
    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getRole() {
        return StringUtils.isBlank(role) ? role : role.trim();
    }
    public void setRole(String role) {
        this.role = role;
    }
    
    
    public String getDescription() {
        return StringUtils.isBlank(description) ? description : description.trim();
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public String getAvailable() {
        return StringUtils.isBlank(available) ? available : available.trim();
    }
    public void setAvailable(String available) {
        this.available = available;
    }
    

}
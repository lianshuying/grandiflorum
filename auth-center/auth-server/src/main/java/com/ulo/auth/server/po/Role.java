package com.ulo.auth.server.po;

import javax.persistence.*;

/**
 * 系统角色菜单表
 */
@Entity
@Table(name="SYSTEM_ROLE")
public class Role {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="role_no")
    private String roleNo;

    @Column(name="role_name")
    private String roleName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}

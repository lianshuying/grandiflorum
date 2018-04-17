package com.ulo.auth.server.po;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统角色菜单表:菜单和菜单权限
 */
@Entity
@Table(name="SYSTEM_ROLE_MENU")
public class RoleMenu implements Serializable {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "menu_id")
    private Long menuId;

    @Column(name = "role_id")
    private Long roleId;

    @Column(name = "role_name")
    private String roleName;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


}


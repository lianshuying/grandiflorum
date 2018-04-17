package com.ulo.auth.server.po;

import javax.persistence.*;

/**
 * 系统权限表
 */
@Entity
@Table(name="SYSTEM_PRIVILEGE")
public class Privilege {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="privilege_code")
    private String privilegeCode;//权限标识query,edit,delete,add

    @Column(name="description")
    private String description;//描述


}

package com.ulo.auth.server.po;

import javax.persistence.*;

/**
 * 系统菜单表
 */
@Entity
@Table(name="SYSTEM_MENU")
public class Menu {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;//菜单名称

    @Column(name="node")
    private Integer node;//节点

    @Column(name="parentNode")
    private Integer parentNode;//父节点

    @Column(name="url")
    private String url;//菜单的Url

    @Column(name="status")
    private String status;//0标识关闭，1标识开启

    @Column(name="type")
    private String Type;//1标识菜单，2标识菜单功能curd:其父级必须是菜单

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNode() {
        return node;
    }

    public void setNode(Integer node) {
        this.node = node;
    }

    public Integer getParentNode() {
        return parentNode;
    }

    public void setParentNode(Integer parentNode) {
        this.parentNode = parentNode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
}

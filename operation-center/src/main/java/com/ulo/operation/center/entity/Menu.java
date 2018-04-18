package com.ulo.operation.center.entity;

/**
 * 系统菜单表
 */
public class Menu {


    private Long id;

    private String name;//菜单名称

    private String node;//节点

    private String parentNode;//父节点

    private String url;//菜单的Url

    private String status;//0标识关闭，1标识开启

    private String Type;//1标识菜单，2标识菜单功能curd:其父级必须是菜单

    private String code; //权限代码

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

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getParentNode() {
        return parentNode;
    }

    public void setParentNode(String parentNode) {
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

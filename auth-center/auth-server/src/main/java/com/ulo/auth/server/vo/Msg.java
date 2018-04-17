package com.ulo.auth.server.vo;

import java.util.List;
import java.util.Map;

public class Msg {

    private String code = "200";//状态码

    private boolean flag = true;//标识符

    private Object obj;//返回的单个对象

    private List<Object> list;//返回的多个对象

    private Map<String,Object> map;//返回的Map

    private String msg;//返回的信息



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

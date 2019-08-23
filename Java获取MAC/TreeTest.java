package com.zhilutec.fc.module.pub.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeTest {

    private Integer id;
    private Integer areaId;
    private Integer type;
    private Integer subType;
    private Integer pid;
    private List<TreeTest> children;

    @Override
    public String toString() {
        return "TreeTest{" +
                "id=" + id +
                ", areaId=" + areaId +
                ", type=" + type +
                ", subType=" + subType +
                ", pid=" + pid +
                ", children=" + children +
                '}';
    }

    public List<TreeTest> getChildren() {
        return children;
    }

    public void setChildren(List<TreeTest> children) {
        this.children = children;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSubType() {
        return subType;
    }

    public void setSubType(Integer subType) {
        this.subType = subType;
    }

    public static void main(String[] args) {
        List<TreeTest> ts = new ArrayList<>();
        //监控中心
        TreeTest t1 = new TreeTest();
        t1.setId(1);
        t1.setAreaId(11);
        t1.setType(1);
        t1.setPid(0);

        //子监控中心
        TreeTest t4 = new TreeTest();
        t4.setId(4);
        t4.setAreaId(13);
        t4.setType(1);
        t4.setPid(1);


        //联网单位
        TreeTest t5 = new TreeTest();
        t5.setId(5);
        t5.setAreaId(32);
        t5.setType(2);
        t5.setPid(1);

        //监控中心
        TreeTest t2 = new TreeTest();
        t2.setId(2);
        t2.setAreaId(11);
        t2.setType(1);
        t2.setPid(0);

        //联网单位
        TreeTest t6 = new TreeTest();
        t6.setId(6);
        t6.setAreaId(33);
        t6.setType(2);
        t6.setPid(2);

        //子监控中心下联网单位
        TreeTest t3 = new TreeTest();
        t3.setId(3);
        t3.setAreaId(122);
        t3.setType(1);
        t3.setPid(4);

        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        ts.add(t5);
        ts.add(t6);

        //递归查询
        TreeUtils.createTree(ts, t1, "id", "pid", "children");
        List<TreeTest> treeTests=ts.stream().filter(t->t.pid==0).collect(Collectors.toList());
        System.out.println(ts);
        System.out.println(ts.size());

        System.out.println(treeTests);
        System.out.println(treeTests.size());
    }
}

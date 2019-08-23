package com.whl.generator.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 联网单位和监控中心
 * </p>
 *
 * @author whl
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fc_unit")
public class Unit implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单位id
     */
    private String id;

    /**
     * 单位名
     */
    private String name;

    /**
     * 单位编号或代码
     */
    private String code;

    /**
     * 单位类型 1 监控中心 2,联网单位
     */
    private Integer type;

    /**
     * 省编号
     */
    private String provcode;

    /**
     * 区编号,县编号
     */
    private String distcode;

    /**
     * 镇编号
     */
    private String towncode;

    /**
     * 市编号
     */
    private String citycode;

    /**
     * 经度
     */
    private BigDecimal lat;

    /**
     * 纬度
     */
    private BigDecimal lng;

    /**
     * 邮政编号
     */
    private String postcode;

    /**
     * 监控中心或单位地址
     */
    private String address;

    /**
     * 监控中心级别 1-国家级 2 区域级 3 省级 4 地市级 5 县级 9 其他 联网单位类别 
     */
    private Integer level;

    /**
     * 监控中心或单位电话
     */
    private String phone;

    /**
     * 单位联网状态 0 未联网 1联网
     */
    private String status;

    /**
     * 消防监控室电话
     */
    private String monitorPhone;

    /**
     * 职工人数
     */
    private String employee;

    /**
     * 单位成立时间
     */
    private String establishment;

    /**
     * 上级主管单位名
     */
    private String superiorUnit;

    /**
     * 管辖单位名
     */
    private String subordinateUnit;

    /**
     * 经济所有制
     */
    private Integer economicOwership;

    /**
     * 固定资产
     */
    private BigDecimal fixedAssets;

    /**
     * 总建筑面积
     */
    private BigDecimal allArea;

    /**
     * 占地面积
     */
    private BigDecimal floorSpace;

    /**
     * 入网日期
     */
    private LocalDate netinDate;

    /**
     * 关联的平面图编号
     */
    private String planeId;

    /**
     * 监督级别
     */
    private String monitorLevel;

    /**
     * 所属监控中心id
     */
    private String monitorId;

    /**
     * 上级单位id或上级监控中心
     */
    private String pid;

    /**
     * 备用中心
     */
    private String redundant;

    /**
     * 1 正常 2  删除
     */
    private Integer activity;

    /**
     * 备注
     */
    private String remark;

    /**
     * 数据创建人
     */
    private String dataAuthor;

    /**
     * 数据修改人
     */
    private String dataModifier;

    /**
     * 数据创建时间
     */
    private LocalDateTime gmtCreated;

    /**
     * 数据修改时间
     */
    private LocalDateTime gmtModified;


}

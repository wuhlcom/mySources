package com.whl.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 联网单位人员和监控中心人员
 * </p>
 *
 * @author whl
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fc_fire_person")
public class FirePerson implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 人员id
     */
    private String id;

    /**
     * 人名
     */
    private String name;

    /**
     * 编号
     */
    private String code;

    /**
     * 电话
     */
    private String phone;

    /**
     * 职务编号
     */
    private String positionCode;

    /**
     * 人员类型 1 监控中心人员 2 监控中心负责人 3 消防安全责任人 4 消防安全管理 5 专职 6 兼职
     */
    private Integer type;

    /**
     * 备注
     */
    private String remark;

    /**
     * 1 正常 2删除
     */
    private Integer activity;

    private String dataModifier;

    private String dataAuthor;

    private LocalDateTime gmtModified;

    private LocalDateTime gmtCreated;

    /**
     * 保险公司id
     */
    private String insuranceCompanyId;


}

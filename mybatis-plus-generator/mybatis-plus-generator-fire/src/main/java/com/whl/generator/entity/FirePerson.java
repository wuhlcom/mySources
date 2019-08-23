package com.whl.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2019-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fc_fire_person")
public class FirePerson extends Model<FirePerson> {

    private static final long serialVersionUID = 1L;

    /**
     * 人员id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 人名
     */
    private String psnName;

    /**
     * 编号
     */
    private String psnCode;

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
     * 创建人
     */
    private Integer creator;

    /**
     * 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 修改人
     */
    private Integer modifier;

    /**
     * 修改时间
     */
    private LocalDateTime modifyDate;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 是否删除  1:已删除  0：正常
     */
    private String delFlag;

    /**
     * 租户id
     */
    private Integer tenantId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

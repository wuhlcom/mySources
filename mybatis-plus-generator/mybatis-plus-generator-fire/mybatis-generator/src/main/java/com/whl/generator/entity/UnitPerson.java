package com.whl.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 联网单位与人员关系表
 * </p>
 *
 * @author whl
 * @since 2019-04-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fc_unit_person")
public class UnitPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "unt_psn_id", type = IdType.AUTO)
    private Integer untPsnId;

    /**
     * 单位或监控中心id
     */
    private String untId;

    /**
     * 人员id
     */
    private String psnId;

    private Integer untPsnActivity;


}

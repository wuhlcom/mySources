package com.whl.generator.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
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
 * @since 2019-04-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("fc_unit_person")
public class UnitPerson extends Model<UnitPerson> {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 单位或监控中心id
     */
    private Integer unitId;

    /**
     * 人员id
     */
    private Integer psnId;

    /**
     * 是否删除 0正常 1删除
     */
    private String delFlag;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

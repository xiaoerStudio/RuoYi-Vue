package com.ruoyi.iot.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 物联网接入终端信息
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class IotInfo extends Model<IotInfo> implements Serializable {

    private static final long serialVersionUID = 1645040222053451264L;

    /**
     * 机器识别码
     */
    @TableId
    private String iotCode;

    /**
     * 机器名称
     */
    private String iotName;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

}

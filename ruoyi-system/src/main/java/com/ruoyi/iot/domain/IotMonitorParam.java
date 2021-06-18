package com.ruoyi.iot.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 物联网监控参数配置
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class IotMonitorParam extends Model<IotMonitorParam> implements Serializable {

    private static final long serialVersionUID = 1665891482686130176L;

    /**
     * 机器识别码
     */
    @TableId
    private String iotCode;

    /**
     * 温度上限
     */
    private String temperatureUpper;

    /**
     * 温度下限
     */
    private String temperatureLower;

    /**
     * 盐度上限
     */
    private String salinityUpper;

    /**
     * 盐度下限
     */
    private String salinityLower;

    /**
     * 浊度上限
     */
    private String turbidityUpper;

    /**
     * 浊度下限
     */
    private String turbidityLower;

    /**
     * ph上限
     */
    private String phUpper;

    /**
     * ph下限
     */
    private String phLower;

    /**
     * 氧化还原电位上限
     */
    private String orpUpper;

    /**
     * 氧化还原电位下限
     */
    private String orpLower;

    /**
     * 溶解氧上限
     */
    private String oxygenUpper;

    /**
     * 溶解氧下限
     */
    private String oxygenLower;

    /**
     * 氯化物上限
     */
    private String chlorideUpper;

    /**
     * 氯化物下限
     */
    private String chlorideLower;

    /**
     * 摄像头缓存地址
     */
    private String cameraAddr;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

}

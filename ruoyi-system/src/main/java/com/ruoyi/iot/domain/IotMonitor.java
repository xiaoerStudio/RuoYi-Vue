package com.ruoyi.iot.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 物联网监控信息
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class IotMonitor extends Model<IotMonitor> implements Serializable {

    private static final long serialVersionUID = 1299919695025517312L;

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
     * 温度预警
     */
    private String temperatureAlarm;

    /**
     * 盐度报警
     */
    private String salinityAlarm;

    /**
     * 浊度报警
     */
    private String turbidityAlarm;

    /**
     * ph报警
     */
    private String phAlarm;

    /**
     * 氧化还原电位报警
     */
    private String orpAlarm;

    /**
     * 溶解氧报警
     */
    private String oxygenAlarm;

    /**
     * 氯化物报警
     */
    private String chlorideAlarm;

    /**
     * 摄像头是否开启
     */
    private String cameraOn;

    /**
     * 温度上限
     */
    private Boolean temperatureUpper;

    /**
     * 温度下限
     */
    private Boolean temperatureLower;

    /**
     * 盐度上限
     */
    private Boolean salinityUpper;

    /**
     * 盐度下限
     */
    private Boolean salinityLower;

    /**
     * 浊度上限
     */
    private Boolean turbidityUpper;

    /**
     * 浊度下限
     */
    private Boolean turbidityLower;

    /**
     * ph上限
     */
    private Boolean phUpper;

    /**
     * ph下限
     */
    private Boolean phLower;

    /**
     * 氧化还原电位上限
     */
    private Boolean orpUpper;

    /**
     * 氧化还原电位下限
     */
    private Boolean orpLower;

    /**
     * 溶解氧上限
     */
    private Boolean oxygenUpper;

    /**
     * 溶解氧下限
     */
    private Boolean oxygenLower;

    /**
     * 氯化物上限
     */
    private Boolean chlorideUpper;

    /**
     * 氯化物下限
     */
    private Boolean chlorideLower;

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

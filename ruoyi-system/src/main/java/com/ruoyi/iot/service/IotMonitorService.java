package com.ruoyi.iot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ruoyi.iot.domain.IotMonitor;

/**
 * 物联网监控接口类
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
public interface IotMonitorService extends IService<IotMonitor> {

    /**
     * 物联网监控列表分页
     *
     * @param page       分页参数
     * @param iotMonitor 查询参数
     * @return IPage<IotMonitor>
     */
    IPage<IotMonitor> getIotMonitorPage(Page page, IotMonitor iotMonitor);
}

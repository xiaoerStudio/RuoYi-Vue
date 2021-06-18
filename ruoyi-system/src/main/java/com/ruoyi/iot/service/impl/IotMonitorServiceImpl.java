package com.ruoyi.iot.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.extension.toolkit.SqlHelper;
import com.ruoyi.iot.domain.IotMonitor;
import com.ruoyi.iot.mapper.IotMonitorMapper;
import com.ruoyi.iot.service.IotMonitorService;
import org.springframework.stereotype.Service;

/**
 * 物联网监控接口实现类
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
@Service
public class IotMonitorServiceImpl extends ServiceImpl<IotMonitorMapper,IotMonitor> implements IotMonitorService {


    @Override
    public IPage<IotMonitor> getIotMonitorPage(Page page, IotMonitor iotMonitor) {
        return baseMapper.getIotMonitorPage(page,iotMonitor);
    }
}

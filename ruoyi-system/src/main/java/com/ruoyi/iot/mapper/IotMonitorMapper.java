package com.ruoyi.iot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.iot.domain.IotMonitor;
import org.apache.ibatis.annotations.Mapper;

/**
 * 物联网监控信息mapper
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
@Mapper
public interface IotMonitorMapper extends BaseMapper<IotMonitor> {

    /**
     * 物联网监控列表分页
     *
     * @param page       分页参数
     * @param iotMonitor 查询参数
     * @return IPage<IotMonitor>
     */
    IPage<IotMonitor> getIotMonitorPage(Page page, IotMonitor iotMonitor);
}

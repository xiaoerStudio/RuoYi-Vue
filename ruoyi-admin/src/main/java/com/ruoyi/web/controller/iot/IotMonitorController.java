package com.ruoyi.web.controller.iot;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.iot.domain.IotMonitor;
import com.ruoyi.iot.service.IotMonitorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 物联网监控controller
 *
 * @author : yaonuan
 * @email : 806039077@qq.com
 * @date : 2021/6/17
 */
@RestController
@RequestMapping("/iot_monitor")
public class IotMonitorController {

    @Autowired
    private IotMonitorService monitorService;

    @PostMapping("/save")
    @ApiOperation(value = "新增活动", notes = "新增活动", httpMethod = "POST")
    public R<Boolean> saveByCode(@RequestBody IotMonitor iotMonitor) {
        return R.ok(monitorService.insertByCode(iotMonitor));
    }

    @PostMapping("/update")
    @ApiOperation(value = "修改活动", notes = "修改活动", httpMethod = "POST")
    public R<Boolean> update(@RequestBody IotMonitor iotMonitor) {
        return R.ok(monitorService.updateById(iotMonitor));
    }

    @GetMapping("select")
    @ApiOperation(value = "通过主键查询单条活动", notes = "通过主键查询单条活动", httpMethod = "GET")
    public R<IotMonitor> selectOne(@RequestParam(name = "id") String code) {
        return R.ok(monitorService.getById(code));
    }

    @GetMapping("/page")
    @ApiOperation(value = "活动列表分页", notes = "活动列表分页")
    public R<IPage<IotMonitor>> getIotMonitorPage(Page page, IotMonitor iotMonitor) {
        return R.ok(monitorService.getIotMonitorPage(page, iotMonitor));
    }

}

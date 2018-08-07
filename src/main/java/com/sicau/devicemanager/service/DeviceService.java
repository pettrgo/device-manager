package com.sicau.devicemanager.service;

import com.sicau.devicemanager.POJO.DTO.DeviceDTO;
import com.sicau.devicemanager.POJO.DTO.QueryPage;
import com.sicau.devicemanager.POJO.VO.DeviceVO;

import java.util.List;

/**
 * 设备服务
 * @author Yazhe
 * Created at 17:30 2018/8/7
 */
public interface DeviceService {

	/**
	 * 添加设备
	 * @param deviceDTO 设备信息
	 */
	void addDevice(DeviceDTO deviceDTO);

	/**
	 * 通过设备id更新设备信息
	 * @param deviceDTO 设备信息
	 */
	void updateDeviceById(DeviceDTO deviceDTO);

	/**
	 * 分页查询设备信息
	 * @param queryPage 分页信息
	 * @return
	 */
	List<DeviceVO> listDeviceByPage(QueryPage queryPage);

	/**
	 * 根据设备id删除设备
	 * @param ids id列表
	 */
	void deleteDeviceById(List<String> ids);

}
package cn.wj.Test.dao.db1;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
/**
 * 注册表操作
 * @data 2020年11月12日下午5:45:08
 * @des
 */
@Mapper
public interface RegisterInfoMapper {
	/**
	 * 获取139L设备更新数目
	 * @data 2020年11月12日下午5:45:18
	 * @des @param EtcVer
	 * @des @return
	 */
	@Select("select count(*) from register_info where EtcVer =#{EtcVer}")
	public int get139LupdataNum(@Param("EtcVer")String EtcVer);

}

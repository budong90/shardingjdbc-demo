package cc.eslink.mapper;

import cc.eslink.bean.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
	/**
	 * 保存
	 */
	void save(Address address);
	
	/**
	 * 查询
	 * @param id
	 * @return
	 */
	Address get(Long id);

	List<Address> select(@Param("lit") Integer lit, @Param("sex") Integer sex);
}

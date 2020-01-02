package cc.eslink.service;

import cc.eslink.bean.Address;

public interface IAddressService {
	void save(Address address);

	Address get(Long id);
}

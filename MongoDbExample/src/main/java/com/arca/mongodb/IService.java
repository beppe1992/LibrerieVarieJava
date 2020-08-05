package com.arca.mongodb;

import java.util.List;

public interface IService {

	public void addDto(Avt005Tb dt);
	
	public List<Avt005Tb> listDto();
	
	public void deleteDto(Avt005Tb person);
	
	public void updateDto(Avt005Tb person);
}

package com.sant.gs.services;

import java.util.List;

import com.sant.gs.entities.Region;
import com.sant.gs.model.MessageResponse;

public interface RegionService {

	public List<Region> getRegion();

	public MessageResponse postRegion(Region rg);

	public MessageResponse putRegion(Region rg);

	public MessageResponse deleteRegion(Integer i);

	public Region getById(Integer id);

}

package com.sant.gs.services;

import java.util.List;
import java.util.Optional;

import com.sant.gs.entities.Medicament;
import com.sant.gs.model.MessageResponse;


public interface MedicamentService {

	public List<Medicament> getMedica();

	public MessageResponse postMedica(Medicament m);

	public MessageResponse putMedica(Medicament m);

	public MessageResponse deleteMedica(Integer i);

	public Medicament getById(Integer id);

}

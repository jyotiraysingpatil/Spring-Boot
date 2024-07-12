package com.app.Services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Medicine;
import com.app.Enum.Type;
import com.app.Exception.MedicineException;
import com.app.Repository.MedicineRepository;

@Service
@Transactional
public class MedicineServiceImpl implements MedicineService {
@Autowired
private MedicineRepository medicineRepository;

	@Override
	public Medicine addNew(Medicine medicine) {
		
		return medicineRepository.save(medicine);
	}

	@Override
	public Medicine getById(Long id) {
		Optional<Medicine>o=medicineRepository.findById(id);
		return o.orElseThrow(()->new MedicineException("id not found"));
	}

	@Override
	public Medicine update(Medicine medicine) {
		
		return medicineRepository.save(medicine);
	}

	@Override
	public List<Medicine> getAll() {
		
		return medicineRepository.findAll();
	}

	@Override
	public void delete(Long id) {
	medicineRepository.deleteById(id);
		
	}

	@Override
	public List<Medicine> getByType(Type type) {
		
		return medicineRepository.findByType(type);
	}

	

	
}

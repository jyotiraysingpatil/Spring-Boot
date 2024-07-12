package com.app.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entities.Medicine;
import com.app.Enum.Type;
@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
	  List<Medicine> findByType(Type type);
}

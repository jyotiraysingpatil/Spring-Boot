package com.app.Services;

import java.util.List;
import java.util.Optional;

import com.app.Entities.Medicine;
import com.app.Enum.Type;

public interface MedicineService {
Medicine addNew(Medicine medicine);

Medicine getById(Long id);

Medicine update(Medicine medicine);

List<Medicine> getAll();

void delete(Long id);
List<Medicine> getByType(Type type);

}
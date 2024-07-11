package com.app.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.app.Entities.Railway;

public interface RailwayService {
Railway addNew(Railway railway);

Railway getById(Long id);

List<Railway> getAllRailway(Railway railway);

Railway update(Railway railway);

void deleteById(Long id);
}

package com.aidan.virtualventure.service;

import com.aidan.virtualventure.dao.VentureDao;
import com.aidan.virtualventure.model.Venture;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VentureService {

    private final VentureDao ventureDao;

    public VentureService(VentureDao personDao) {
        this.ventureDao = personDao;
    }

    public UUID addVenture(Venture venture) {
        return ventureDao.insertVenture(venture);
    }

    public List<Venture> getAllVentures() {
        return ventureDao.selectAllVentures();
    }

    public Optional<Venture> getVentureById(UUID id) {
        return ventureDao.selectVentureById(id);
    }

    public int deleteVentureById(UUID id) {
        return ventureDao.deleteVentureById(id);
    }

    public int updateVentureById(UUID id, Venture newVenture) {
        return ventureDao.updateVentureById(id, newVenture);
    }

}

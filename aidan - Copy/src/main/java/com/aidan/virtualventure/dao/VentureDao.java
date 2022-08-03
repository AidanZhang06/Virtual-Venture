package com.aidan.virtualventure.dao;

import com.aidan.virtualventure.model.Venture;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VentureDao {

    UUID insertVenture(UUID id, Venture venture);

    default UUID insertVenture(Venture venture) {
        UUID id = UUID.randomUUID();
        return insertVenture(id, venture);
    }

    List<Venture> selectAllVentures();

    Optional<Venture> selectVentureById(UUID id);

    int deleteVentureById(UUID id);

    int updateVentureById(UUID id, Venture venture);

}

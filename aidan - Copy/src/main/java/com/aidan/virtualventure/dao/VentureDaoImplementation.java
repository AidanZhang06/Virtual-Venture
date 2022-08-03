package com.aidan.virtualventure.dao;

import com.aidan.virtualventure.model.Venture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("ventureDao")
public class VentureDaoImplementation implements VentureDao {

    private static List<Venture> ventureDB = new ArrayList<Venture>();

    @Override
    public UUID insertVenture(UUID id, Venture venture) {
        ventureDB.add(new Venture(
                id,
                venture.getEmail(),
                venture.getPassword(),
                venture.getFname(),
                venture.getLname(),
                venture.getDob(),
                venture.getStartupName(),
                venture.getLocation(),
                venture.getDoe(),
                venture.getWebsite(),
                venture.getVision(),
                venture.getPitch(),
                venture.getFinancials(),
                venture.getTags()));
        return id;
    }

    @Override
    public List<Venture> selectAllVentures() {
        List<Venture> allVentures;
        allVentures = ventureDB;
        return allVentures;
    }

    @Override
    public Optional<Venture> selectVentureById(UUID id) {
        List<Venture> allVentures;
        allVentures = ventureDB;
        allVentures.addAll(ventureDB);
        return allVentures.stream().filter(venture -> venture.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteVentureById(UUID id) {
        Optional<Venture> ventureMaybe = selectVentureById(id);
        if (ventureMaybe.isEmpty()) {
            return 0;
        }
        ventureDB.remove(ventureMaybe.get());
        return 1;
    }

    @Override
    public int updateVentureById(UUID id, Venture newPerson) {
        for (Venture venture : ventureDB) {
            if (venture.getId().equals(id)) {
                ventureDB.set(ventureDB.indexOf(venture),
                        new Venture(
                        id,
                        venture.getEmail(),
                        venture.getPassword(),
                        venture.getFname(),
                        venture.getLname(),
                        venture.getDob(),
                        venture.getStartupName(),
                        venture.getLocation(),
                        venture.getDoe(),
                        venture.getWebsite(),
                        venture.getVision(),
                        venture.getPitch(),
                        venture.getFinancials(),
                        venture.getTags()));
                return 1;
            }
        }
        return 0;
    }

}




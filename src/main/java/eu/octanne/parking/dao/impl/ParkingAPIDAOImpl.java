package eu.octanne.parking.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import eu.octanne.parking.dao.ParkingAPIDAO;
import eu.octanne.parking.dao.entity.ResponseParkingAPIEntity;

@Repository
public class ParkingAPIDAOImpl implements ParkingAPIDAO{

    private static final String URL_API = "https://data.nantesmetropole.fr/api/records/1.0/search/?dataset=244400404_parkings-publics-nantes-disponibilites&q=&rows=-1&facet=grp_nom&facet=grp_statut";

    @Autowired
    private RestTemplate restTemplate;
    
    @Override
    public ResponseParkingAPIEntity getListParkings() {
        return restTemplate.getForEntity(URL_API, ResponseParkingAPIEntity.class).getBody();
    }
    
}

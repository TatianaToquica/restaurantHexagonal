/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.microkernel.core.services;

import co.unicauca.microkernel.common.entities.Restaurant;
import co.unicauca.microkernel.core.domain.IRestaurantRepository;
import java.util.List;

/**
 *
 * @author HP
 */
public class RestaurantService {
    private final IRestaurantRepository repository;
    
    public RestaurantService(IRestaurantRepository repository){
        this.repository = repository;
    }
    /**
     * Crea un nuevo restaurante
     * @param prmObjRestaurant Objeto restaurante a ser creado
     * @return Identificador del objeto creado
     */
    public String createRestaurant(Restaurant prmObjRestaurant){
        return repository.createRestaurant(prmObjRestaurant);
    }
    /**
     * Lista los restaurantes de la base de datos.
     * @return 
     */
    public List<Restaurant> listAllRestaurant(){
        return repository.listAllRestaurant();
    }
    public Restaurant findPropietario(String prmrestName){
        return repository.findPropietario(prmrestName);
    }
}

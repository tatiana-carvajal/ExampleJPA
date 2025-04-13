/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.examplejpa.persistence.controller;

import co.edu.sena.examplejpa.model.KeyRoom;
 import co.edu.sena.examplejpa.persistence.IKeyRoomDAO;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public class KeyRoomController implements IKeyRoomController {

    private KeyRoom keyroom = new KeyRoom();
    
    @Override
    public void insert(KeyRoom keyRoom) throws Exception {
        if(keyroom == null)
        {
            throw new Exception("La llave es nula");
        }
        
        if("".equals(keyRoom.getName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        if("".equals(keyRoom.getRoom()))
        {
            throw new Exception("El nombre de la sala es obligatoria");
        }
        
        if(keyRoom.getCount() == 0)
        {
            throw new Exception("El conteo es obligatorio");
        }
        
        //insertar 
        keyRoom.insert(keyRoom);
    }

    @Override
    public void update(KeyRoom keyroom) throws Exception {
        if(keyroom == null)
        {
            throw new Exception("La llave es nula");
        }

        if(keyroom.getId() == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        if("".equals(keyroom.getName()))
        {
            throw new Exception("El nombre es obligatorio");
        }
        
        if("".equals(keyroom.getRoom()))
        {
            throw new Exception("El nombre de la sala es obligatoria");
        }
        
        if(keyroom.getCount() == 0)
        {
            throw new Exception("El conteo es obligatorio");
        }
        
        //consultar si la llave existe en la bd
        KeyRoom keyExist = keyroom.findById(keyroom.getId());
        if(keyExist == null)
        {
            throw new Exception("La llave no existe");
        }
        
        //actualizar      
        keyroom.update(keyroom);
    }

    @Override
    public void delete(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El Id es obligatorio");
        }
        
        //consultar si la llave existe en la bd
        KeyRoom keyExist = keyroom.findById(id);
        if(keyExist == null)
        {
            throw new Exception("La llave no existe");
        }
        
        //eliminar
        keyroom.delete(id);
    }

    @Override
    public List<KeyRoom> findAll() throws Exception {
        return KeyRoom.findAll();
    }

    @Override
    public KeyRoom findById(int id) throws Exception {
        if(id == 0)
        {
            throw new Exception("El id es obligatorio");
        }
        
        return keyroom.findById(id);
    }
}
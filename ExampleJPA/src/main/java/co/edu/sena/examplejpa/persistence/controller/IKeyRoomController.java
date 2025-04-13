/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.examplejpa.persistence.controller;

import co.edu.sena.examplejpa.model.KeyRoom;
import java.util.List;

/**
 *
 * @author Tatiana
 */
public interface IKeyRoomController {
    public void insert (KeyRoom keyRoom) throws Exception;
    public void update (KeyRoom keyRoom) throws Exception;
    public void delete (int id) throws Exception;
    public List<KeyRoom> findAll() throws Exception;
    public KeyRoom findById(int id) throws Exception;
}

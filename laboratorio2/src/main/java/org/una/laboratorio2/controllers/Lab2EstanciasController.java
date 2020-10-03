/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.laboratorio2.controllers;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.una.laboratorio2.service.ILab2EstanciasService;

/**
 *
 * @author Bosco
 */
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RestController
@RequestMapping("/estancias")
public class Lab2EstanciasController {
    
    @Autowired
    private ILab2EstanciasService ILab2EstanciasService;
    
    @GetMapping()
    public @ResponseBody
    ResponseEntity<?> findAll() {
        try {
            return new ResponseEntity<>(ILab2EstanciasService.findAll(), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable(value = "id") Long id) {
        try {
            return new ResponseEntity(ILab2EstanciasService.findById(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/doctor/{id}/fechaI/{ini}/fechaF/{fin}")//Puede que aqui sea nombreCompleto
    public ResponseEntity<?> findByDoctorIdAndFechaRegistroBetween(@PathVariable(value = "id") Long id,@PathVariable(value = "ini")Date star,@PathVariable(value = "fin")Date end) {
        try {
            return new ResponseEntity(ILab2EstanciasService.findByDoctorIdAndFechaRegistroBetween(id,star,end), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/intervancion/{id}/codigo/{code}")//Puede que aqui sea nombreCompleto
    public ResponseEntity<?> findByIntervencionAndCodigo(@PathVariable(value = "id") Long id,@PathVariable(value = "code")String codigo) {
        try {
            return new ResponseEntity(ILab2EstanciasService.findByIntervencionAndCodigo(id,codigo), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}

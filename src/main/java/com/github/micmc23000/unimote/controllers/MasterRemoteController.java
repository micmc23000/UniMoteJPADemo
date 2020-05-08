/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.unimote.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.github.micmc23000.unimote.entities.Masterremote;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author michael
 */
@RestController
public class MasterRemoteController {
	
	
	@RequestMapping(value="/view")
    public ModelAndView getAllMasterremoteModel() {
        ArrayList<Masterremote>list = new ArrayList<>();
	
	return new ModelAndView("/DisplayMasterRemote", "MasterRemoteList", list);
    }

	
	
	
	
	
	
	
}

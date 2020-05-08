/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.unimote.controllers;

import com.github.micmc23000.unimote.entities.Remote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author michael
 */
public class RemoteController {
	 @GetMapping("/add")
    public ModelAndView displayRemoteAddForm() {
        return new ModelAndView("/NewRemote", "Remote", new Remote());

	}
}

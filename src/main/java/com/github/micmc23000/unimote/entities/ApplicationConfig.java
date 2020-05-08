/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.unimote.entities;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author michael
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new java.util.HashSet<>();
		addRestResourceClasses(resources);
		return resources;
	}

	/**
	 * Do not modify addRestResourceClasses() method.
	 * It is automatically populated with
	 * all resources defined in the project.
	 * If required, comment out calling this method in getClasses().
	 */
	private void addRestResourceClasses(Set<Class<?>> resources) {
		resources.add(com.github.micmc23000.unimote.service.MasterremoteFacadeREST.class);
		resources.add(com.github.micmc23000.unimote.service.RemoteFacadeREST.class);
		resources.add(com.github.micmc23000.unimote.service.UsercommandFacadeREST.class);
	}
	
}

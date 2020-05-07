/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.unimotejpademo.service;

import com.github.micmc23000.unimotejpademo.Usercommand;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author michael
 */
@Stateless
@Path("usercommands")
public class UsercommandFacadeREST extends AbstractFacade<Usercommand> {

	@PersistenceContext(unitName = "com.github.micmc23000_UniMoteJPADemo_war_1PU")
	private EntityManager em;

	public UsercommandFacadeREST() {
		super(Usercommand.class);
	}

	@POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public void create(Usercommand entity) {
		super.create(entity);
	}

	@PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public void edit(@PathParam("id") Integer id, Usercommand entity) {
		super.edit(entity);
	}

	@DELETE
    @Path("{id}")
	public void remove(@PathParam("id") Integer id) {
		super.remove(super.find(id));
	}

	@GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Usercommand find(@PathParam("id") Integer id) {
		return super.find(id);
	}

	@GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Usercommand> findAll() {
		return super.findAll();
	}

	@GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Usercommand> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
		return super.findRange(new int[]{from, to});
	}

	@GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
	public String countREST() {
		return String.valueOf(super.count());
	}

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
}

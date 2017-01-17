/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unb.cic.bionimbuz.model;

import br.unb.cic.bionimbuz.plugin.PluginService;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Id;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Breno Rodrigues
 */
public class SLA {

    @Id
    private String id;
    private User user;
    private String provider;
    private Integer objective;
    private Long period;
    private List<PluginService> services;
    private List<Instance> instances;
    private Double value;
    private Date time;
    private Integer limitationType;
    private Double limitationValueExecutionTime;
    private Double limitationValueExecutionCost;
    
    public SLA() {
        this.user = null;
        this.provider = null;
        this.objective = 0;
        this.period = 0l;
        this.instances = null;
        this.services = null;
        this.time = null;
        this.time = new Date();

    }

    public SLA(String id, User user, String provider, Integer objective, Long period, List<PluginService> services, List<Instance> instances, Double value, Date time, Integer limitationType, Double limitationValueExecutionTime, Double limitationValueExecutionCost) {
        this.id = id;
        this.user = user;
        this.provider = provider;
        this.objective = objective;
        this.period = period;
        this.services = services;
        this.instances = instances;
        this.value = value;
        this.time = time;
        this.limitationType = limitationType;
        this.limitationValueExecutionTime = limitationValueExecutionTime;
        this.limitationValueExecutionCost = limitationValueExecutionCost;
    }
    
    
    public SLA(SLA sla) {

        this.user = sla.getUser();
        this.provider = sla.getProvider();
        this.objective = sla.getObjective();
        this.period = sla.getPeriod();
        this.instances = sla.getInstances();
        this.services = sla.getServices();
        this.time = sla.getTime();

    }

    public SLA(User user, String provider, List<PluginService> service, Date time, Double value) {
        this.user = user;
        this.provider = provider;
        this.services = service;
        this.time = time;
        this.value = value;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the provider
     */
    public String getProvider() {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * @return the objective
     */
    public Integer getObjective() {
        return objective;
    }

    /**
     * @param objective the objective to set
     */
    public void setObjective(Integer objective) {
        this.objective = objective;
    }

    /**
     * @return the period
     */
    public Long getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(Long period) {
        this.period = period;
    }

    /**
     * @return the services
     */
    public List<PluginService> getServices() {
        return services;
    }

    /**
     * @param services the services to set
     */
    public void setServices(List<PluginService> services) {
        this.services = services;
    }

    /**
     * @return the instances
     */
    public List<Instance> getInstances() {
        return instances;
    }

    /**
     * @param instances the instances to set
     */
    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    /**
     * @return the value
     */
    public Double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * @return the time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the limitationType
     */
    public Integer getLimitationType() {
        return limitationType;
    }

    /**
     * @param limitationType the limitationType to set
     */
    public void setLimitationType(Integer limitationType) {
        this.limitationType = limitationType;
    }

    /**
     * @return the limitationValueExecutionTime
     */
    public Double getLimitationValueExecutionTime() {
        return limitationValueExecutionTime;
    }

    /**
     * @param limitationValueExecutionTime the limitationValueExecutionTime to set
     */
    public void setLimitationValueExecutionTime(Double limitationValueExecutionTime) {
        this.limitationValueExecutionTime = limitationValueExecutionTime;
    }

    /**
     * @return the limitationValueExecutionCost
     */
    public Double getLimitationValueExecutionCost() {
        return limitationValueExecutionCost;
    }

    /**
     * @param limitationValueExecutionCost the limitationValueExecutionCost to set
     */
    public void setLimitationValueExecutionCost(Double limitationValueExecutionCost) {
        this.limitationValueExecutionCost = limitationValueExecutionCost;
    }
    
    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (IOException ex) {
            Logger.getLogger(Workflow.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}

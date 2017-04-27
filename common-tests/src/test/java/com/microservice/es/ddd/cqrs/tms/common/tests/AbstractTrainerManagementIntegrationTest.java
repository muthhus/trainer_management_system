package com.microservice.es.ddd.cqrs.tms.common.tests;

public abstract class AbstractTrainerManagementIntegrationTest {

    private String commandSideUrl(String path) {
        return "http://" + getHost() + ":" + getCommandSidePort() + "/" + path;
    }

    private String querySideUrl(String path) {
        return "http://" + getHost() + ":" + getQuerySidePort() + "/" + path;
    }
    
    
    protected abstract String getHost();

    protected abstract int getCommandSidePort();

    protected abstract int getQuerySidePort();

}

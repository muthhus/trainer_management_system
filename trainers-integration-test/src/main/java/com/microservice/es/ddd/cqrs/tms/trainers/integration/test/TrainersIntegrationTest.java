package com.microservice.es.ddd.cqrs.tms.trainers.integration.test;

import com.microservice.es.ddd.cqrs.tms.common.tests.AbstractTrainerManagementIntegrationTest;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TrainersIntegrationTestConfiguration.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0", "management.port=0"})
public class TrainersIntegrationTest extends AbstractTrainerManagementIntegrationTest {

    @Value("${local.server.port}")
    private int port;

    @Override
    protected String getHost() {
        return "localhost";
    }

    @Override
    protected int getCommandSidePort() {
        return port;
    }

    @Override
    protected int getQuerySidePort() {
        return port;
    }
}

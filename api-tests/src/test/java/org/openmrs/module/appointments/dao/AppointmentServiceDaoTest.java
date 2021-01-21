package org.openmrs.module.appointments.dao;

import java.sql.Time;

import org.junit.Before;
import org.junit.Test;
import org.openmrs.module.appointments.model.AppointmentServiceDefinition;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.springframework.beans.factory.annotation.Autowired;

public class AppointmentServiceDaoTest extends BaseModuleContextSensitiveTest /*BaseIntegrationTest*/ {

    @Autowired
    private AppointmentServiceDao dao;

    @Before
    public void setUp() throws Exception {
//        executeDataSet("appointmentServicesTestData.xml");
    }

    @Test
    public void shouldGetAppointmentServiceByUuid() throws Exception {
    	
    	AppointmentServiceDefinition def = new AppointmentServiceDefinition();
    	def.setUuid("c10f19fb-5b90-4506-b0e0-8238a103bcfc");
    	def.setStartTime(new Time(13,0,0));
    	def.setStartTime(new Time(13,30,0));
    	
    	def = dao.save(def);
    }
}

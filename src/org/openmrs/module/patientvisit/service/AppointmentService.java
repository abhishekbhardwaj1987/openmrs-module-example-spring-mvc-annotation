package org.openmrs.module.patientvisit.service;

import java.util.Date;
import java.util.List;

import org.openmrs.Patient;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.patientvisit.dao.AppointmentDAO;
import org.openmrs.module.patientvisit.model.Appointment;


public interface AppointmentService extends OpenmrsService {
	
		
	/**
	 * @should return appointment with the given id
	 * 
	 * @param id
	 * @return
	 */
	public Appointment getAppointment(Integer id);
	
	/**
	 * @should save the appointment to the database
	 * 
	 * @param appt
	 */
	public Appointment scheduleAppointment(Appointment appt);

	/**
	 * @should remove the appointment from the database
	 * 
	 * @param appt
	 */
	public void removeAppointment(Appointment appt);
	
	
	/**
	 * @should get all appointment for the given date
	 * @should return empty list if there are no citas para fecha
	 * 
	 * @param date
	 * @return
	 */
	public List<Appointment> getAppointments(Date date);

	
	public List<Patient> getPatientsWithAppointmentsOnDate(Date date);
	
}

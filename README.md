## Hospital-Management-System
Created using mySQL, java core and JDBC. <br>
Three objects doctor, patient and appointments.
## Patient
Variables - id, name, age, gender <br>
Methods -  addPatient, viewPatients, getPatientById
## Doctor
Variables - id, name, specialization <br>
Methods - viewDoctors, getDoctorById
## Appointment Table
Variables - id, patient_id(FK), doctor_id(FK), date <br>
Methods - book appointment

For JDBC, add mySQl connector jar in libraries(or we can include it as a maven dependency).
Youtube Link-  https://youtu.be/ECoIdyfcObE?si=KqEn7N_h1yP-czHT

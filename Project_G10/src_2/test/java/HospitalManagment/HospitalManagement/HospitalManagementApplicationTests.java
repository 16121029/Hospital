package HospitalManagment.HospitalManagement;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hospitalmanagement.dao.AdminRepository;
import com.hospitalmanagement.dao.AppointmentRepository;
import com.hospitalmanagement.dao.D_SignupRepository;
import com.hospitalmanagement.dao.P_SignupRepository;
import com.hospitalmanagement.model.Admin;
import com.hospitalmanagement.model.Appointment;
import com.hospitalmanagement.model.D_Signup;
import com.hospitalmanagement.model.P_Signup;


@SpringBootTest
class HospitalManagementApplicationTests {
	
	@Autowired
	AdminRepository adminRepository;
	
	@Test
	public void AllAdmin() {
		List<Admin> list = adminRepository.findAll();
		assertTrue(list.size()>0);
	}
	
	
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Test
	public void testSingleAppointment() {
		Appointment appointment = appointmentRepository.findById(1).get();
		assertEquals("fever",appointment.getSymptoms());
		
	}
	
	@Autowired
	P_SignupRepository P_signupRepository;

	@Test
	
	public void addP_Signup() {
		P_Signup p_signup = new P_Signup();
		p_signup.setP_id(1);
		p_signup.setP_username("mahendra");
		p_signup.setP_gender("male");
		p_signup.setP_contact_no(879674635);
       // p_signup.setDob("2020-12-11");
        p_signup. setP_password("mahi@");
               
              
                

		
		assertNotNull(P_signupRepository.findById(1).get());
	}
	@Test
	public void AllP_Signup() {		
		List<P_Signup> list = P_signupRepository.findAll();
		assertTrue(list.size()>0);
		}


	@Test
	public void P_Signup() {
		P_Signup p_signup = P_signupRepository.findById(1).get();
		assertEquals(1, p_signup.getP_id());
	}
		
		
	@Test
	public void UpadteP_Signup() {
		P_Signup p = P_signupRepository.findById(1).get();
		p.setP_username("mahendra");
		P_signupRepository.save(p);
		assertNotEquals("raju",P_signupRepository.findById(1).get().getP_username());
		
	}
	
	
	@Autowired
	D_SignupRepository d_signupRepository;

	@Test
	
	public void addD_Signup() {
		D_Signup d_signup = new D_Signup();
		d_signup.setD_id(2);
		d_signup.setD_username("teja");
		d_signup.setD_gender("male");
		d_signup.setD_contact_no(955026122);
       // p_signup.setDob("2020-12-11");
        d_signup. setD_password("teja");
        d_signup. setD_name("teja");
        d_signup. setSpecilisation("brain");
        
        
               
              
                

		
		assertNotNull(d_signupRepository.findById(2).get());
	}
	@Test
	public void AllD_Signup() {		
		List<D_Signup> list = d_signupRepository.findAll();
		assertTrue(list.size()>0);
		}


	@Test
	public void D_Signup() {
		D_Signup d_signup = d_signupRepository.findById(2).get();
		assertEquals(2, d_signup.getD_id());
	}
		
		
	@Test
	public void UpadateD_Signup() {
		D_Signup d = d_signupRepository.findById(2).get();
		d.setD_username("teja");
		d_signupRepository.save(d);
		assertNotEquals("surya",d_signupRepository.findById(2).get().getD_username());
		
	}
	

	
}


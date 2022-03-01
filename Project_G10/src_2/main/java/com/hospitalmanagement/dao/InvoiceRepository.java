

package com.hospitalmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hospitalmanagement.model.Invoice;
import com.hospitalmanagement.model.P_Signup;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
	@Query("SELECT i FROM Invoice i WHERE i.in_id=?1")
	public Invoice validateInvoice(int id);

}

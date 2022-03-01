package com.hospitalmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.model.Invoice;
import com.hospitalmanagement.model.P_Signup;
import com.hospitalmanagement.model.P_invoice;
import com.hospitalmanagement.dao.InvoiceRepository;
import com.hospitalmanagement.dao.P_SignupRepository;

@Service
public class InvoiceServices {
@Autowired
InvoiceRepository InvoiceRepository;
@Autowired
P_SignupRepository p_SignupRepository;
//to save or download
public void save(Invoice invoice) {
	InvoiceRepository.save(invoice);
}
// to view the invoice
public List<Invoice> listAll(){   
	return InvoiceRepository.findAll();
}
public Invoice saveInvoice(Invoice i) {
	// TODO Auto-generated method stub
	return null;
}
public List<Invoice> fetchInvoices() {
	// TODO Auto-generated method stub
	return null;
}
public Invoice getInvoice() {
	return InvoiceRepository.validateInvoice(1);
}
}


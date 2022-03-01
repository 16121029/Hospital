package com.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalmanagement.model.Invoice;
import com.hospitalmanagement.model.P_invoice;
import com.hospitalmanagement.service.InvoiceServices;



@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@RestController
public class InvoiceController {
	
		@Autowired
		public InvoiceServices invoiceService;
		@PostMapping("/invoice")
		public Invoice addInvoice(@RequestBody Invoice i) {

			Invoice invoice = invoiceService.saveInvoice(i);
			
			return invoice;
		}
		@GetMapping("/invoices")
	    public List<Invoice> getInvoices() {
		List<Invoice> invoiceList = invoiceService.fetchInvoices();

		return invoiceList;

	}
		@GetMapping("/invoice")
		public Invoice getInvoice() {
			Invoice in = invoiceService.getInvoice();
			return in;
		}
	
		
}
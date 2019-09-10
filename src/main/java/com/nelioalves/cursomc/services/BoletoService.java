package com.nelioalves.cursomc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.PagamentoComBoleto;
import com.nelioalves.cursomc.repositories.PagamentoRepository;

@Service
public class BoletoService {
	
	@Autowired
	private PagamentoRepository repo;
	
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date instante) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDataVencimento(instante);
		
	}

}

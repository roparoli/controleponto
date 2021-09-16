package com.dio.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.model.BancoHoras;
import com.dio.model.Calendario;
import com.dio.model.JornadaTrabalho;
import com.dio.repository.BancoHorasRepository;

@Service
public class BancoHorasService {

	@Autowired
	BancoHorasRepository repository;
	JornadaTrabalho jornada = new JornadaTrabalho();
	Calendario calendario = new Calendario();

	public BancoHoras saveCategoria(BancoHoras bancoHoras) {
		return repository.save(bancoHoras);
	}

	public List<BancoHoras> findAll() {
		return repository.findAll();
	}

	public Optional<BancoHoras> getById(long idBancoHoras) {
		return repository.findById(idBancoHoras);
	}

	public BancoHoras updateBancoHorasDados(BancoHoras bancoHoras, long idBancoHoras) {
		BancoHoras cat = repository.getOne(idBancoHoras);
		updateBancoHorasDados(cat, bancoHoras);
		return repository.save(cat);

	}

	public void deleteById(long idBancoHoras) {
		repository.deleteById(idBancoHoras);
	}

	private void updateBancoHorasDados(BancoHoras entity, BancoHoras obj) {
		entity.setIdBancoHoras(obj.getIdBancoHoras());
		entity.setIdMovimentacao(obj.getIdMovimentacao());
		entity.setIdUsuario(obj.getIdUsuario());
		entity.setDataTrabalhada(obj.getDataTrabalhada());
		entity.setQuantidadeHoras(obj.getQuantidadeHoras());
		entity.setSaldoHoras(obj.getSaldoHoras());
	}

	private void updateSaldoHoras(BancoHoras entity, BancoHoras obj) {
		LocalDateTime dataEspecial = calendario.getDataEspecial();
		LocalDateTime hoje = LocalDateTime.now();
		if (hoje != dataEspecial) {
			Float horasTrabalhadasDia = entity.getQuantidadeHoras();
			Float horasJornada = jornada.getQuantidadeHorasJornada();
			float saldodiario = horasTrabalhadasDia - horasJornada;

			entity.setSaldoHoras(saldodiario);
		}
	}

	public BancoHoras updateSaldoHoras(BancoHoras bancoHoras, long idBancoHoras) {
		BancoHoras cat = repository.getOne(idBancoHoras);
		updateSaldoHoras(cat, bancoHoras);
		return repository.save(cat);
	}
}

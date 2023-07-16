package br.com.banco.service;

import br.com.banco.domain.Conta;
import br.com.banco.domain.Transferencia;
import br.com.banco.repository.ContaRepository;
import br.com.banco.repository.TransferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransferenciaService {

    @Autowired
    private TransferenciaRepository transferenciaRepository;

    @Autowired
    private ContaRepository contaRepository;

    public List<Transferencia> findAll(Long idConta) {
        return transferenciaRepository.findAllByContaId(idConta);
    }

    public Conta create(Conta conta) {
        return contaRepository.save(conta);
    }

}

package br.com.banco.service;

import br.com.banco.domain.Conta;
import br.com.banco.repository.ContaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ContaService {


    private final ContaRepository contaRepository;


    public Optional<Conta> select(Long idConta) {
        return contaRepository.findById(idConta);
    }


}

package br.com.banco.repository;

import br.com.banco.domain.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia,Long> {

    List<Transferencia> findAllByContaId(Long contaId);
}

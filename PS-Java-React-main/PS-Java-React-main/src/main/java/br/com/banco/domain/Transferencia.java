package br.com.banco.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @Column(name = "id")
    private Long idTransferencia;

    @Column(name = "data_transferencia")
    private LocalDateTime data_transferencia;

    @Column(name = "valor")
    private BigDecimal valor;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String nome_operador_transacao;

    @Column(name = "conta_id")
    private Long contaId;
}

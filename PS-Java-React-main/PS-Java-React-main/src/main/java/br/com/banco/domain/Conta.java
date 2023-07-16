package br.com.banco.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "conta")
public class Conta implements Serializable {

    @Id
    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "nome_responsavel")
    private String nomeResponsavel;

}

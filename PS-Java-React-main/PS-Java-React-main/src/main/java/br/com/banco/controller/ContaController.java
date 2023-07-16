package br.com.banco.controller;

import br.com.banco.domain.Transferencia;
import br.com.banco.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller(value ="/")
public class ContaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @RequestMapping(value = "transferencias/{conta}", method = RequestMethod.GET, produces="application/json")
    public ResponseEntity<List<Transferencia>> findAllTransferencia(@PathVariable(value = "conta") Long idConta) {
        return new ResponseEntity<>(transferenciaService.findAll(idConta), HttpStatus.OK);
    }


}

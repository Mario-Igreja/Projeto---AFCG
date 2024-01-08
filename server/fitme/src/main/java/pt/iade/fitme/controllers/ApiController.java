package pt.iade.fitme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.iade.fitme.Service.ApiService;
import pt.iade.fitme.models.Dado;

import java.util.List;

@RestController
    @RequestMapping("/api")
    public class ApiController {
        @Autowired
        private ApiService apiService;

        @GetMapping("/dados")
        public ResponseEntity<List<Dado>> obterDados() {
            List<Dado> dados = apiService.obterDados();
            return new ResponseEntity<>(dados, HttpStatus.OK);
        }
    }






package com.example.demo; // Ajusta a tu paquete

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

    // Requisito: GET / -> Mensaje de texto [cite: 31, 32]
    @GetMapping("/")
    public String home() {
        return "Fin de la práctica - Carlos Cano";
    }

    // Requisito: GET /api/estado -> JSON con info básica [cite: 33, 34]
    @GetMapping("/api/estado")
    public Map<String, String> estado() {
        Map<String, String> respuesta = new HashMap<>();
        respuesta.put("estado", "OK");
        respuesta.put("servicio", "API REST Estudiantes");
        respuesta.put("mensaje", "Funciona correctamente en la nube");
        return respuesta;
    }
}
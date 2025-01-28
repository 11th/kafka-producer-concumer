package ru.eleventh.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.eleventh.kafka.service.ProducerService;

@RestController
@RequestMapping("/api/v1/producer")
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/simple-topic")
    public ResponseEntity<String> postSimpleTopic(@RequestParam(name = "message") String msg) {
        producerService.sendMessage(msg);
        return ResponseEntity.ok().build();
    }
}

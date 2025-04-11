package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return """
                        <h1>Hello World!</h1>
                        <h2>🚀 Rotas disponíveis:</h2>
                        <ul>
                            <li><a href="/list-bsm">Lista de BSM’s da Generation Brasil</a></li>
                            <li><a href="/objectives">Objetivos dessa semana</a></li>
                        </ul>
                        <footer>🐱‍💻 Desenvolvido por Weslley</footer>
                """;
    }

    @GetMapping("/list-bsm")
    public String listBSM() {
        return """
                <h1>🧠 Lista de BSM’s da Generation Brasil</h1>
                <ul>
                    <li>Orientação ao Futuro</li>
                    <li>Responsabilidade Pessoal</li>
                    <li>Trabalho em Equipe</li>
                    <li>Comunicação</li>
                    <li>Persistência</li>
                    <li>Autoconfiança</li>
                    <li>Proatividade</li>
                    <li>Atenção aos Detalhes</li>
                </ul>
                """;
    }

    @GetMapping("/objectives")
    public String greeting() {
        return """
                <h1>🎯 Objetivos dessa semana</h1>
                <ul>
                    <li>Aprender como executar query mais complexas no MySQL</li>
                    <li>Conhecer mais o spring e como ele funciona</li>
                    <li>Aprender a criar uma aplicação Spring Boot</li>
                    <li>Aprender a criar uma API REST com Spring Boot</li>
                </ul>
                """;
    }
}

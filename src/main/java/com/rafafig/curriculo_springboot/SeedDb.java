package com.rafafig.curriculo_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class SeedDb {
    @Autowired
    JdbcTemplate template;

    @Autowired
    public SeedDb(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update("insert into Profiles (name, last_name, title, about, number, location, email, github, linkedin) values (?, ?, ?, ?, ?, ?, ?, ?, ?)", new Object[]{"Rafael", "Figueirôa", "Desenvolvedor | JavaScript | Java | Estudante de Sistemas para Internet", "Estudante de Sistemas para Internet pelo programa Embarque Digital, técnico em Programação de Jogos Digitais", "81992682273", "Recife, Pernambuco", "rafatinsfig@gmail.com", "https://github.com/rafafigueiroa", "https://linkdin.com/in/rafael-figueiroa"});

        jdbcTemplate.update("insert into Experiences (position, company, employment_type, location, modality, start_date) values (?, ?, ?, ?, ?, ?)", new Object[]{"Desenvolvedor de software", "Combogó UNICAP", "Aprendiz", "Recife, Pernambuco", "Presencial", "Março/2024"});
        jdbcTemplate.update("insert into Experiences (position, company, employment_type, location, modality, start_date) values (?, ?, ?, ?, ?, ?)", new Object[]{"Residente de engenharia de software", "Porto Digital", "Aprendiz", "Recife, Pernambuco", "Hibrido", "Agosto/2022"});

        jdbcTemplate.update("insert into Educations (school, degree, course, start_date, end_date) values (?, ?, ?, ?, ?)", new Object[]{"ETE Cícero Dias", "Ensino médio e técnico", "Programação de Jogos Digitais", "Janeiro/2019", "Dezembro/2021"});
        jdbcTemplate.update("insert into Educations (school, degree, course, start_date) values (?, ?, ?, ?)", new Object[]{"UNICAP", "Tecnólogo", "Sistemas para Internet", "Agosto/2022"});

        jdbcTemplate.update("insert into Certifications (name, issuing_organization, issue_date) values (?, ?, ?)", new Object[]{"Desafio Globo 2.0 Rec'n'Play", "Globo", "Outubro/2023"});
        jdbcTemplate.update("insert into Certifications (name, issuing_organization, issue_date) values (?, ?, ?)", new Object[]{"JavaScript e HTML: desenvolva um jogo e pratique lógica de programação", "Alura", "Abril/2023"});
    }
}

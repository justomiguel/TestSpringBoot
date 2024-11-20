package com.globant.talentodigital.demoweb.repositorio;

import com.globant.talentodigital.demoweb.entidades.Saludo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaludoRepository extends JpaRepository<Saludo, Long> {

}
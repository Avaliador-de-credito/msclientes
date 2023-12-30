package io.github.karinaerikads.msclientes.infra.repository;

import io.github.karinaerikads.msclientes.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

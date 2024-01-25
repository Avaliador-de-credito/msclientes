package io.github.karinaerikads.msclientes.domain.application;

import io.github.karinaerikads.msclientes.domain.Cliente;
import io.github.karinaerikads.msclientes.infra.repository.ClienteRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    public Cliente save(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Optional<Cliente> getByCpf(String cpf){
        return clienteRepository.findByCpf(cpf);
    }

}

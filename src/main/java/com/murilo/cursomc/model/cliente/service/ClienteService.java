package com.murilo.cursomc.model.cliente.service;

import com.murilo.cursomc.model.categoria.dto.CategoriaDTO;
import com.murilo.cursomc.model.categoria.entity.Categoria;
import com.murilo.cursomc.model.categoria.exceptions.DataIntegretyException;
import com.murilo.cursomc.model.categoria.exceptions.ObjectNotFoundException;
import com.murilo.cursomc.model.cidade.entity.Cidade;
import com.murilo.cursomc.model.cidade.repository.CidadeRepository;
import com.murilo.cursomc.model.cliente.dto.ClienteDTO;
import com.murilo.cursomc.model.cliente.dto.ClienteNewDTO;
import com.murilo.cursomc.model.cliente.entity.Cliente;
import com.murilo.cursomc.model.cliente.enums.TipoCliente;
import com.murilo.cursomc.model.cliente.repository.ClienteRepository;
import com.murilo.cursomc.model.endereco.entity.Endereco;
import com.murilo.cursomc.model.endereco.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cliente find(Integer id) {
        Optional<Cliente> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

    public Cliente insert(Cliente obj) {
        try {
            obj.setId(null);
            repository.save(obj);
            enderecoRepository.saveAll(obj.getEnderecos());
            return obj;
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegretyException("Email já existe");
        }

    }

    public Cliente update(Cliente obj) {
        try {
            Cliente cliente = find(obj.getId());
            updateData(obj, cliente);
            return repository.save(obj);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegretyException("Não foi possivel atualizar cliente");
        }
    }

    public void delete(Integer id) {
        find(id);
        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataIntegretyException("Não foi possivel deletar a Cliente");
        }

    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Page<Cliente> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        return repository.findAll(pageRequest);
    }

    public Cliente fromDTO(ClienteDTO objDTO) {
        return new Cliente(objDTO.getId(), objDTO.getNome(), objDTO.getEmail(), null, null);
    }

    public Cliente fromDTO(ClienteNewDTO objDTO) {
        Cliente cli = new Cliente(null, objDTO.getNome(), objDTO.getEmail(), objDTO.getCpfOuCnpj(), TipoCliente.toEnum(objDTO.getTipo()));
        Cidade cid = cidadeRepository.getOne(objDTO.getCidadeId());
        Endereco end = new Endereco(null, objDTO.getLogradouro(),
                objDTO.getNumero(),
                objDTO.getComplemento(),
                objDTO.getBairro(),
                objDTO.getCep(),
                cli,
                cid);
        cli.getEnderecos().add(end);
        cli.getTelefones().add(objDTO.getTelefone1());
        if (objDTO.getTelefone2() != null) {
            cli.getTelefones().add(objDTO.getTelefone2());
        }
        if (objDTO.getTelefone2() != null) {
            cli.getTelefones().add(objDTO.getTelefone3());
        }
        return cli;
    }

    private void updateData(Cliente obj, Cliente entity) {
        obj.setCpfOuCnpj(entity.getCpfOuCnpj());
        obj.setTipo(entity.getTipo());
    }


}

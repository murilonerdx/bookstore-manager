package com.murilo.cursomc.controller;

import com.murilo.cursomc.model.categoria.dto.CategoriaDTO;
import com.murilo.cursomc.model.categoria.entity.Categoria;
import com.murilo.cursomc.model.cliente.dto.ClienteDTO;
import com.murilo.cursomc.model.cliente.dto.ClienteNewDTO;
import com.murilo.cursomc.model.cliente.entity.Cliente;
import com.murilo.cursomc.model.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Integer id) {
        Cliente obj = service.find(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody ClienteNewDTO objDTO) {
        Cliente obj = service.fromDTO(objDTO);
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Cliente> update(@PathVariable Integer id, @RequestBody Cliente obj) {
        obj.setId(id);
        service.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<ClienteDTO>> findAll() {
        List<Cliente> listaCategoria = service.findAll();
        List<ClienteDTO> listaDTO = listaCategoria.stream().map(ClienteDTO::new).collect(Collectors.toList());
        return ResponseEntity.ok().body(listaDTO);
    }
//
//
//    @RequestMapping(value="page", method=RequestMethod.GET)
//    public ResponseEntity<Page<ClienteDTO>> findAllPage(@RequestParam(value="page", defaultValue="0") Integer page,
//                                                          @RequestParam(value="linesPerPage", defaultValue="24") Integer linesPerPage,
//                                                          @RequestParam(value="orderBy", defaultValue="nome") String orderBy,
//                                                          @RequestParam(value="direction", defaultValue="ASC") String direction){
//        Page<Cliente> list = service.findPage(page,linesPerPage,orderBy,direction);
//        Page<ClienteDTO> listaDTO = list.map(ClienteDTO::new);
//        return ResponseEntity.ok().body(listaDTO);
//    }

}


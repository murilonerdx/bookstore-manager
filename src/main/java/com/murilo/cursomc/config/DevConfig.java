package com.murilo.cursomc.config;

import com.murilo.cursomc.model.categoria.entity.Categoria;
import com.murilo.cursomc.model.categoria.repository.CategoriaRepository;
import com.murilo.cursomc.model.cidade.entity.Cidade;
import com.murilo.cursomc.model.cidade.repository.CidadeRepository;
import com.murilo.cursomc.model.cliente.entity.Cliente;
import com.murilo.cursomc.model.cliente.enums.TipoCliente;
import com.murilo.cursomc.model.cliente.repository.ClienteRepository;
import com.murilo.cursomc.model.endereco.entity.Endereco;
import com.murilo.cursomc.model.endereco.repository.EnderecoRepository;
import com.murilo.cursomc.model.estado.entity.Estado;
import com.murilo.cursomc.model.estado.repository.EstadoRepository;
import com.murilo.cursomc.model.itemPedido.entity.ItemPedido;
import com.murilo.cursomc.model.itemPedido.repository.ItemPedidoRepository;
import com.murilo.cursomc.model.pagamento.entity.Pagamento;
import com.murilo.cursomc.model.pagamento.entity.PagamentoComBoleto;
import com.murilo.cursomc.model.pagamento.entity.PagamentoComCartao;
import com.murilo.cursomc.model.pagamento.enums.EstadoPagamento;
import com.murilo.cursomc.model.pagamento.repository.PagamentoRepository;
import com.murilo.cursomc.model.pedido.entity.Pedido;
import com.murilo.cursomc.model.pedido.repository.PedidoRepository;
import com.murilo.cursomc.model.produto.entity.Produto;
import com.murilo.cursomc.model.produto.repository.ProdutoRepository;
import com.murilo.cursomc.utils.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DbService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean instantiateDatabase() throws ParseException {

        if (!"create".equals(strategy)) {
            return false;
        }

        dbService.instantiateTestDatabase();
        return true;
    }


}
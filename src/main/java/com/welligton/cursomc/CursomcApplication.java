package com.welligton.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.welligton.cursomc.domain.Categoria;
import com.welligton.cursomc.domain.Cidade;
import com.welligton.cursomc.domain.Cliente;
import com.welligton.cursomc.domain.Endereco;
import com.welligton.cursomc.domain.Estado;
import com.welligton.cursomc.domain.ItemPedido;
import com.welligton.cursomc.domain.Pagamento;
import com.welligton.cursomc.domain.PagamentoComBoleto;
import com.welligton.cursomc.domain.PagamentoComCartao;
import com.welligton.cursomc.domain.Pedido;
import com.welligton.cursomc.domain.Produto;
import com.welligton.cursomc.domain.enums.EstadoPagamento;
import com.welligton.cursomc.domain.enums.TipoCliente;
import com.welligton.cursomc.repositories.CategoriaRepository;
import com.welligton.cursomc.repositories.CidadeRepository;
import com.welligton.cursomc.repositories.ClienteRepository;
import com.welligton.cursomc.repositories.EnderecoRepository;
import com.welligton.cursomc.repositories.EstadoRepository;
import com.welligton.cursomc.repositories.ItemPedidoRepository;
import com.welligton.cursomc.repositories.PagamentoRepository;
import com.welligton.cursomc.repositories.PedidoRepository;
import com.welligton.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
			}

}

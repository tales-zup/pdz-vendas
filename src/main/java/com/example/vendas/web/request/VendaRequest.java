package com.example.vendas.web.request;

import java.math.BigDecimal;
import java.util.List;

public class VendaRequest {

    private BigDecimal valor;

    private String idLoja;

    private List<String> produtos;

    private String endereco;

    private String idCliente;

    private String idVenda;

    public VendaRequest() {
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getIdLoja() {
        return idLoja;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getIdVenda() {
        return idVenda;
    }

    @Override
    public String toString() {
        return "VendaRequest{" +
                "valor=" + valor +
                ", idLoja='" + idLoja + '\'' +
                ", produtos=" + produtos +
                ", endereco='" + endereco + '\'' +
                ", idCliente='" + idCliente + '\'' +
                ", idVenda='" + idVenda + '\'' +
                '}';
    }
}

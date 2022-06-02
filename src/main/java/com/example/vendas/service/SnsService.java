package com.example.vendas.service;

import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sns.model.Topic;
import com.example.vendas.web.request.VendaRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SnsService {

    private AmazonSNS snsClient;
    private Topic vendasTopico;
    private ObjectMapper mapper = new ObjectMapper();

    public SnsService(AmazonSNS snsClient,
                            @Qualifier("vendasTopico")Topic vendasTopico) {
        this.snsClient = snsClient;
        this.vendasTopico = vendasTopico;
    }

    public void publishProductEvent(VendaRequest vendaRequest) {
        try {
            String message = mapper.writeValueAsString(vendaRequest);
            PublishResult publishResult = snsClient.publish(
                    vendasTopico.getTopicArn(),
                    message);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao processar venda");
        }

    }
}

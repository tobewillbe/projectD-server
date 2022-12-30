package com.example.server.payment.service;

import com.example.server.payment.dto.PaymentOutDTO;
import com.example.server.payment.entity.Payment;
import com.example.server.payment.repository.PaymentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;

    public boolean createServ (Payment payment){
        if(payment == null){
            log.warn("new show cannot be null!");
        }
        boolean flag = repository.create(payment);
        if(flag) log.info("새로운 payment id:{} 이 저장되었습니다.", payment);
        return flag;
    }

    public List<Payment> listAllServ() {return new ArrayList<>(repository.listAll());}

    public List<PaymentOutDTO> listDTOServ() {return new ArrayList<>(repository.listDTO());}

    public boolean modifyServ(Payment payment){
        boolean flag = repository.update(payment);
        if(flag) log.info("payment id:{} 이 저장되었습니다.", payment);
        return flag;
    }

    public boolean deleteServ(String paymentId){
        boolean flag = repository.delete(paymentId);
        if(flag) log.info("payment id:{} 이 가 삭제되었습니다.", paymentId);
        return flag;
    }
}

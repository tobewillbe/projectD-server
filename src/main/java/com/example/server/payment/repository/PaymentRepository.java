package com.example.server.payment.repository;

import com.example.server.payment.dto.PaymentOutDTO;
import com.example.server.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentRepository {

    boolean create(Payment payment);
    List<Payment> listAll();
    List<PaymentOutDTO> listDTO();
    boolean update(Payment payment);
    boolean delete(String payId);
}

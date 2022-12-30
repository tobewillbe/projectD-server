package com.example.server.payment.api;

import com.example.server.payment.entity.Payment;
import com.example.server.payment.service.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/payment")
@RequiredArgsConstructor
@CrossOrigin
public class PaymentApiController {
    private final PaymentService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Payment newPayment){

        log.info("api/payment PostRequest -{}", newPayment );
        try{
            boolean flag = service.createServ(newPayment);
            return ResponseEntity.ok().body(flag);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> listAll(){
        log.info("api/payment GetRequest!");
        return ResponseEntity.ok().body(service.listAllServ());
    }

    @GetMapping("/nm")
    public ResponseEntity<?> listDTO(){
        log.info("api/payment/nm GetRequest!");
        return ResponseEntity.ok().body(service.listDTOServ());
    }

    @PutMapping
    public ResponseEntity<?> update(Payment newPayment){

        log.info("api/payment PutRequest -{}", newPayment );
        try{
            boolean flag = service.modifyServ(newPayment);
            return ResponseEntity.ok().body(flag);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping
    public ResponseEntity<?> delete(String paymentId){
        log.info("api/payment DeleteRequest -{}", paymentId );
        try{
            boolean flag = service.deleteServ(paymentId);
            return ResponseEntity.ok().body(flag);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}

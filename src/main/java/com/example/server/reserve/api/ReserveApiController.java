package com.example.server.reserve.api;

import com.example.server.reserve.entity.Reserve;
import com.example.server.reserve.service.ReserveService;
import com.example.server.show.entity.Show;
import com.example.server.show.service.ShowService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/reserve")
@RequiredArgsConstructor
@CrossOrigin
public class ReserveApiController {
    private final ReserveService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Reserve newReserve){

        log.info("api/reserve PostRequest -{}", newReserve );
        try{
            boolean flag = service.createServ(newReserve);
            return ResponseEntity.ok().body(flag);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<?> listAll(){
        log.info("api/reserve GetRequest!");
        return ResponseEntity.ok().body(service.showListServ());
    }

    @GetMapping("/nm")
    public ResponseEntity<?> listShowOutDto(){
        log.info("api/reserve/nm GetRequest!");
        return ResponseEntity.ok().body(service.showOutDtoListServ());
    }
}

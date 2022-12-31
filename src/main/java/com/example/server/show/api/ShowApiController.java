package com.example.server.show.api;

import com.example.server.show.entity.Show;
import com.example.server.show.service.ShowService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/api/show")
@RequiredArgsConstructor
@CrossOrigin
public class ShowApiController {

    private final ShowService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Show newShow){

        try{
            boolean flag = service.createServ(newShow);
            return ResponseEntity.ok().body(flag);
        }catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }


    @GetMapping("/{date}")
    public ResponseEntity<?> listShowOutDto(@PathVariable String date){
        log.info("api/show GetRequest!");
        return ResponseEntity.ok().body(service.showOutDtoListServ(date));
    }

    @GetMapping("/nm/{date}")
    public ResponseEntity<?> listAll(@PathVariable String date){
        log.info("api/show/nm GetRequest!");
        return ResponseEntity.ok().body(service.showListServ(date));
    }
}

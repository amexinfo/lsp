package com.danmaicrosevice.ProductService.conteroller;

import com.danmaicrosevice.ProductService.model.PrudactRequst;
import com.danmaicrosevice.ProductService.service.ProudactServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
    ProudactServiceImp proudactServiceImp;
    @PostMapping
    public ResponseEntity<PrudactRequst>addProduct(@RequestBody PrudactRequst PrudactRequst){
        PrudactRequst savePrudactRequst=proudactServiceImp.addProduct(PrudactRequst);
        return  new ResponseEntity<>(savePrudactRequst, HttpStatus.CREATED);


    }
    @GetMapping("/{id}")
    public ResponseEntity<PrudactRequst>getbyID(@PathVariable("id") Long id){
        PrudactRequst resultPrudactRequst=proudactServiceImp.getByd(id);
        return new ResponseEntity<>(resultPrudactRequst,HttpStatus.OK);
    }


}

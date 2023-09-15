package com.danmaicrosevice.ProductService.service;

import com.danmaicrosevice.ProductService.entity.Product;
import com.danmaicrosevice.ProductService.exception.ProudactClassCusstimException;
import com.danmaicrosevice.ProductService.model.PrudactRequst;
import com.danmaicrosevice.ProductService.repositery.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class ProudactServiceImp implements ProucactService{
    @Autowired
    ProductRepository productRepository;
    @Override
    public PrudactRequst addProduct(PrudactRequst prudactRequst) {
        log.info("adding proudact");
        Product product=Product.builder().name(prudactRequst.getName()).
                quantity(prudactRequst.getPrice())
                .price(prudactRequst.getPrice()).build();

        Product SAVEProduct=productRepository.save(product);
        PrudactRequst savePrudactRequst=new PrudactRequst();
        savePrudactRequst.setName(SAVEProduct.getName());
        savePrudactRequst.setPrice(SAVEProduct.getPrice());
        savePrudactRequst.setQuantity(SAVEProduct.getQuantity());
        return  savePrudactRequst;
    }

    @Override
    public PrudactRequst getByd(long id)throws ProudactClassCusstimException {
        Product product=productRepository.getReferenceById(id);
        PrudactRequst prudactRequst=new PrudactRequst();
        prudactRequst.setName(product.getName());
        prudactRequst.setQuantity(product.getQuantity());
        prudactRequst.setPrice(product.getPrice());
        return prudactRequst;
    }
}

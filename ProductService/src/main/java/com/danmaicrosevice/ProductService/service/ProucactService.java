package com.danmaicrosevice.ProductService.service;

import com.danmaicrosevice.ProductService.model.PrudactRequst;

public interface ProucactService {
    public PrudactRequst addProduct(PrudactRequst prudactRequst);
    public PrudactRequst getByd(long id);
}

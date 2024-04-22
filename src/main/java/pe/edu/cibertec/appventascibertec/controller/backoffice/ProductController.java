package pe.edu.cibertec.appventascibertec.controller.backoffice;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.appventascibertec.model.bd.Product;
import pe.edu.cibertec.appventascibertec.service.IProductService;

import java.util.List;

@Controller
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {
    private IProductService iProductService;

    @GetMapping("")
    public String formProduct(Model model){
        model.addAttribute("listproduct", iProductService.listProducts());
        return ("backoffice/product/formproduct");
    }
    public List<Product> listProducts(){
        return iProductService.listProducts();
    }
    public void registerProduct(){

    }
}

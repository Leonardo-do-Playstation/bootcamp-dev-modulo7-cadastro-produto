package com.abutua.product_backend.controller;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.abutua.product_backend.models.Product;



@RestController
public class ProductController {
   
    // O que definira a ordem dos atributos do objeto no array é a sequencia que sao inseridos na inicialização do objeto, e devem ser inseridos na seguinte ordem (Int, string, boolean e Double)

private List<Product> products = Arrays.asList(
    new Product(1, "Produto 1", "Produto 1", 1, true, false, 100.50),
    new Product(2, "Produto 2", "Produto 2", 2, false, false, 220.50),
    new Product(3, "Produto 3", "Produto 3", 3, false, true, 300.50)
);


    @GetMapping("products/{id}")
     public ResponseEntity getProduct(@PathVariable int id){ //Metodo declarado para receber um produto]

        Product prod = products.stream()
                               .filter(p -> p.getId() == id).findFirst()
                               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Produto não encontrado"));

        return ResponseEntity.ok(prod); // Retorna o produto do array prod.
     }
    @GetMapping("products")
        public List<Product> getProducts(){
            return products;
        }
}

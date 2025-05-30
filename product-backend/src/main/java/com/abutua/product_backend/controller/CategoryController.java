package com.abutua.product_backend.controller;
import java.util.Arrays;
import java.util.List;
import com.abutua.product_backend.models.Category;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;


@RestController // Marca uma classe e define que ela pode responder requisições HTTP.
public class CategoryController {
    private List<Category> categories = Arrays.asList(new Category(1, "Pessoal"),
                                                    new Category(2, "Exportação"),
                                                     new Category(3, "Limpeza"));
  @GetMapping("Categories/{id}") // Metodo para devolver categorias pelo id
     public ResponseEntity getCategory(@PathVariable int id){ //Metodo declarado para receber um produto]

        Category catg = categories.stream()
                               .filter(c -> c.getId() == id).findFirst()
                               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Categoria não encontrada"));

        return ResponseEntity.ok(catg); // Retorna o produto do array prod.
     }
    @GetMapping("Categories") // Metodo para devolver todas as categorias
        public List<Category> getCategories(){
            return categories;
        }


}

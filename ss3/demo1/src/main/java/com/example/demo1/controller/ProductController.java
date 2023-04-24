package com.example.demo1.controller;

import com.example.demo1.model.Product;
import com.example.demo1.service.IProductService;
import com.example.demo1.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProductController {
    public final IProductService productService = new ProductService();
@GetMapping("/product")
public String list(Model model){
    List<Product>productList=productService.findAll();
    model.addAttribute("products",productList);
    return "/list";
}
    @GetMapping("/product/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }
    @PostMapping("/product/save")
    public String save(Product product) {
        productService.save(product);
        return "redirect:/product";
    }
    @GetMapping("/product/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }
    @PostMapping("/product/update")
    public String update(Product product) {
        productService.update(product.getId(), product);
        return "redirect:/product";
    }
    @GetMapping("/product/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/delete";
    }
    @PostMapping("/product/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        productService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/product";
    }
    @GetMapping("/product/{id}/detail")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/detail";
    }

}

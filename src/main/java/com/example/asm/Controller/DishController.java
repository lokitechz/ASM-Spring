package com.example.asm.Controller;

import com.example.asm.Entity.Dish;
import com.example.asm.Repository.DishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DishController {

    private DishRepository dishRepository;

    @Autowired
    public void setProductRepository(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @RequestMapping(path = "/")
    public String index() {
        return "index";
    }

    //    Trả về trang danh sách món ăn
    @RequestMapping(path = "/dishes", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("dishes", dishRepository.findAllByFlgstatus(0));
        return "products";
    }

    //    Trả về trang thêm mới món ăn
    @RequestMapping(path = "/dish/add", method = RequestMethod.GET)
    public String createDish(Model model) {
        model.addAttribute("dish", new Dish());
        return "edit";
    }

    //    Lưu thông tin 1 món ăn và trả về trang danh sách
    @RequestMapping(path = "/dish/add", method = RequestMethod.POST)
    public String saveDish(Dish dish) {
        dish.setStartDate(System.currentTimeMillis());
        dish.setUpdateDate(System.currentTimeMillis());
        dishRepository.save(dish);
        return "redirect:/dishes";
    }

    //    Lấy về thông tin của 1 món ăn để chỉnh sửa
    @RequestMapping(path = "/dish/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable(name = "id") String id) {
        model.addAttribute("dish", dishRepository.findById(id));
        return "edit";
    }


    //    Xoá 1 món ăn và trả về trang danh sách
    @RequestMapping(path = "/dish/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable(name = "id") String id) {
        dishRepository.deleteById(id);
        return "redirect:/dishes";
    }
}

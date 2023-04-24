package com.example.demo.controller;

import com.example.demo.model.Song;
import com.example.demo.service.SongService;
import com.example.demo.service.SongServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class SongController {
  private  SongService service = new SongServiceImp();

    @GetMapping("/song")
    public String list(Model model) {
        List<Song> songList = service.findAll();
        model.addAttribute("songs", songList);
        return "/list";
    }
    @GetMapping("/song/create")
    public String create(Model model) {
        model.addAttribute("songs", new Song());
        return "/create";
    }
    @PostMapping("/song/save")
    public String save(Song song) {
        service.save(song);
        return "redirect:/song";
    }
    @GetMapping("/song/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("song", service.findById(id));
        return "/edit";
    }
    @PostMapping("/song/update")
    public String update(Song song) {
        service.update(song.getId(), song);
        return "redirect:/song";
    }
    @GetMapping("/song/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("song", service.findById(id));
        return "/delete";
    }
    @PostMapping("/product/delete")
    public String delete(Song song, RedirectAttributes redirect) {
        service.remove(song.getId());
        redirect.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/song";
    }
    @GetMapping("/product/{id}/detail")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("song", service.findById(id));
        return "/detail";
    }
}

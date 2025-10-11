package com.example.bookrental.service;

import com.example.bookrental.entity.Sach;
import com.example.bookrental.repository.SachRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SachService {
    private final SachRepository sachRepository;

    public SachService(SachRepository sachRepository) {
        this.sachRepository = sachRepository;
    }

    public List<Sach> getAll() {
        return sachRepository.findAll();
    }

    public Sach save(Sach sach) {
        return sachRepository.save(sach);
    }

    public void delete(Long id) {
        sachRepository.deleteById(id);
    }
}

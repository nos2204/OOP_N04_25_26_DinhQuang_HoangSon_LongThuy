package com.example.bookrental.repository;

import com.example.bookrental.entity.*;
import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;

public interface HoaDonRepository extends JpaRepository<Sach, Long> {

    List<Sach> findAll();

    Sach save(Sach sach);

    void deleteById(Long id);}
/*public interface KhachHangRepository extends JpaRepository<KhachHang, Long> {}
public interface HoaDonRepository extends JpaRepository<HoaDon, Long> {}*/
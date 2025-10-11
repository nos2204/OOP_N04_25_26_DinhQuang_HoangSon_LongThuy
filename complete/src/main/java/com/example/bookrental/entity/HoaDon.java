package com.example.bookrental.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate ngayThue;
    private LocalDate ngayTra;
    private double tongTien;

    @ManyToOne
    private KhachHang khachHang;

    @ManyToOne
    private Sach sach;
}

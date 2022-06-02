package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import com.example.demo.entity.enumerate.AnnoyanceTypeEnum;

@Data
@Entity
@Table(name = "`annoyance`")
public class Annoyance {
    @Id
    @Column(name = "`id`", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "`account`", nullable = false)
    private String account;

    @Column(name = "`contant`", nullable = false)
    private String context;

    @Column(name = "`type`", nullable = false)
    private AnnoyanceTypeEnum type;

    @Column(name = "`dall_id`")
    private int dallId;

    @Column(name = "`mood`", nullable = false)
    private String mood;

    @Column(name = "`index`")
    private int index;

    @Column(name = "`time`")
    private LocalDateTime time;

    @Column(name = "`solve`")
    private int solve;

    @Column(name = "`share`")
    private int share;
}

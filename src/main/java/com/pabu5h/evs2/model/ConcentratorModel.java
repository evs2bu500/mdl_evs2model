package com.pabu5h.evs2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "concentrator")
public class ConcentratorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String ip;
    @Column
    private String address;
    @Column
    private Integer upload_interval;
    @Column
    private Integer polling_interval;
    @Column
    private Integer active_status;
    @Column
    private LocalDateTime created_timestamp;
    @Column
    private Integer daily_polling;
    @Column
    private String comm_server_ip;

    public void nullAll(){
        this.id = null;
        this.ip = null;
        this.address = null;
        this.upload_interval = null;
        this.polling_interval = null;
        this.active_status = null;
        this.created_timestamp = null;
        this.daily_polling = null;
        this.comm_server_ip = null;
    }
}

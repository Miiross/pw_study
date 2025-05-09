package br.com.etechas.study.entity;

import br.com.etechas.study.entity.Enum.DiaDaSemanaEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_DISPONIBILIDADE")
public class Disponibilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DISPONIBILIDADE")
    private long id;

    @Column(name = "TX_DAS")
    private LocalDateTime dt_dias;

    @Column(name = "DT_ATE")
    private LocalDateTime dtAte;

    @Column(name = "TX_DIA_SEMANA")
    @Enumerated(EnumType.STRING)
    private DiaDaSemanaEnum diaSemana;
}

create database pw_study;
use pw_study;
create table tbl_disciplina(
   id_disciplina bigint primary key identity,
   tx_nome varchar(60) not null
);
select * from tbl_disciplina;

CREATE TABLE TBL_MONITOR(
	ID_MONITOR BIGINT PRIMARY KEY IDENTITY,
	TX_NOME VARCHAR(60) NOT NULL,
	TX_FOTO VARCHAR(255) NOT NULL,
	TX_WHATSAPP VARCHAR(11) NOT NULL,
	TX_EMAIL VARCHAR(40) NOT NULL,
	TX_CONTEUDO VARCHAR(1000) NOT NULL,
	--ID_DISCIPLINA BIGINT NOT NULL
	--FOREIGN KEY (ID_DISCIPLINA) REFERENCES TBL_DISCIPLINA (ID_DISCIPLINA)
);

Create table Alunos(
	codAlunos int auto_increment primary key,
	nome varchar(30),
	cpf varchar(12),
	dataNascimento Date,
	bairro varchar(30),
	rua varchar(50),
	numeroCasa int,
	categoria varchar (10),
	TelResidencial int,
	Celular int,
	Celular1 int
);

 create table instrutores(
	codInstrutor int auto_increment primary key,
	nomeInstrutor varchar(30),
	dataNascimento date,
	cpf varchar(12),
	bairro varchar(30),
	rua varchar(50),
	numeroCasa int,
    TelResidencial int,
	Celular int,
	Celular1 int
);

create table veiculos(
	placa varchar(7) primary key,
	cor varchar(15),
    TipoDeCombustivel varchar(10),
	Modelo varchar(20),
	ano int
);

create table Exame(
	codExame int auto_increment primary key,
	codAlunos int,
	placa varchar (7),
	categoria varchar (10),
	dataExame date,
	hora time,
	realizado int (1),
	foreign key(codAlunos) references Alunos(codAlunos),
	foreign key(placa) references veiculos(placa)
);

Create table aulas(
	codAula int auto_increment primary key,
	Categoria varchar(10),
	dataAula date,
	codAlunos int,
	codInstrutor int,
	placa varchar(7),
	hora time,
	realizada int (1),
	foreign key(codAlunos) references Alunos(codAlunos),
	foreign key(codInstrutor) references instrutores(codInstrutor),
	foreign key(placa) references veiculos(placa)
);

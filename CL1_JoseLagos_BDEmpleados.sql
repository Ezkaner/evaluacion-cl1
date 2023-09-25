CREATE DATABASE CL1_JoseLagos_BDEmpleados;

USE CL1_JoseLagos_BDEmpleados;

CREATE TABLE empleado (
    IdEmpleado INT PRIMARY KEY,
    Apellidos VARCHAR(255) NOT NULL,
    Nombres VARCHAR(255) NOT NULL,
    Edad INT CHECK (Edad >= 18),
    Sexo CHAR(1) CHECK (Sexo IN ('M', 'F')),
    Salario DECIMAL(8, 2) CHECK (Salario BETWEEN 1500 AND 2500)
);



INSERT INTO empleado (IdEmpleado, Apellidos, Nombres, Edad, Sexo, Salario)
VALUES
    ('1', 'TORRES', 'JOSE', 22, 'M', 1500),
    ('2', 'GARCIA', 'MARIA', 21, 'F', 1750),
    ('3', 'FLORES', 'JUAN', 22, 'M', 1850),
    ('4', 'CASAS', 'ANA', 23, 'F', 2000);
    
    select * from empleados;
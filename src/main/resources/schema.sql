CREATE TABLE IF NOT EXISTS products
(
    name        VARCHAR(255)   NOT NULL,
    price       NUMERIC(10, 2) NOT NULL,
    description VARCHAR(255),
    PRIMARY KEY (name, price)
);

CREATE TABLE Student (
    name VARCHAR(255),    -- Composite primary key field 1
    age INT,              -- Composite primary key field 2
    address VARCHAR(255), -- Composite primary key field 3
    school VARCHAR(255),  -- Non-key field
    PRIMARY KEY (name, age, address)  -- Composite primary key
);
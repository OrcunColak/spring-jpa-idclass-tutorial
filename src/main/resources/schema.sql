CREATE TABLE IF NOT EXISTS products
(
    name        VARCHAR(255)   NOT NULL,
    price       NUMERIC(10, 2) NOT NULL,
    description VARCHAR(255),
    PRIMARY KEY (name, price)
);
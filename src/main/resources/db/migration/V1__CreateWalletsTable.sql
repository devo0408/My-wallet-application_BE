CREATE TABLE wallets (
    id serial PRIMARY KEY,
    external_uuid VARCHAR(45) UNIQUE NOT NULL,
    currency VARCHAR(45) NOT NULL,
    count DECIMAL(12,2) NOT NULL
);
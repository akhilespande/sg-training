
CREATE TABLE dev.account (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    accountNumber VARCHAR(255) NOT NULL,
    balance DOUBLE NOT NULL
);

CREATE TABLE dev.transaction (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    transactionType VARCHAR(50) NOT NULL,
    amount DOUBLE NOT NULL,
    transactionDate DATETIME NOT NULL,
    accountid BIGINT,
    CONSTRAINT FK_Account_transaction FOREIGN KEY (accountid) REFERENCES account (id)
);
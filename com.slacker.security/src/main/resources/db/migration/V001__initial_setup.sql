CREATE TABLE Users (
    id INT IDENTITY(0, 1) NOT NULL,
    user_name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    is_active BIT,
    is_verified BIT
);

CREATE TABLE UserCommunications (
    id INT IDENTITY(0, 1) NOT NULL,
    user_id INT NOT NULL,
    communication_type VARCHAR(10) NOT NULL,
    communication_value VARCHAR(100) NOT NULL,
    is_valid BIT,
    is_default BIT
);
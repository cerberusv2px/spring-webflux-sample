
CREATE TABLE IF NOT EXISTS users ( id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, name VARCHAR(100) NOT NULL,
email varchar(100) unique ,password varchar(500));
CREATE DATABASE player_evaluation;
USE player_evaluation;

CREATE TABLE indexer (
                         index_id INT IDENTITY(1,1) PRIMARY KEY,
                         name NVARCHAR(64) NOT NULL,
                         valueMin FLOAT NOT NULL,
                         valueMax FLOAT NOT NULL
);

CREATE TABLE player (
                        player_id INT IDENTITY(1,1) PRIMARY KEY,
                        name NVARCHAR(64) NOT NULL,
                        full_name NVARCHAR(128) NOT NULL,
                        age INT NOT NULL,
                        index_id INT NOT NULL,
                        FOREIGN KEY (index_id) REFERENCES indexer(index_id)
);

CREATE TABLE player_index (
                              id INT IDENTITY(1,1) PRIMARY KEY,
                              player_id INT NOT NULL,
                              index_id INT NOT NULL,
                              value FLOAT NOT NULL,
                              FOREIGN KEY (player_id) REFERENCES player(player_id),
                              FOREIGN KEY (index_id) REFERENCES indexer(index_id)
);

INSERT INTO indexer (name, valueMin, valueMax) VALUES ('speed', 10, 100);
INSERT INTO indexer (name, valueMin, valueMax) VALUES ('strength', 0, 10);
INSERT INTO indexer (name, valueMin, valueMax) VALUES ('accurate', 0, 1);

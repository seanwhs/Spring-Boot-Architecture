-- src/main/resources/data.sql

CREATE TABLE IF NOT EXISTS app_user (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

INSERT INTO app_user (username, email) VALUES
('sean_wong', 'sean.wong@example.com'),
('alice_lim', 'alice.lim@example.com'),
('bob_lee', 'bob.lee@example.com'),
('joe_biden', 'joe.biden@example.com'),
('michael_jackson', 'michael.jackson@example.com');

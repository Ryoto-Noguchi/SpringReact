CREATE DATABASE IF NOT EXISTS quiz ;
SELECT * FROM questions;

UPDATE questions SET question = 'Who was the former Prime Minister of Japan ?' WhERE id = 2;uj

CREATE TABLE questions (
  id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  question VARCHAR(255) NOT NULL,
  choices JSON NOT NULL,
  answer CHAR(1) NOT NULL
)

INSERT INTO questions (question, choices, answer) VALUES (
  'Who is the President of the United States ?',
  JSON_OBJECT('A', 'Donald Trump', 'B', 'Hillary Clinton', 'C', 'Joe Biden', 'D', 'Barack Obama'),
  'C'
)
INSERT INTO questions (question, choices, answer) VALUES (
  'Which country was founded in 1945 ?',
  JSON_OBJECT('A', 'Jamaica', 'B', 'South Korea', 'C', 'Japan', 'D', 'China'),
  'B'
)

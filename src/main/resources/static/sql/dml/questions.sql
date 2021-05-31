SELECT
  *
FROM
  questions;

INSERT INTO questions (question, choices, answer) VALUES  (
    'Who is the President of the United States ?',
    JSON_OBJECT(
      'A',
      'Donald Trump',
      'B',
      'Hillary Clinton',
      'C',
      'Joe Biden',
      'D',
      'Barack Obama'
    ),
    'C'
  );

INSERT INTO questions (question, choices, answer) VALUES
  (
    'Which country was founded in 1945 ?',
    JSON_OBJECT('A','Jamaica','B','South Korea','C','Japan','D','China'),
    'B'
  );

INSERT INTO questions (question, choices, answer) VALUES
  (
    'What country has the biggest poplulation in the world ? ?',
    JSON_OBJECT('A','China','B','India','C','the United States of America','D','Indonesia'),
    'A'
  );

INSERT INTO questions (question, choices, answer) VALUES
  (
    'Which country is located in Asia ?',
    JSON_OBJECT('A','Argentina','B','Brazil','C','Russia','D','Vietnam'),
    'D'
  );

INSERT INTO questions (question, choices, answer) VALUES
  (
    'Who is the Prime Minister of Japan ?',
    JSON_OBJECT('A','Shinzo Abe','B','Yoshiro Mori','C','Junichiro Koizumi','D','Yoshihide Suga'),
    'D'
  );

INSERT INTO questions (question, choices, answer) VALUES
  (
    'Who is the former Prime Minister of Japan',
    JSON_OBJECT('A','Shinzo Abe','B','Shinjiro Koizumi','C','Kakuei Tanaka','D','Yoshihide Suga'),
    'B'
  );

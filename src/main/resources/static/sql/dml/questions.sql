SELECT
  *
FROM
  questions;

INSERT INTO
  questions (question, choices, answer)
VALUES
  (
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
  )
INSERT INTO
  questions (question, choices, answer)
VALUES
  (
    'Which country was founded in 1945 ?',
    JSON_OBJECT(
      'A',
      'Jamaica',
      'B',
      'South Korea',
      'C',
      'Japan',
      'D',
      'China'
    ),
    'B'
  )

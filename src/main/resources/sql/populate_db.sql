 INSERT INTO worker (NAME, BIRTHDAY, LEVEL, SALARY)
 VALUES
 ('Oleg Ivanov', '1980-12-31', 'Senior', 7000),
 ('Kyrylo Dobrohot', '1981-12-03', 'Middle', 4500),
 ('Oleksandr Ivashchenko', '2000-07-22', 'Junior', 2500),
 ('Iryna Natalukha', '1993-01-11', 'Middle', 5000),
 ('Andriy Dubovyk', '1979-03-25', 'Senior', 8000),
 ('Alina Stefan', '1997-10-10', 'Junior', 3000),
 ('Mykhailo Shcherban', '1982-08-16', 'Senior', 7500),
 ('Anna Shabalina', '1999-02-01', 'Trainee', 1500),
 ('Olga Chernyshova', '1980-07-20', 'Senior', 8500),
 ('Evgeny Feshak', '1996-05-14', 'Middle', 6000);

 INSERT INTO client (NAME)
 VALUES
 ('Client F'),
 ('Client K'),
 ('Client M'),
 ('Client N'),
 ('Client P');

 INSERT INTO project (CLIENT_ID, NAME, START_DATE, FINISH_DATE)
 VALUES
 (1, 'Project A', '2022-01-15', '2022-12-20'),
 (2, 'Project B', '2022-02-15', '2022-08-15'),
 (3, 'Project S', '2022-04-15', '2022-12-01'),
 (4, 'Project Q', '2022-07-20', '2022-11-30'),
 (5, 'Project N', '2022-09-24', '2023-05-20'),
 (1, 'Project L', '2023-01-28', '2023-05-31'),
 (2, 'Project S', '2023-03-11', '2023-08-10'),
 (3, 'Project P', '2023-05-16', '2023-09-22'),
 (4, 'Project J', '2023-06-20', '2023-11-16'),
 (5, 'Project F', '2023-07-05', '2023-12-12');



 INSERT INTO project_worker (PROJECT_ID, WORKER_ID)
 VALUES
 (1, 1),
 (1, 2),
 (2, 3),
 (2, 4),
 (3, 5),
 (3, 6),
 (4, 7),
 (4, 8),
 (5, 9),
 (5, 10),
 (6, 1),
 (6, 2),
 (7, 3),
 (8, 4),
 (8, 5),
 (9, 6),
 (9, 7),
 (9, 8),
 (10, 9),
 (10, 10);


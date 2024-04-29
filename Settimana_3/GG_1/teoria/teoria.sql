select * from public.studenti;

select * from public.studenti where nome='Mario' or cognome='Bianchi';

select * from public.studenti where nome like '%r%';  -- cosi vedo quando è contenuto all'interno di una stringa

select * from public.studenti where nome like '%n_';  

select * from public.studenti where nome in('Mario','Antonio');  -- "in" per sostituire i connettivi logici

select * from public.studenti where nome not like '%a';

select * from public.studenti where nome is not null;


-- INNER JOIN IMPLICITA
select s.nome, s.cognome, e.corso, e.voto 
from public.studenti s, public.esami e
where e.studente=s.matricola;

-- INNER JOIN ESPLICITA
select s.nome, s.cognome, e.corso, e.voto 
from public.esami e INNER JOIN public.studenti s
ON e.studente=s.matricola;

--ORDER BY
SELECT * FROM public.studenti ORDER BY nome ASC;

--DISTINCT
SELECT DISTINCT nome FROM public.studenti;

-- COUNT CON *
SELECT COUNT(*) FROM public.studenti;

-- COUNT CON NOME CAMPO (PUO CONTEGGIARE ANCHE CAMPI NULL)
SELECT COUNT(*) FROM public.studenti;

-- AVG, MAX E MIN
SELECT AVG(matricola) FROM public.studenti;

SELECT MAX(matricola) FROM public.studenti;

SELECT MIN(matricola) FROM public.studenti;

-- GROUP BY
SELECT nome, COUNT(*) 
FROM public.studenti
GROUP BY nome;

-- GROUP BY CON RICERCA
select nome, count(*) 
from public.studenti
group by nome
having count(*)>1;

-- conosco il numero di esami di ogni studente 
SELECT s.matricola, COUNT(*)
FROM public.studenti s 
INNER JOIN public.esami e 
ON s.matricola = e.studente
GROUP BY matricola;

-- qui lo faccio con Left Outer Join
SELECT *
FROM public.studenti s 
LEFT OUTER JOIN public.esami e 
ON s.matricola = e.studente;

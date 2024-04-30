--1.Estrai tutti i clienti con nome Mario
SELECT * FROM public.clienti WHERE nome='Mario';

--2.Estrarre il nome e il cognome dei clienti nati nel 1982
SELECT nome, cognome
FROM public.clienti 
WHERE anno_nascita = 1982;

--3.Estrarre il numero delle fatture con iva al 20%
SELECT COUNT(*) 
FROM public.fatture
WHERE iva=20;

--4.Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio 
--(Per estrarre l’anno da una data si può usare EXTRACT(YEAR FROM data)
SELECT * 
FROM public.prodotti
WHERE EXTRACT (YEAR FROM data_attivazione)=2017 
AND (in_produzione=true OR in_commercio=true);

--5.Estrarre le fatture con importo inferiore a 1000 e i dati dei clienti ad esse collegate
SELECT * FROM public.fatture f 
INNER JOIN public.clienti c 
ON f.id_cliente= c.numero_cliente
WHERE importo<1000;

--6.Riportare l’elenco delle fatture (numero, importo, iva e data) con in aggiunta il nome del fornitore
SELECT fa.numero_fatture, fa.importo, fa.iva, fa.data_fattura, fo.denominazione
FROM public.fatture fa 
INNER JOIN public.fornitori fo 
ON fa.numero_fornitore=fo.numero_forniture;

--7.Considerando soltanto le fatture con iva al 20 per cento,
--estrarre il numero di fatture per ogni anno (Per estrarre l’anno da una data si può usare EXTRACT(YEAR FROM data)
SELECT EXTRACT(YEAR FROM data_fattura) anno,
COUNT(*) numero_fatture
FROM public.fatture
WHERE iva=20
GROUP BY anno;

--8.Riportare il numero di fatture e la somma dei relativi importi divisi per anno di fatturazione
SELECT EXTRACT(YEAR FROM data_fattura) anno,
COUNT(*) numero_fatture,
SUM(importo) importo_totale
FROM public.fatture
GROUP BY anno;

--9.Estrarre gli anni in cui sono state registrate più di 2 fatture con tipologia ‘A’
SELECT EXTRACT(YEAR FROM data_fattura) anno,
COUNT (*) numero_fatture
FROM public.fatture
WHERE tipologia='A'
GROUP BY anno
HAVING COUNT(*)>2;

--10.Estrarre il totale degli importi delle fatture divisi per residenza dei clienti
SELECT c.regione_residenza, 
SUM(f.importo)
FROM public.fatture f
INNER JOIN public.clienti c
ON f.id_cliente=c.numero_cliente
GROUP BY c.regione_residenza;


--11.Estrarre il numero dei clienti nati nel 1980 che hanno almeno una fattura superiore a 50 euro
SELECT COUNT(DISTINCT numero_cliente)
FROM public.clienti c 
INNER JOIN public.fatture f 
ON c.numero_cliente=f.id_cliente
WHERE f.importo>50 AND c.anno_nascita=1980;



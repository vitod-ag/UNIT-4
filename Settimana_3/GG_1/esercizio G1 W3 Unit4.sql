--Estrai tutti i clienti con nome Mario
SELECT * FROM public.clienti WHERE nome='Mario';

--Estrarre il nome e il cognome dei clienti nati nel 1982
SELECT nome, cognome
FROM public.clienti 
WHERE anno_nascita = 1982;

--Estrarre il numero delle fatture con iva al 20%
SELECT COUNT(*) 
FROM public.fatture
WHERE iva=20;

--Estrarre i prodotti attivati nel 2017 e che sono in produzione oppure in commercio 
--(Per estrarre l’anno da una data si può usare EXTRACT(YEAR FROM data)
SELECT * 
FROM public.prodotti
WHERE EXTRACT (YEAR FROM data_attivazione)=2017 
AND (in_produzione=true OR in_commercio=true);

--Estrarre le fatture con importo inferiore a 1000 e i dati dei clienti ad esse collegate
SELECT * FROM public.fatture f 
INNER JOIN public.clienti c 
ON f.id_cliente= c.numero_cliente
WHERE importo<1000;

--Riportare l’elenco delle fatture (numero, importo, iva e data) con in aggiunta il nome del fornitore
SELECT fa.numero_fatture, fa.importo, fa.iva, fa.data_fattura, fo.denominazione
FROM public.fatture fa 
INNER JOIN public.fornitori fo 
ON fa.numero_fornitore=fo.numero_forniture;

--Considerando soltanto le fatture con iva al 20 per cento,
--estrarre il numero di fatture per ogni anno (Per estrarre l’anno da una data si può usare EXTRACT(YEAR FROM data)
SELECT EXTRACT(YEAR FROM data_fattura) anno,
COUNT(*) numero_fatture
FROM public.fatture
WHERE iva=20
GROUP BY anno;

--Riportare il numero di fatture e la somma dei relativi importi divisi per anno di fatturazione
SELECT EXTRACT(YEAR FROM data_fattura) anno,
COUNT(*) numero_fatture,
SUM(importo) importo_totale
FROM public.fatture
GROUP BY anno;
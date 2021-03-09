CREATE TABLE IF NOT EXISTS adresy_dostawy(
	id INTEGER PRIMARY KEY,
	id_zamowienia INTEGER NOT NULL,
	kraj TEXT NOT NULL,
	miejscowosc TEXT NOT NULL,
	ulica TEXT NOT NULL,
	mieszkanie TEXT NOT NULL,
	kod_pocztowy TEXT NOT NULL,
	FOREIGN KEY(id_zamowienia) REFERENCES zamowienia(id)
);
CREATE TABLE IF NOT EXISTS zamowienia(
	id INTEGER PRIMARY KEY,
	cena_dostawy INTEGER NOT NULL,
	data_zamowienia TEXT NOT NULL,
	status TEXT NOT NULL,
	darmowy_zwrot INTEGER NOT NULL,
	numer_faktury INTEGER,
	id_klienci TEXT NOT NULL,
	id_pracownicy TEXT NOT NULL,
	FOREIGN KEY(id_klienci) REFERENCES klienci(id),
	FOREIGN KEY(id_pracownicy) REFERENCES pracownicy(id)
);
CREATE TABLE IF NOT EXISTS klienci(
	id INTEGER PRIMARY KEY,
	imie TEXT NOT NULL,
	nazwisko TEXT NOT NULL,
	kraj TEXT NOT NULL,
	miejscowosc TEXT NOT NULL,
	ulica TEXT NOT NULL,
	mieszkanie TEXT NOT NULL,
	kod_pocztowy TEXT NOT NULL,
	numer_tel  TEXT NOT NULL,
	email TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS pracownicy(
	id INTEGER PRIMARY KEY,
	imie TEXT NOT NULL,
	nazwisko TEXT NOT NULL
);
CREATE TABLE IF NOT EXISTS produkty_oferta(
	id INTEGER PRIMARY KEY,
	ilosc_dostepnych INTEGER NOT NULL,
	cena INTEGER NOT NULL,
	promocja_cena INTEGER,
	promocja_ilosc INTEGER,
	promocja_poczatek TEXT,
	promocja_koniec TEXT,
	id_zamowienia INTEGER NOT NULL,
	id_produkty INTEGER NOT NULL,
	FOREIGN KEY(id_produkty) REFERENCES produkty(id)
);
CREATE TABLE IF NOT EXISTS produkty(
	id INTEGER PRIMARY KEY,
	producent TEXT NOT NULL,
	opis TEXT,
	galeria_zdjec TEXT,
	ilosc_sprzedanych INTEGER NOT NULL
);
CREATE TABLE IF NOT EXISTS produkty_kategorie(
	id_produkty INTEGER NOT NULL,
	id_kategorie INTEGER NOT NULL,
	FOREIGN KEY(id_produkty) REFERENCES produkty(id),
	FOREIGN KEY(id_kategorie) REFERENCES kategorie(id)
);
CREATE TABLE IF NOT EXISTS kategorie(
	id INTEGER PRIMARY KEY,
	kategoria TEXT NOT NULL
);
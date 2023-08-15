create table uyeler (
	uye_id SERIAL primary key,
	uye_adi varchar(50),
	uye_soyadi varchar(50),
	uye_dogum_tarihi date,
	adres text,
	eposta varchar(50),
	kayit_tarihi date
);

select * from uyeler;


create table yazarlar(
	yazar_id SERIAL primary key,
	yazar_adi VARCHAR(50),
	yazar_soyadi VARCHAR(50),
	yazar_dogum_tarihi DATE,
	ulus VARCHAR(50)
);

create table kitaplar(
	kitap_id SERIAL primary key,
	kitap_adi VARCHAR(200),
	yazar_id int references yazarlar(yazar_id),
	yayinlanma_yili INT,
	isbn VARCHAR(20),
	kategori_id int references kategoriler(kategori_id),
	erisilebilirlik_durumu BOOLEAN

);



SET datestyle TO "ISO, MDY";



show datestyle;

insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Natalina', 'Bartholomaus', '04/16/2013', 'Apt 16', 'nbartholomaus0@multiply.com', '12/17/2022');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Casey', 'Ferrand', '01/31/2002', 'PO Box 2094', 'cferrand1@51.la', '03/05/2023');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Alex', 'Arrault', '10/23/1991', 'PO Box 32225', 'aarrault2@instagram.com', '04/18/2023');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Vasilis', 'Halley', '02/24/1998', 'PO Box 48815', 'vhalley3@uol.com.br', '09/28/2021');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Bertram', 'Syer', '08/05/1997', 'Room 1340', 'bsyer4@facebook.com', '03/13/2022');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Thomasa', 'Collard', '10/26/2010', 'PO Box 76196', 'tcollard5@cocolog-nifty.com', '09/21/2020');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Lea', 'Looks', '10/31/2010', 'Room 859', 'llooks6@reference.com', '06/03/2022');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Padget', 'Skocroft', '10/22/2009', 'Room 1193', 'pskocroft7@1und1.de', '09/22/2022');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Mari', 'Shipton', '11/16/2002', 'PO Box 29484', 'mshipton8@mozilla.org', '08/08/2021');
insert into uyeler (uye_adi, uye_soyadi, uye_dogum_tarihi, adres, eposta, kayit_tarihi) values ('Horton', 'Jeanin', '02/02/1998', 'Apt 247', 'hjeanin9@acquirethisname.com', '12/17/2020');


select * from uyeler;
delete from uyeler;



insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Shane', 'Lovel', '10/26/1998', 'Portugal');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Ly', 'Hembery', '08/29/1994', 'Poland');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Gian', 'Letchmore', '10/16/1990', 'Ukraine');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Hamilton', 'Putton', '05/31/2006', 'Indonesia');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Ellynn', 'Willcott', '02/24/1997', 'Sudan');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Miguel', 'Fulton', '01/06/2008', 'Greece');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Albertina', 'O''Bradain', '01/05/1992', 'Afghanistan');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Chelsea', 'Golsworthy', '03/29/1993', 'Colombia');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Josephine', 'Ogglebie', '11/22/1993', 'Portugal');
insert into yazarlar (yazar_adi, yazar_soyadi, yazar_dogum_tarihi, ulus) values ('Nelli', 'Lorking', '09/11/2003', 'Russia');


select * from yazarlar;
delete from yazarlar ;

select * from kitaplar k where k.kategori_id =1;

select * from kitaplar k where k.kitap_adi = 'Antika';

SELECT kitap_adi,yazar_id  FROM kitaplar k WHERE k.kitap_adi = 'Antika';

select yazar_id, count(*) as "kitap sayısı" from kitaplar k group by k.yazar_id; 

select yazar_id, kategori_id , count(*) from kitaplar k group by k.kategori_id, k.yazar_id  order by yazar_id; 

select kitap_adi, k2.kategori_adi from kitaplar k inner join kategoriler k2 ON k.kategori_id = k2.kategori_id; 

select kitap_adi, yazar_adi,yazar_soyadi from kitaplar k inner join yazarlar y ON k.yazar_id  = y.yazar_id; 


select kitap_adi, yazar_adi, yazar_soyadi, kategori_adi 
from kitaplar k inner join yazarlar y 
ON k.yazar_id  = y.yazar_id
inner join kategoriler kat 
on kat.kategori_id = k.kategori_id ;



select kitap_adi,yazar_id from kitaplar order by kitap_adi desc;



select k.yayinlanma_yili, count(*) 
from kitaplar k
group by yayinlanma_yili ;


select k.yayinlanma_yili, k.kategori_id, count(*)
from kitaplar k 
group by k.yayinlanma_yili, k.kategori_id;


select k.kategori_id,k.yayinlanma_yili, count(*)
from kitaplar k 
group by k.yayinlanma_yili, k.kategori_id;

select k.kategori_id ,k.yayinlanma_yili, count(k.kategori_id) 
from kitaplar k 
group by k.yayinlanma_yili, k.kategori_id;


create table oduncler (
	odunc_id SERIAL primary key,
	kitap_id int references kitaplar(kitap_id),
	uye_id int references uyeler(uye_id),
	odunc_verme_tarihi date,
	odunc_alma_tarihi date
);



insert into oduncler (kitap_id, uye_id, odunc_verme_tarihi, odunc_alma_tarihi) values (1, 1, '10/26/2023', '10/29/2023');
insert into oduncler (kitap_id, uye_id, odunc_verme_tarihi, odunc_alma_tarihi) values (4, 2, '10/26/2022', '11/19/2023');
insert into oduncler (kitap_id, uye_id, odunc_verme_tarihi, odunc_alma_tarihi) values (6, 3, '10/26/2021', '10/29/2021');


select k.kitap_adi, u.uye_adi, o.odunc_verme_tarihi, o.odunc_alma_tarihi 
from oduncler o
inner join kitaplar k on o.kitap_id = k.kitap_id
inner join uyeler u on u.uye_id = o.uye_id ;





















































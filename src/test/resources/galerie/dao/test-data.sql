-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Paris', '2 avenue des Capucines, Paris');

INSERT INTO Exposition(id,datexpo,intitule,intitule,duree) VALUES (1,TO DATE ('2015/03/26','YYYY/MM/DD'),'New art',4);
INSERT INTO Exposition(id,datexpo,intitule,intitule,duree) VALUES (2,TO DATE ('2018/05/14','YYYY/MM/DD'),'Abstract',3);

INSERT INTO Artiste(id,nom,adresse,biographie) VALUES (1,'David','2 allée Margueritte, Bourg la reine','Née le 2 aout...');
INSERT INTO Artiste(id,nom,adresse,biographie) VALUES (2,'Picasso','5 rue du Berger, Bourg la reine','Née le 6 mars...');

INSERT INTO Tableau(id,titre,support,largeur,hauteur) VALUES (1,'le cri','huile',20,16);
INSERT INTO Tableau(id,titre,support,largeur,hauteur) VALUES (2,'origine du monde','huile',25,12);

INSERT INTO Vente(id,venduLe,prixVente) VALUES (1,TO DATE ('2019/07/28','YYYY/MM/DD'),1200);
INSERT INTO Vente(id,venduLe,prixVente) VALUES (1,TO DATE ('2020/09/21','YYYY/MM/DD'),5000);

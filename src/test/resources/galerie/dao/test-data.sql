-- Initialisation spécifiques pour un jeu de test
INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Paris', '2 avenue des Capucines, Paris');

INSERT INTO Exposition(id,datexpo,intitule,duree,galerie_id) VALUES (1,TO DATE ('2015/03/26','YYYY/MM/DD'),'New art',4,1);
INSERT INTO Exposition(id,datexpo,intitule,duree,galerie_id) VALUES (2,TO DATE ('2018/05/14','YYYY/MM/DD'),'Abstract',3,2);

INSERT INTO Personne(id,nom,adresse) VALUES (1,'David','2 allee Margueritte, Bourg la reine');
INSERT INTO Personne(id,nom,adresse) VALUES (2,'Picasso','5 rue du Berger, Bourg la reine');

INSERT INTO Artiste(id,biographie) VALUES (2,'Peintre espagnol ayant peint Guernica');

INSERT INTO Tableau(id,titre,support,largeur,hauteur,artiste_id) VALUES (1,'le cri','huile',20,16,1);
INSERT INTO Tableau(id,titre,support,largeur,hauteur,arstiste_id) VALUES (2,'origine du monde','huile',25,12,2);

INSERT INTO Exposition_Oeuvres(exposition_id,oeuvres_id) VALUES (2,1);

INSERT INTO Transactions(id,venduLe,prixVente,acheteur_id,oeuvre_id) VALUES (1,TO DATE ('2019/07/28','YYYY/MM/DD'),1200,1,1);
INSERT INTO Transactions(id,venduLe,prixVente,acheteur_id,oeuvre_id) VALUES (1,TO DATE ('2020/09/21','YYYY/MM/DD'),50002,2);

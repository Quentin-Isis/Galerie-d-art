-- Initialisation spécifiques pour un jeu de test

INSERT INTO Galerie(id, nom, adresse) VALUES (1, 'Saatchi', 'King\''s Road, Londres');
INSERT INTO Galerie(id, nom, adresse) VALUES (2, 'Paris', '2 avenue des Capucines, Paris');

INSERT INTO Exposition(id,datexpo,intitule,duree,galerie_id) VALUES (1,TO_DATE('2020/03/26','YYYY/MM/DD'),'New art',4,1);
INSERT INTO Exposition(id,datexpo,intitule,duree,galerie_id) VALUES (2,TO_DATE('2020/05/14','YYYY/MM/DD'),'Abstract',3,2);

INSERT INTO Personne(id,nom,adresse) VALUES (1,'David','2 allee Margueritte, Bourg la reine');
INSERT INTO Personne(id,nom,adresse) VALUES (2,'Picasso','5 rue du Berger, Bourg la reine');

INSERT INTO Artiste(biographie, id) VALUES ('Peintre espagnol ayant peint Guernica', 1);

INSERT INTO Tableau(id,titre,support,largeur,hauteur,peintre_id) VALUES (1,'le cri','huile',20,16,1);
INSERT INTO Tableau(id,titre,support,largeur,hauteur,peintre_id) VALUES (2,'origine du monde','huile',25,12,1);

INSERT INTO Exposition_Oeuvres(accrochages_id,oeuvres_id) VALUES (2,1);

INSERT INTO Transactions(id,vendu_le,prix_vente,acheteur_id,lieu_de_vente_id,oeuvre_id) VALUES (1,TO_DATE('2020/07/28','YYYY/MM/DD'),1200,1,2,1);
INSERT INTO Transactions(id,vendu_le,prix_vente,acheteur_id,lieu_de_vente_id,oeuvre_id) VALUES (2,TO_DATE('2020/09/21','YYYY/MM/DD'),50002,1,1,1);

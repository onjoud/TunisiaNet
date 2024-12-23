#Author: Onjoud
Feature: HomePageTunisiaNet

  Scenario: verification de menu de la page dacceuil
    Given utilisateur est sur la page dacceuil
    When utilisateur survole la souris sur le menu "Stockage" et cliquer sur le sousmenu "Disque SSD"
    Then utilisateur se dérige vers la page de produit "Disque SSD"

  Scenario: chercher un produit
    Given utilisateur est sur la page dacceuil
    When utilisateur cherche le produit "SAMSUNG"
    Then utilisateur est dérigr vers la page de produit cherchee "SAMSUNG"

#Author: Onjoud

Feature: CommanderProduit

Scenario: ajouter disque SSD

Given utilisateur est sur la page de disque SSD

When clique sur le produit "Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go" 

Then utilisateur se dérige vers la page de produitcommandee "DISQUE DUR INTERNE SSD TWINMOS NGFFDGBM2280 SATA III M.2 / 128 GO"
And utilisateur verife que le produit est disponible
And utilisateur ajouter le produit dans le panier ajouter au panier
And utilisateur clique sur le bouton commander
And utilisateur se dériger vers la page de prduit comandee "Disque Dur Interne SSD TwinMOS NGFFDGBM2280 SATA III M.2 / 128 Go"
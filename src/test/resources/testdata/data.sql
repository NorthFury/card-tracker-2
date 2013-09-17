INSERT INTO account (id, email, name, password) VALUES (1, 'user@domain.com', 'user', '0cc175b9c0f1b6a831c399e269772661');
INSERT INTO account (id, email, name, password) VALUES (2, 'dev@domain.com', 'dev', '0cc175b9c0f1b6a831c399e269772661');
INSERT INTO account (id, email, name, password) VALUES (3, 'su@domain.com', 'su', '0cc175b9c0f1b6a831c399e269772661');


INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (1, false, false, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (2, false, false, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (3, false, false, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (4, false, false, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (5, false, false, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (6, false, false, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (7, true, true, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (8, true, true, false, 1);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (9, false, true, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (10, false, false, false, 1);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (11, false, true, false, NULL);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (12, false, false, false, 2);
INSERT INTO card_status (id, bugged, implemented, requested, account_id) VALUES (13, false, false, false, 2);


INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (1, 'G', 0, '', 'Forest', NULL, NULL, 'Forest', 'Basic', NULL, 'Land', 1);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (2, 'Target creature gets +3/+3 until end of turn.', 1, 'G', 'Giant Growth', NULL, NULL, NULL, NULL, NULL, 'Instant', 2);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (3, 'Lightning Bolt deals 3 damage to target creature or player.', 1, 'R', 'Lightning Bolt', NULL, NULL, NULL, NULL, NULL, 'Instant', 3);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (4, '', 2, '1$G', 'Runeclaw Bear', NULL, '2', 'Bear', NULL, '2', 'Creature', 4);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (5, 'Flying$You can''t lose the game and your opponents can''t win the game.', 7, '7', 'Platinum Angel', NULL, '4', 'Angel', NULL, '4', 'Artifact Creature', 5);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (6, 'Enchant creature$Enchanted creature gets +1/+1 for each Plains you control and has flying.', 4, '3$W', 'Armored Ascension', NULL, NULL, 'Aura', NULL, NULL, 'Enchantment', 7);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (7, 'Creatures you control have flying.', 4, '2$U$U', 'Levitation', NULL, NULL, NULL, NULL, NULL, 'Enchantment', 6);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (8, 'Whenever a player casts a white spell, you may gain 1 life.', 2, '2', 'Angel''s Feather', NULL, NULL, NULL, NULL, NULL, 'Artifact', 13);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (9, 'Search your library for a card and put that card into your hand. Then shuffle your library.', 4, '2$B$B', 'Diabolic Tutor', NULL, NULL, NULL, NULL, NULL, 'Sorcery', 9);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (10, '{tap}: Add {1} to your mana pool.${2}, {tap}, Sacrifice Buried Ruin: Return target artifact card from your graveyard to your hand.', 0, '', 'Buried Ruin', NULL, NULL, NULL, NULL, NULL, 'Land', 10);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (11, '+1: Draw a card. Target player puts the top card of his or her library into his or her graveyard.$0: Target player puts the top ten cards of his or her library into his or her graveyard.$-7: Any number of target players each draw twenty cards.', 5, '3$U$U', 'Jace, Memory Adept', NULL, NULL, 'Jace', NULL, '4', 'Planeswalker', 8);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (12, 'Flying$When Phantasmal Dragon becomes the target of a spell or ability, sacrifice it.', 4, '2$U$U', 'Phantasmal Dragon', NULL, '5', 'Dragon Illusion', NULL, '5', 'Creature', 11);
INSERT INTO card (id, abilities, cmc, cost, name, other_side_id, power, subtype, supertype, toughness, type, status_id) VALUES (13, 'You may have Phantasmal Image enter the battlefield as a copy of any creature on the battlefield, except it''s an Illusion in addition to its other types and it gains "When this creature becomes the target of a spell or ability, sacrifice it."', 2, '1$U', 'Phantasmal Image', NULL, '0', 'Illusion', NULL, '0', 'Creature', 12);


INSERT INTO expansion (id, code, name, release_date) VALUES (1, 'M10', 'Magic 2010', '2009-07-17');
INSERT INTO expansion (id, code, name, release_date) VALUES (2, 'M11', 'Magic 2011', '2010-07-16');
INSERT INTO expansion (id, code, name, release_date) VALUES (3, 'M12', 'Magic 2012', '2011-07-09');
INSERT INTO expansion (id, code, name, release_date) VALUES (4, 'M13', 'Magic 2013', '2012-07-07');


INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (1, '246', '213628', NULL, 0, 1, 2);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (2, '248', '244321', NULL, 0, 1, 3);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (3, '184', '189879', NULL, 1, 2, 1);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (4, '178', '205224', NULL, 1, 2, 2);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (5, '146', '191089', NULL, 1, 3, 1);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (6, '149', '205227', NULL, 1, 3, 2);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (7, '195', '207337', NULL, 1, 4, 2);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (8, '193', '221893', NULL, 1, 4, 3);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (9, '203', '189888', NULL, 1, 4, 1);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (10, '218', '191313', NULL, 4, 5, 1);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (11, '3', '193738', NULL, 2, 6, 1);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (12, '60', '190191', NULL, 2, 7, 1);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (13, '201', '206325', NULL, 2, 8, 2);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (14, '93', '205222', NULL, 2, 9, 2);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (15, '224', '220302', NULL, 2, 10, 3);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (16, '58', '238263', NULL, 4, 11, 3);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (17, '71', '2128', NULL, 2, 12, 3);
INSERT INTO card_edition (id, card_number, gatherer_id, mtgo_image_id, rarity, card_id, expansion_id) VALUES (18, '72', '220099', NULL, 3, 13, 3);

COMMIT;

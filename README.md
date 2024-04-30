# Legend of Logoro

## Overview
The Legend of Logoro is a text-based game programmed entirely in Java. The authors to this program are Fawaaz Kamali Siddiqui, 
Shreekavin Umasankar, Lemi Miyu, Muhammad Nomaan, Sinan Shana, Steven Wang, and Matthew Kostuch. This is part of their Grade 12
Computer Science assignment / project, and they have worked on this program for a week. 


## Storyline
In the distant reaches of the universe lies a galaxy teeming with magical energy and mathematical mysteries. The inhabitants of this galaxy, known as the Mathematicians, have long safeguarded the secrets of mathematics, using its power to maintain balance and order across the cosmos.

Among these mathematicians is Logoro, a brilliant prodigy known for his unparalleled mastery of equations. However, when an ancient artifact known as the Prism of Equations is shattered, Logoro is caught in the ensuing chaos and disappears without a trace, his whereabouts unknown.

Trouble brews as the shattered Prism's fragments scatter across five distant planets, unleashing chaos and threatening the very fabric of reality. As an apprentice mathematician under the guidance of Professor Puzzler, you receive a mysterious summons. It becomes clear that Logoro's disappearance is linked to the Prism's destruction, and your mission is not only to restore the Prism but also to rescue Logoro and save the galaxy from impending doom.

## Game Dynamics
There are 5 realms (or planets) in this game. Each planet has a 'boss' which must be defeated so the user can progress to the next round. Each planet also has 2 optional side quests, which involve mathematical equations and riddles. 

To win the game, the user must advance to the last planet and defeat the boss. 

The user is equipped with a default wand. Wands can provide multipliers to a user's base defense / offense (this will be explained later)
Every boss has their own wand and the final boss has the 'Elder Wand', or the most powerful wand in existence. 

On completion of side quests, users are granted coins. These coins can be utilized in the game shop, where users can buy wands (with special multipliers) and gain extra HP. 

The user only has 1 current wand. This means that the inventory could contain up to 10 wands, but the user can only use 1 wand for 
the duel against a boss. This is why boss wand statistics are displayed on the menu screen. 

The user has only 3 lives in the game. 

The 5 realms are as follows:
1. Air World (Mathania)
2. Land World (Subtractus)
3. Water World (Multiplya)
4. Fire World (Dividia)
5. Master World (Operationaria)

## Fight Dynamics
There are 2 modes in the fight section of the game: offense and defense. 

The user always starts out in the defensive mode. As a defender, the user is prompted the guess the boss' number within the given range. 
If guessed correctly, the user can counter the boss' attacks and switch to offensive mode. If not guessed correctly, the boss 
continues their attack. 

In the offensive mode, the user must try to enter a number that the boss does not guess. If the boss guesses the number, the 
user switches to defensive mode. 

There is a key aspect to the fight: combinations

The longer the user (or boss) has been in an offensive state, the deadlier the attack becomes. To understand how the calculation 
aspect works, we must understand that:
1. The user and boss have both got base defenses and base offenses
2. The user and boss have both got wands that can multiply their defensive and offensive stats

Let's say, for example, that our user's base defense and offense stats are 1.0 and 1.0. The same base stats are for the boss.

If the user has a wand with DEF 1.5 and OFF 1.25, whereas the boss has DEF 1.25 and OFF 1.75, their attacking and defensive stats
change. So the user's defensive points (including the wand) will be 1.5 and the boss' will be 1.25. Same goes with attack points.

### Damage Calculations
The Damage Calculation can be modelled by a simple equation. Assuming that the boss is attacking, the damage done will be:

damage = (userDefense * userWandDefense) - [(bossAttack * bossWandAttack) + (n * 0.5)], where n is the number of hit in a row (combinations)

The same equation is used for when the user is attacking. It is evident that the longer a person has been hit consecutively, the 
larger the damage will be done to them. 

The objective for the user (during a fight) is to get the Boss HP to 0 so that the user can progress to the next round.



As stated previously, the objective of the game is to advance to the last world (Operationaria, the Master World) and defeat the boss to save Logoro and restore balance in the galaxies by acquiring all missing fragments of the Prism of Equations. 
package edu.learn.harrypotter.datas;

import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HarryPotterQuestionBank {

  //TODO
    //make a list of question numbers
    // populate question from the numbers
    // use of random class



    private ArrayList<HarryPotterQuiz> questionBank() {
        ArrayList<HarryPotterQuiz> harryPotterQuizList = new ArrayList<>();

        harryPotterQuizList.add(new HarryPotterQuiz(1, "In what house did the Sorting Hat almost put Harry?",
                Arrays.asList("Slytherin", "Hufflepuff", "Ravenclaw", "Gryffindor"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(2, "What is Harry Potter's patronus?",
                Arrays.asList("Stag", "Otter", "Jack Rabbit", "Doe"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(3, "Who is the headmaster of Hogwarts?",
                Arrays.asList("Albus Dumbledore", "Severus Snape", "Minerva McGonagall", "Rubeus Hagrid"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(4, "What is the name of Lord Voldemort's pet snake?",
                Arrays.asList("Nagini", "Basilisk", "Norbert", "Fluffy"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(5, "What is the name of Ron Weasley's pet rat?",
                Arrays.asList("Scabbers", "Crookshanks", "Pigwidgeon", "Hermione"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(6, "What is the name of Harry Potter's first broomstick?",
                Arrays.asList("Nimbus 2000", "Firebolt", "Comet 140", "Nimbus 1000"),
                3));

        harryPotterQuizList.add(new HarryPotterQuiz(7, "What is the name of the three-headed dog guarding the Philosopher's Stone?",
                Arrays.asList("Fluffy", "Cerberus", "Fang", "Mrs. Norris"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(8, "Which spell does Harry Potter use to disarm his opponents?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(9, "What is the name of the Weasley twins' joke shop?",
                Arrays.asList("Weasleys' Wizard Wheezes", "Zonko's Joke Shop", "Quality Quidditch Supplies", "Madam Malkins Robes"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(10, "What is the name of the magical currency used in the wizarding world?",
                Arrays.asList("Galleons", "Sickles", "Knuts", "Muggle Money"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(11, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(12, "Who is the Potions Master at Hogwarts?",
                Arrays.asList("Severus Snape", "Minerva McGonagall", "Rubeus Hagrid", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(13, "What is the name of the magical creature that guards the entrance to Hogwarts?",
                Arrays.asList("Three-headed Dog", "Troll", "Giant Squid", "Basilisk"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(14, "What is the name of the magical object used to communicate over long distances?",
                Arrays.asList("Owl", "Marauder's Map", "Time-Turner", "Pensieve"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(15, "What is the name of the wizarding newspaper?",
                Arrays.asList("Daily Prophet", "Evening Post", "Quibbler", "Hogwarts Gazette"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(16, "What is the name of the magical sport played on broomsticks?",
                Arrays.asList("Quidditch", "Gobstones", "Wizard's Chess", "Exploding Snap"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(17, "Who is the Keeper of the Keys at Hogwarts?",
                Arrays.asList("Rubeus Hagrid", "Argus Filch", "Minerva McGonagall", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(18, "What is the name of the magical creature that resembles a large, black dog?",
                Arrays.asList("Dementor", "Boggart", "Werewolf", "Thestral"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(19, "What is the name of the magical place where wizards and witches buy their supplies?",
                Arrays.asList("Diagon Alley", "Knockturn Alley", "Hogsmeade", "Godric's Hollow"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(20, "What is the name of the spell used to unlock doors?",
                Arrays.asList("Alohomora", "Expelliarmus", "Wingardium Leviosa", "Accio"),
                0));


        harryPotterQuizList.add(new HarryPotterQuiz(21, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(22, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Sorcerer's Stone?",
                Arrays.asList("Quirinus Quirrell", "Gilderoy Lockhart", "Severus Snape", "Mad-Eye Moody"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(23, "What is the name of the magical creature that resembles a large, black, winged horse?",
                Arrays.asList("Hippogriff", "Thestral", "Centaur", "Unicorn"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(24, "What is the name of the magical tournament for students from the three wizarding schools?",
                Arrays.asList("Triwizard Tournament", "Quidditch World Cup", "Hogwarts House Cup", "Goblet of Fire"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(25, "What is the name of the magical object that shows the layout of Hogwarts?",
                Arrays.asList("Marauder's Map", "Mirror of Erised", "Time-Turner", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(26, "What is the name of the magical creature that can change its appearance?",
                Arrays.asList("Boggart", "Dementor", "Werewolf", "Polyjuice Potion"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(27, "What is the name of the spell used to levitate objects?",
                Arrays.asList("Wingardium Leviosa", "Accio", "Levitation Charm", "Everte Statum"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(28, "What is the name of the magical creature that resembles a large, hairy spider?",
                Arrays.asList("Acromantula", "Centaur", "Grindylow", "Doxy"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(29, "What is the name of the magical shop that sells joke items?",
                Arrays.asList("Zonko's Joke Shop", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Flourish and Blotts"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(30, "What is the name of the magical creature that is half-human and half-goat?",
                Arrays.asList("Centaur", "Goblin", "House-Elf", "Veela"),
                0));


        harryPotterQuizList.add(new HarryPotterQuiz(31, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(32, "Who is the caretaker of Hogwarts?",
                Arrays.asList("Argus Filch", "Rubeus Hagrid", "Norbert", "Mrs. Norris"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(33, "What is the name of the magical object that shows a person's deepest desires?",
                Arrays.asList("Mirror of Erised", "Marauder's Map", "Time-Turner", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(34, "What is the name of the magical creature that resembles a small, mischievous fairy?",
                Arrays.asList("Pixie", "Dobby", "House-Elf", "Centaur"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(35, "What is the name of the magical place where wizards and witches buy their pets?",
                Arrays.asList("Madam Puddifoot's Tea Shop", "Magical Menagerie", "Gringotts Wizarding Bank", "Flourish and Blotts"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(36, "What is the name of the spell used to summon objects?",
                Arrays.asList("Accio", "Lumos", "Alohomora", "Expelliarmus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(37, "What is the name of the magical creature that resembles a large, squid-like creature?",
                Arrays.asList("Giant Squid", "Grindylow", "Merperson", "Kraken"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(38, "What is the name of the magical shop that sells quills and parchment?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(39, "What is the name of the magical creature that is a shape-shifter?",
                Arrays.asList("Boggart", "Dementor", "Werewolf", "Polyjuice Potion"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(40, "What is the name of the magical object that allows time travel?",
                Arrays.asList("Time-Turner", "Hourglass of Hermione", "Reliqua Death", "Resurrection Stone"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(41, "What is the name of the Hogwarts house for the ambitious and cunning?",
                Arrays.asList("Slytherin", "Gryffindor", "Hufflepuff", "Ravenclaw"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(42, "Who is the Herbology teacher at Hogwarts?",
                Arrays.asList("Pomona Sprout", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(43, "What is the name of the magical object that can turn invisible?",
                Arrays.asList("Invisibility Cloak", "Marauder's Map", "Time-Turner", "Mirror of Erised"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(44, "What is the name of the magical creature that resembles a small, winged reptile?",
                Arrays.asList("Doxy", "Pixie", "Centaur", "Goblin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(45, "What is the name of the magical shop that sells magical pets?",
                Arrays.asList("Magical Menagerie", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank", "Flourish and Blotts"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(46, "What is the name of the spell used to produce light?",
                Arrays.asList("Lumos", "Accio", "Alohomora", "Expelliarmus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(47, "What is the name of the magical creature that resembles a large, slimy creature?",
                Arrays.asList("Grindylow", "Giant Squid", "Merperson", "Kraken"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(48, "What is the name of the magical shop that sells robes and uniforms?",
                Arrays.asList("Madam Malkins Robes", "Flourish and Blotts", "Weasleys' Wizard Wheezes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(49, "What is the name of the magical creature that is a shape-shifter?",
                Arrays.asList("Boggart", "Dementor", "Werewolf", "Polyjuice Potion"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(50, "What is the name of the magical object that allows communication with the dead?",
                Arrays.asList("Resurrection Stone", "Elder Wand", "Philosopher's Stone", "Hallows"),
                0));

        // Adding questions 51 to 60
        harryPotterQuizList.add(new HarryPotterQuiz(51, "What is the name of the Hogwarts house for the fair and just?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(52, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(53, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(54, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(55, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(56, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(57, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(58, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(59, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(60, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 61 to 70
        harryPotterQuizList.add(new HarryPotterQuiz(61, "What is the name of the Hogwarts house for the adventurous and daring?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(62, "Who is the Transfiguration teacher at Hogwarts?",
                Arrays.asList("Minerva McGonagall", "Rubeus Hagrid", "Severus Snape", "Pomona Sprout"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(63, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(64, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(65, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(66, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(67, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(68, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(69, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(70, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 71 to 80
        harryPotterQuizList.add(new HarryPotterQuiz(71, "What is the name of the Hogwarts house for the wise and curious?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(72, "Who is the Astronomy teacher at Hogwarts?",
                Arrays.asList("Professor Aurora Sinistra", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(73, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(74, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(75, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(76, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(77, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(78, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(79, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(80, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 81 to 90
        harryPotterQuizList.add(new HarryPotterQuiz(81, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(82, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(83, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(84, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(85, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(86, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(87, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(88, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(89, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(90, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 91 to 100
        harryPotterQuizList.add(new HarryPotterQuiz(91, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(92, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(93, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(94, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(95, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(96, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(97, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(98, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(99, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(100, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));


// Adding questions 101 to 110
        harryPotterQuizList.add(new HarryPotterQuiz(101, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(102, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(103, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(104, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(105, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(106, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(107, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(108, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(109, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(110, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 111 to 120
        harryPotterQuizList.add(new HarryPotterQuiz(111, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(112, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Half-Blood Prince?",
                Arrays.asList("Severus Snape", "Horace Slughorn", "Quirinus Quirrell", "Gilderoy Lockhart"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(113, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(114, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(115, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(116, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(117, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(118, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(119, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(120, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 121 to 130
        harryPotterQuizList.add(new HarryPotterQuiz(121, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(122, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Deathly Hallows?",
                Arrays.asList("Kingsley Shacklebolt", "Severus Snape", "Voldemort", "Bellatrix Lestrange"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(123, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(124, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(125, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(126, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(127, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(128, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(129, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(130, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 131 to 140
        harryPotterQuizList.add(new HarryPotterQuiz(131, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(132, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(133, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(134, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(135, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(136, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(137, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(138, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(139, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(140, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        // Adding questions 141 to 150
        harryPotterQuizList.add(new HarryPotterQuiz(141, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(142, "Who is the Care of Magical Creatures teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(143, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(144, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(145, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(146, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(147, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(148, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(149, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(150, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 151 to 160
        harryPotterQuizList.add(new HarryPotterQuiz(151, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(152, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(153, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(154, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(155, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(156, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(157, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(158, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(159, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(160, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

// Adding questions 161 to 170
        harryPotterQuizList.add(new HarryPotterQuiz(161, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(162, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(163, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(164, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(165, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(166, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(167, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(168, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(169, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(170, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(171, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(172, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Half-Blood Prince?",
                Arrays.asList("Severus Snape", "Horace Slughorn", "Quirinus Quirrell", "Gilderoy Lockhart"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(173, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(174, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(175, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(176, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(177, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(178, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(179, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                3));

        harryPotterQuizList.add(new HarryPotterQuiz(180, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(181, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(182, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Deathly Hallows?",
                Arrays.asList("Kingsley Shacklebolt", "Severus Snape", "Voldemort", "Bellatrix Lestrange"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(183, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(184, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(185, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(186, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(187, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(188, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(189, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                3));

        harryPotterQuizList.add(new HarryPotterQuiz(190, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(191, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(192, "Who is the Herbology teacher at Hogwarts?",
                Arrays.asList("Pomona Sprout", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(193, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(194, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(195, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(196, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(197, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(198, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(199, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                3));

        harryPotterQuizList.add(new HarryPotterQuiz(200, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(201, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(202, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(203, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(204, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(205, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(206, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(207, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(208, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(209, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(210, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(211, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(212, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));
        harryPotterQuizList.add(new HarryPotterQuiz(213, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(214, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));
        harryPotterQuizList.add(new HarryPotterQuiz(215, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(216, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(217, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(218, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(219, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));
        harryPotterQuizList.add(new HarryPotterQuiz(220, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));





        // More new quiz questions
        harryPotterQuizList.add(new HarryPotterQuiz(221, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(222, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(223, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(224, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(225, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(226, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(227, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(228, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(229, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(230, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        // Additional new quiz questions
        harryPotterQuizList.add(new HarryPotterQuiz(231, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(232, "Who is the Care of Magical Creatures teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(233, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(234, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(235, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(236, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(237, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(238, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(239, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(240, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));


        harryPotterQuizList.add(new HarryPotterQuiz(241, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(242, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));
        harryPotterQuizList.add(new HarryPotterQuiz(243, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(244, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));
        harryPotterQuizList.add(new HarryPotterQuiz(245, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(246, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(247, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(248, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));
        harryPotterQuizList.add(new HarryPotterQuiz(249, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));
        harryPotterQuizList.add(new HarryPotterQuiz(250, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));



        // Final set of new quiz questions
        harryPotterQuizList.add(new HarryPotterQuiz(251, "What is the name of the Hogwarts house for the ambitious and cunning?",
                Arrays.asList("Slytherin", "Gryffindor", "Hufflepuff", "Ravenclaw"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(252, "Who is the Potions Master at Hogwarts?",
                Arrays.asList("Severus Snape", "Minerva McGonagall", "Rubeus Hagrid", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(253, "What is the name of the magical creature that guards the entrance to Hogwarts?",
                Arrays.asList("Three-headed Dog", "Troll", "Giant Squid", "Basilisk"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(254, "What is the name of the magical object used to communicate over long distances?",
                Arrays.asList("Owl", "Marauder's Map", "Time-Turner", "Pensieve"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(255, "What is the name of the wizarding newspaper?",
                Arrays.asList("Daily Prophet", "Evening Post", "Quibbler", "Hogwarts Gazette"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(256, "What is the name of the magical sport played on broomsticks?",
                Arrays.asList("Quidditch", "Gobstones", "Wizard's Chess", "Exploding Snap"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(257, "Who is the Keeper of the Keys at Hogwarts?",
                Arrays.asList("Rubeus Hagrid", "Argus Filch", "Minerva McGonagall", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(258, "What is the name of the magical creature that resembles a large, black dog?",
                Arrays.asList("Dementor", "Boggart", "Werewolf", "Thestral"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(259, "What is the name of the magical place where wizards and witches buy their supplies?",
                Arrays.asList("Diagon Alley", "Knockturn Alley", "Hogsmeade", "Godric's Hollow"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(260, "What is the name of the spell used to unlock doors?",
                Arrays.asList("Alohomora", "Expelliarmus", "Wingardium Leviosa", "Accio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(261, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(262, "Who is the Potions Master at Hogwarts?",
                Arrays.asList("Severus Snape", "Minerva McGonagall", "Rubeus Hagrid", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(263, "What is the name of the magical creature that guards the entrance to Hogwarts?",
                Arrays.asList("Three-headed Dog", "Troll", "Giant Squid", "Basilisk"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(264, "What is the name of the magical object used to communicate over long distances?",
                Arrays.asList("Owl", "Marauder's Map", "Time-Turner", "Pensieve"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(265, "What is the name of the wizarding newspaper?",
                Arrays.asList("Daily Prophet", "Evening Post", "Quibbler", "Hogwarts Gazette"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(266, "What is the name of the magical sport played on broomsticks?",
                Arrays.asList("Quidditch", "Gobstones", "Wizard's Chess", "Exploding Snap"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(267, "Who is the Keeper of the Keys at Hogwarts?",
                Arrays.asList("Rubeus Hagrid", "Argus Filch", "Minerva McGonagall", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(268, "What is the name of the magical creature that resembles a large, black dog?",
                Arrays.asList("Dementor", "Boggart", "Werewolf", "Thestral"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(269, "What is the name of the magical place where wizards and witches buy their supplies?",
                Arrays.asList("Diagon Alley", "Knockturn Alley", "Hogsmeade", "Godric's Hollow"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(270, "What is the name of the spell used to unlock doors?",
                Arrays.asList("Alohomora", "Expelliarmus", "Wingardium Leviosa", "Accio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(271, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(272, "Who is the Potions Master at Hogwarts?",
                Arrays.asList("Severus Snape", "Minerva McGonagall", "Rubeus Hagrid", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(273, "What is the name of the magical creature that guards the entrance to Hogwarts?",
                Arrays.asList("Three-headed Dog", "Troll", "Giant Squid", "Basilisk"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(274, "What is the name of the magical object used to communicate over long distances?",
                Arrays.asList("Owl", "Marauder's Map", "Time-Turner", "Pensieve"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(275, "What is the name of the wizarding newspaper?",
                Arrays.asList("Daily Prophet", "Evening Post", "Quibbler", "Hogwarts Gazette"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(276, "What is the name of the magical sport played on broomsticks?",
                Arrays.asList("Quidditch", "Gobstones", "Wizard's Chess", "Exploding Snap"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(277, "Who is the Keeper of the Keys at Hogwarts?",
                Arrays.asList("Rubeus Hagrid", "Argus Filch", "Minerva McGonagall", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(278, "What is the name of the magical creature that resembles a large, black dog?",
                Arrays.asList("Dementor", "Boggart", "Werewolf", "Thestral"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(279, "What is the name of the magical place where wizards and witches buy their supplies?",
                Arrays.asList("Diagon Alley", "Knockturn Alley", "Hogsmeade", "Godric's Hollow"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(280, "What is the name of the spell used to unlock doors?",
                Arrays.asList("Alohomora", "Expelliarmus", "Wingardium Leviosa", "Accio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(281, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(282, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(283, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(284, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(285, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(286, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(287, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(288, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(289, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(290, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(291, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(292, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(293, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(294, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(295, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(296, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(297, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(298, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(299, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(300, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(301, "What is the name of the Hogwarts house for the ambitious and cunning?",
                Arrays.asList("Slytherin", "Gryffindor", "Hufflepuff", "Ravenclaw"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(302, "Who is the Potions Master at Hogwarts?",
                Arrays.asList("Severus Snape", "Minerva McGonagall", "Rubeus Hagrid", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(303, "What is the name of the magical creature that guards the entrance to Hogwarts?",
                Arrays.asList("Three-headed Dog", "Troll", "Giant Squid", "Basilisk"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(304, "What is the name of the magical object used to communicate over long distances?",
                Arrays.asList("Owl", "Marauder's Map", "Time-Turner", "Pensieve"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(305, "What is the name of the wizarding newspaper?",
                Arrays.asList("Daily Prophet", "Evening Post", "Quibbler", "Hogwarts Gazette"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(306, "What is the name of the magical sport played on broomsticks?",
                Arrays.asList("Quidditch", "Gobstones", "Wizard's Chess", "Exploding Snap"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(307, "Who is the Keeper of the Keys at Hogwarts?",
                Arrays.asList("Rubeus Hagrid", "Argus Filch", "Minerva McGonagall", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(308, "What is the name of the magical creature that resembles a large, black dog?",
                Arrays.asList("Dementor", "Boggart", "Werewolf", "Thestral"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(309, "What is the name of the magical place where wizards and witches buy their supplies?",
                Arrays.asList("Diagon Alley", "Knockturn Alley", "Hogsmeade", "Godric's Hollow"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(310, "What is the name of the spell used to unlock doors?",
                Arrays.asList("Alohomora", "Expelliarmus", "Wingardium Leviosa", "Accio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(311, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(312, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(313, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(314, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(315, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(316, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(317, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(318, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(319, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(320, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(321, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(322, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(323, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(324, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(325, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(326, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(327, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(328, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(329, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(330, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(331, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(332, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(333, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(334, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(335, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(336, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(337, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(338, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(339, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(340, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(341, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(342, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(343, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(344, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(345, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(346, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(347, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(348, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(349, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(350, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(351, "What is the name of the three-headed dog guarding the Philosopher's Stone?",
                Arrays.asList("Fluffy", "Cerberus", "Fang", "Mrs. Norris"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(352, "Which spell does Harry Potter use to disarm his opponents?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(353, "What is the name of the Weasley twins' joke shop?",
                Arrays.asList("Weasleys' Wizard Wheezes", "Zonko's Joke Shop", "Quality Quidditch Supplies", "Madam Malkins Robes"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(354, "What is the name of the magical currency used in the wizarding world?",
                Arrays.asList("Galleons", "Sickles", "Knuts", "Muggle Money"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(355, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(356, "Who is the Potions Master at Hogwarts?",
                Arrays.asList("Severus Snape", "Minerva McGonagall", "Rubeus Hagrid", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(357, "What is the name of the magical creature that guards the entrance to Hogwarts?",
                Arrays.asList("Three-headed Dog", "Troll", "Giant Squid", "Basilisk"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(358, "What is the name of the magical object used to communicate over long distances?",
                Arrays.asList("Owl", "Marauder's Map", "Time-Turner", "Pensieve"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(359, "What is the name of the wizarding newspaper?",
                Arrays.asList("Daily Prophet", "Evening Post", "Quibbler", "Hogwarts Gazette"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(360, "What is the name of the magical sport played on broomsticks?",
                Arrays.asList("Quidditch", "Gobstones", "Wizard's Chess", "Exploding Snap"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(361, "Who is the Keeper of the Keys at Hogwarts?",
                Arrays.asList("Rubeus Hagrid", "Argus Filch", "Minerva McGonagall", "Albus Dumbledore"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(362, "What is the name of the magical creature that resembles a large, black dog?",
                Arrays.asList("Dementor", "Boggart", "Werewolf", "Thestral"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(363, "What is the name of the magical place where wizards and witches buy their supplies?",
                Arrays.asList("Diagon Alley", "Knockturn Alley", "Hogsmeade", "Godric's Hollow"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(364, "What is the name of the spell used to unlock doors?",
                Arrays.asList("Alohomora", "Expelliarmus", "Wingardium Leviosa", "Accio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(365, "What is the name of the Hogwarts house for the clever and wise?",
                Arrays.asList("Ravenclaw", "Gryffindor", "Hufflepuff", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(366, "Who is the Divination teacher in Harry Potter and the Order of the Phoenix?",
                Arrays.asList("Professor Sybill Trelawney", "Minerva McGonagall", "Rubeus Hagrid", "Severus Snape"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(367, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(368, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(369, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(370, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(371, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(372, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(373, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(374, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(375, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(376, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(377, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(378, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(379, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(380, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(381, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(382, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(383, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(384, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(385, "What is the name of the Hogwarts house for the brave and chivalrous?",
                Arrays.asList("Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(386, "Who is the Defense Against the Dark Arts teacher in Harry Potter and the Goblet of Fire?",
                Arrays.asList("Mad-Eye Moody", "Barty Crouch Jr.", "Alastor Moody", "Quirinus Quirrell"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(387, "What is the name of the magical object that can turn people into animals?",
                Arrays.asList("Polyjuice Potion", "Truth Serum", "Revealing Charm", "Riddikulus"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(388, "What is the name of the magical creature that resembles a small, furry creature with wings?",
                Arrays.asList("Pixie", "Dobby", "Puffskeen", "Centaur"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(389, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(390, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(391, "What is the name of the magical creature that resembles a large, horned lizard?",
                Arrays.asList("Basilisk", "Grindylow", "Puffskeen", "Horned Serpent"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(392, "What is the name of the magical shop that sells quills and ink?",
                Arrays.asList("Flourish and Blotts", "Weasleys' Wizard Wheezes", "Madam Malkins Robes", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(393, "What is the name of the magical creature that can turn into a human?",
                Arrays.asList("Werewolf", "Boggart", "Dementor", "Metamorphmagus"),
                2));

        harryPotterQuizList.add(new HarryPotterQuiz(394, "What is the name of the magical object that is a powerful wand?",
                Arrays.asList("Elder Wand", "Resurrection Stone", "Philosopher's Stone", "Invisibility Cloak"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(395, "What is the name of the Hogwarts house for the loyal and hardworking?",
                Arrays.asList("Hufflepuff", "Gryffindor", "Ravenclaw", "Slytherin"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(396, "Who is the Care of Magical Creatures teacher in Harry Potter and the Prisoner of Azkaban?",
                Arrays.asList("Rubeus Hagrid", "Remus Lupin", "Norbert", "Sirius Black"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(397, "What is the name of the magical object that allows one to see through illusions?",
                Arrays.asList("Truth Serum", "Revealing Charm", "Riddikulus", "Protego"),
                1));

        harryPotterQuizList.add(new HarryPotterQuiz(398, "What is the name of the magical creature that resembles a small, mischievous imp?",
                Arrays.asList("Pixie", "Dobby", "Goblin", "Banshee"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(399, "What is the name of the magical shop that sells telescopes and binoculars?",
                Arrays.asList("Optikle Eye Emporium", "Quality Quidditch Supplies", "Madam Puddifoot's Tea Shop", "Gringotts Wizarding Bank"),
                0));

        harryPotterQuizList.add(new HarryPotterQuiz(400, "What is the name of the spell used to disarm an opponent?",
                Arrays.asList("Expelliarmus", "Avada Kedavra", "Crucio", "Imperio"),
                0));

        return harryPotterQuizList;


    }

}

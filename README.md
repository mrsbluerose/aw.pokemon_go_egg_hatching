# pokemon_go_egg_hatching
This app helps a user determine when to place their Pokemon Go eggs in incubators in order to hatch them all at the same time. Doing so can help increase the player's XP gain by timing all the hatching with a luck egg XP bonus or special event bonus. The three main options include: displaying a reference table with or without event multipliers, calculating an individual egg hatch time and calculating an egg-placement plan based on the user's current inventory.

Currently, this project is meant for personal use and is serving as a demonstration of my coding.

## UML
See the UML in Lucid Charts: https://www.lucidchart.com/documents/view/def855a9-35b9-4e39-be51-bd205437b060/0_0

## Status
In the works: Charted Plan class calculations (determining whether to use data structures or classes)

Problem: Current user input (scanner input) results in several user prompts (impractical and verbose). The original plan was to complete each version of the program and move on to the next (demonstrating basic input, Swing GUI, File I/O and LAMP). I may branch off the basic input now and incorporate the Swing interface to avoid wasted coding on user prompts.

### Future expansion:
Incorporate Swing interface to reduce user prompts and improve data validation  
Expansion progress:  
*Added initial menu  
*Added display menu options: get event multiplier and incubator preference  
*4/27 - determined the code needs refactoring to create a current list of egg and incubator types. This would eliminate the need for separate classes for each egg and incubator type and allow for easier, more centralized updating as the game adds new options. Plan to refactor code to work with this new format before proceeding with the GUI.  

## Getting Started
These options will help you set up the program in your local environment. Currently, this only runs in an IDE.


### Prerequisites
No prerequisites other than having an IDE set for Java


### Installing
1. Create a project called pokemon_go_egg_hatching
2. Import the src/pokemongoeggs file 


## Running Tests
No incorporated testing at this time (other than print statements)
User input errors not handled. Will be incorporating Swing GUI to enforce data validation.


## Contributing
No outside contributing at this time.


## Versioning
Original version in progress.
Future expansion: incorporate Swing GUI


## Authors 
@Audra


## Acknowledgments


# Lab2
THE PROBLEM
A table that consists of 200 rows and 4 columns needs certain proccessing done to it. It needs to be alphabetized and reptitions to be dealt with. Using the column "Artist" any repeated artist should be instead represented by printing the name once along with a counter of how many times it appears in the original list.
THE SOLUTION
The three operations done to the full list are very different in nature. Each requiring its own loop size and require 'break' statments on different conditions. For this reason I implemented many for loops, each dealing specifically with a manipulation. This approach is very likely not the most efficient.
All printing is done in a .txt file titled "Artists-WeekOf09052020", found in this repository.
After intial run, program requires no interaction.
The original file has 200 rows. Even though I alotted enough space in the arrays the scanner will only reads in 70 rows. In the for loops the range is set to 70 this is not a mistake, any more and I recieve a "No such element Exception". However with those 70 rows all oprations run smoothly.  

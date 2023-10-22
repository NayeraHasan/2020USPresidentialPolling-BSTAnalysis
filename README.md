# 2020USPresidential-Polling-BSTAnalysis
This project focuses on analyzing polling data for the 2020 U.S. presidential election. Utilizing a binary search tree, the software processes polling data from CSV files to determine the support percentage for each Democratic candidate.

Table of Contents
Overview
The Input
Classes
Candidate Class
LinkedBinarySearchTree Class
Main Class
CSVReader Class
BinarySearchTreeTest Class
Overview
The project emphasizes:

Reading CSV files containing polling data for presidential primary candidates.
Storing and updating candidate data in a binary search tree.
Displaying the tree in pre-, in-, and post-orders.
The Input
The polling data is sourced from CSV files, each representing a different poll. The files contain the candidate's last name, full name, and their polling percentage.

Classes
Candidate Class
Functionality: Represents a candidate with their polling data.

Attributes:

Last name of the candidate.
Full name of the candidate.
Polling percentage.
Methods:

getLastName(): Returns the candidate's last name.
getFullName(): Returns the candidate's full name.
getPct(): Returns the candidate's polling percentage.
setPct(double pct): Sets the polling percentage for the candidate.
compareTo(Candidate other): Compares candidates based on their last name.
toString(): Returns a string representation of the candidate.
LinkedBinarySearchTree Class
Functionality: Implements a binary search tree for storing candidate data.

Attributes:

Root element of the tree.
Left subtree.
Right subtree.
Count of elements in the tree.
Methods:

insert(E element): Inserts an element into the tree.
getRootElement(): Returns the root element.
isEmpty(): Checks if the tree is empty.
size(): Returns the number of elements in the tree.
contains(E element): Checks if an element exists in the tree.
toString(): Returns a string representation of the tree.
toStringPreOrder(), toStringInOrder(), toStringPostOrder(): Return string representations of the tree in different orders.
Main Class
Functionality: Entry point for reading CSV files and populating the binary search tree.

Methods:

main(String[] args): Reads CSV files, processes candidate data, and populates the binary search tree.
CSVReader Class
Functionality: Reads data from a CSV file and returns it as an ArrayList of String arrays.

Methods:

read(FileReader csvFile): Reads the CSV file and returns an ArrayList of String arrays.
close(): Closes the BufferedReader.
BinarySearchTreeTest Class
Functionality: Contains methods to test the functionality of the binary search tree.

Methods:

main(String[] args): Entry point for testing.
testInteger(BinarySearchTree<Integer> initiallyEmptyIntTree): Tests integer-based tree operations.
testCharacter(BinarySearchTree<Character> initiallyEmptyCharacterTree): Tests character-based tree operations.

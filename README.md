# Unit 3 - Data for Social Good Project 

## Introduction 

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need. 

## Requirements 

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program: 
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors. 
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about. 
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs. 
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset). 
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions. 

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 
As a DJ, I want to be informed about the hottest artists on the Spotify charts so that I can figure out what songs to play at parties, clubs and other events to get the crowd hyped. 



## Dataset 

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type. 


Example: 

Dataset: https://docs.google.com/spreadsheets/d/1Bjbfyuz2D5UBWrMT2D_0bOst5gY9KHu1zc_ieWNELWU/edit?gid=1931045827#gid=1931045827 
- **Track** (String) - name of the track
- **Artists** (String) - name of artist
- **Popularity** (int) - popularity rank in numbers 

## UML Diagram 

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README. 

![UML Diagram for my project](nameOfImageFileHere.png) 

## Description 

Write a description of your project here. In your description, include as many vocab words from our class to explain your User Story, the chosen dataset and how your project addressed that users goals. If your project used the Scanner class for user input, explain how the user will interact with your project.

Our project informs DJ's on the hottest trending artists and songs on Spotify in order to figure out what songs the crowd would enjoy. The dataset includes TrackName.txt which has the names of the popular tracks. artists.txt which provides the lists of artists with each track. popularity.txt which provides a popularity rank for each song. These files are used in order to create instances of the TopSongs class where each TopSongs object represents a song, artist and popularity rank. The MusicProduction Class will manage the data through reading the files and intializing TopSongs objects through mostPopular, artistTopSongs, countArtists, and displayArtistCount. The user interaction allows for user's to input an artist's name which can allow the user to have an interactive experince to figure out what artist names were shown frequently on the charts. By creating this app, we allow for DJ's to access the most popular songs and artists effiecently. This will ultimately help DJ's to create the most engaging playlists for any event. 
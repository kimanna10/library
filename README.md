# library
lab6

# Library system
Entities: Library, Client, Book, Author, Genre

# Relationship 
Many to Many: { Book & Genre, Author & Book }
One to Many: { Book & Library, Client Library }

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

    }
}
//Game tetris = new Game(); use new keyword or is initialized as null
// Game darts = new Game(501);
class Contact{
    String name;
    String emai;
    String phoneNumber;
}

class ContactsManager{
    // Fields
    Contact [] myFriends;
    int friendsCount;
    //constructor
    ContactsManager(){
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }
    Contact searchContact(String searchName){
        for (int i = 0; i < friendsCount; i++){
            if (myFriends[i].name.equals(searchName)){
                return  myFriends[i];
            }
        }return null;
    }
}












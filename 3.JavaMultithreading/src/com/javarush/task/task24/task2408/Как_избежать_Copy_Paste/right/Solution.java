package com.javarush.task.task24.task2408.Как_избежать_Copy_Paste.right;

import java.util.List;

/*
Как избежать Copy+Paste
*/

public class Solution {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}

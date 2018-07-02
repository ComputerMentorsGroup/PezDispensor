package org.computermentors.chriswillingham.pezdispensor;

public class PezDispenser {
    final private String characterName;
    public static final int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String characterName){
        this.characterName = characterName;
        pezCount = 0;
    }

    public void fill(){
        pezCount = MAX_PEZ;
    }

    public void fill(int pezAmount){
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ){
            throw new IllegalArgumentException("Too may PEZ!!!");
        }
        pezCount = newAmount;
    }

    public boolean dispense(){
        boolean wasDispensed = false;
        if (!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public String getCharacterName() {
        return characterName;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }
}

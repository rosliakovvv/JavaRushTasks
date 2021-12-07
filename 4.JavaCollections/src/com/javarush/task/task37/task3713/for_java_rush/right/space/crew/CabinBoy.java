package com.javarush.task.task37.task3713.for_java_rush.right.space.crew;

public class CabinBoy extends AbstractCrewMember {
    public CabinBoy(AbstractCrewMember.CompetencyLevel competencyLevel) {
        this.competencyLevel = competencyLevel;
    }

    protected void doTheJob(String request) {
        System.out.println("Even the cabin boy can handle the request " + request);
    }
}

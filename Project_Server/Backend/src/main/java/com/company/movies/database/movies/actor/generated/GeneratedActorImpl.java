package com.company.movies.database.movies.actor.generated;

import com.company.movies.database.movies.actor.Actor;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.movies.database.movies.actor.Actor}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedActorImpl implements Actor {
    
    private String actorId;
    private String firstName;
    private String surname;
    private byte[] picture;
    
    protected GeneratedActorImpl() {
        
    }
    
    @Override
    public String getActorId() {
        return actorId;
    }
    
    @Override
    public Optional<String> getFirstName() {
        return Optional.ofNullable(firstName);
    }
    
    @Override
    public Optional<String> getSurname() {
        return Optional.ofNullable(surname);
    }
    
    @Override
    public Optional<byte[]> getPicture() {
        return Optional.ofNullable(picture);
    }
    
    @Override
    public Actor setActorId(String actorId) {
        this.actorId = actorId;
        return this;
    }
    
    @Override
    public Actor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public Actor setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    
    @Override
    public Actor setPicture(byte[] picture) {
        this.picture = picture;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("actorId = "   + Objects.toString(getActorId()));
        sj.add("firstName = " + Objects.toString(OptionalUtil.unwrap(getFirstName())));
        sj.add("surname = "   + Objects.toString(OptionalUtil.unwrap(getSurname())));
        sj.add("picture = "   + Objects.toString(OptionalUtil.unwrap(getPicture())));
        return "ActorImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Actor)) { return false; }
        final Actor thatActor = (Actor)that;
        if (!Objects.equals(this.getActorId(), thatActor.getActorId())) {return false; }
        if (!Objects.equals(this.getFirstName(), thatActor.getFirstName())) {return false; }
        if (!Objects.equals(this.getSurname(), thatActor.getSurname())) {return false; }
        if (!Objects.equals(this.getPicture(), thatActor.getPicture())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getActorId());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getSurname());
        hash = 31 * hash + Objects.hashCode(getPicture());
        return hash;
    }
}
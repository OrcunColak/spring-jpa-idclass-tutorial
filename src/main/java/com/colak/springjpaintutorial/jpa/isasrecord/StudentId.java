package com.colak.springjpaintutorial.jpa.isasrecord;

// When Hibernate instantiate a new IdClass record, its default EmbeddableInstantiator assigns the values of
// the primary key attributes in the alphabetical order of their attribute names.
//
// Therefore, if the attributes of the record are not arranged in alphabetical order, the mapping between the record class attributes and
// the primary key attributes assigned by the EmbeddableInstantiator will be misaligned.
// This will cause the findById method to function incorrectly.
public record StudentId(String address,
                        Integer age,
                        String name
) {
}
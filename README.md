# Read Me First

The original idea is from  
https://medium.com/jpa-java-persistence-api-guide/hibernate-composite-primary-keys-with-embeddable-and-idclass-73ad3fcbc7cc

Spring Data JPA provides 2 ways to create a composite primary key:

1. using @IdClass and @Id annotations
2. using @Embeddable and @EmbeddedId annotations

This project demonstrates using @IdClass and @Id annotations

# @EmbeddedId vs @IdClass

The choice between @Embeddable/@EmbeddedId and @IdClass depends on the specific situation and developer preferences. The
first approach allows treating the composite key as a separate object, which can be beneficial for maintaining code
cleanliness. The second approach might be simpler to use, especially if the composite key is used in multiple entities.

# @IdClass as Record

The original idea is from  
https://levelup.gitconnected.com/uncover-the-mystery-what-makes-hibernate-6-truly-magical-b212495d2ba4

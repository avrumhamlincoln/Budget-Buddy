Main.class: Main.java User.class PersonalUser.class HouseholdUser.class PersonalTracker.class Transaction.class
	javac -g Main.java

HouseholdUser.class: HouseholdUser.java User.class PersonalTracker.class Transaction.class
	javac -g HouseholdUser.java

PersonalUser.class: PersonalUser.java User.class PersonalTracker.class Transaction.class
	javac -g PersonalUser.java

User.class: User.java HasMenu.class PersonalTracker.class
	javac -g User.java

PersonalTracker.class: PersonalTracker.java Transaction.class
	javac -g PersonalTracker.java

Transaction.class: Transaction.java HasMenu.class
	javac -g Transaction.java

HasMenu.class: HasMenu.java
	javac -g HasMenu.java

run: Main.class
	java Main

clean:
	rm *.class


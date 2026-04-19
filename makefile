Main.class: Main.java PersonalTracker.class Transaction.class
	javac -g Main.java

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


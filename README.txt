MethodBuilder.java README

Copyright Joshua Supelana-Mix 07-11-2020
This product is for private use only.
This product may not be modified, redistributed, sold, or used for any commercial purpose except by the copyright holder.

MethodBuilder v1.0
Program is designed to save the user time when designing classes with many private variables. Since OOP best-practices encourage making variables private and providing public access methods, classes with a large number of variables can be excrutiating to design and type out.

Program will output raw text to the console which can then be copy-and-pasted into the user's preferred IDE or editor. Output does not include tabs or spacing, though proper bracing is included. Tabs will need to be added by the user, though many IDEs make this a simple task (ctrl-A, ctrl-I on Eclipse IDE, for example).

Program outputs a simplistic form of class file, making all variables private, all methods public, and all methods named using the "get[VariableName]"/"set[VariableName]" naming convention. See "sphere.java" provided as an example. Any additional methods needed, or different access modifiers will need to be provided by the user.

First create the "variables.txt" file at your preferred location. The first line of the file must read:
CLASS [your one-word class name]
The following lines must contain a variable type and a one-word variable name, separated by a carriage-return. See "variables.txt" provided as an example.

In the .java file, assign the location of "variables.txt" to String "filePath". Run program, copy-and-paste the output into your .java file, and take a relaxing bath with all of your free-time.
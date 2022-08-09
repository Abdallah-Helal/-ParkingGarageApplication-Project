# ParkingGarageApplication-Project

Our Project for the Introduction to Software Engineering course taken during fall 2022 semester.
We Applied the Object-Oriented concepts (Abstraction, polymorphism, interfaces, packaging, …) and utilized Boundary, control and entity concepts as well as SOLID Principles and Design patterns to design the application using JAVA programming language.

## Garage System 
We used in this project singleton and strategy pattern 
we Applied the Object-Oriented concepts (Abstraction, Encapsulation, 
Polymorphism, Interfaces, …etc.) utilizing Boundary, control and entity concepts as well as SOLID 
Principles to design a Parking Garage application and  implement it
using an object-oriented programming language. This application manages a parking space for 
a configurable maximum number of vehicles. Each parking space (slot) defined with a dimension 
(width and depth) The application handle the following functions: 
- Each vehicle shall be identified by a model name, unique identification number, Model year 
and vehicle dimensions (vehicle width and depth).

- Park-in function that marks the arrival time of a vehicle if there is an available slot. The 
application shall capture such time automatically from the system.

- During the park-in function the application shall pick a free slot based on the active slot 
configuration. There are two configurations 
  - first come first served slots i.e., the park-in 
function will use the first free slot available from the parking garage slots. 
  - best-fit approach 
where you need to find the slot with the minimum dimension to hold the vehicle.

- Park-out function that marks the departure time of a vehicle from the garage. The application 
shall capture such time automatically from the system.

- Calculate the parking fees during the park-out based on the time-of-stay with an hourly rate 
of 5 EGP.

- Calculate the total income as well as the total number of vehicles that used the parking 
garage at any given point in time.

- Display the available parking slots 

Geometric Pattern Animation

## Overview

## Demo

[Watch the Geometric Pattern Animation](Screen%20Recording%202026-10-10%20161636.mp4)

Geometric Pattern Animation is a Java project that creates geometric designs by progressively drawing and rotating triangular shapes around a central point. Developed using the Code.org Theater library, the project combines mathematics, object-oriented programming, and visual animation.

## Features

- Procedural Pattern Generation: Creates geometric patterns using triangles arranged around a central point.
- Coordinate Rotation: Uses trigonometric functions to calculate the positions of rotated points.
- Progressive Animation: Reveals the pattern step by step across animation frames.
- Object-Oriented Design: Organizes geometric shapes and drawing operations into separate classes.
- Reusable Components: Uses shared methods and an abstract class to organize shape behavior.

## Technologies

- Java
- Code.org Theater Library
- Trigonometry
- Object-Oriented Programming (OOP)

## Project Structure

MyConsole.java: Initializes the scene, creates patterns, and plays the animation. 
Shape.java: Defines the abstract base class for geometric shapes.
Triangle.java: Draws and rotates large triangles.
SmallTriangle.java: Draws smaller triangles attached to the pattern.
CirclePattern.java: Generates the pattern by arranging triangles around a central point.
Utils.java: Provides coordinate rotation calculations.

## Concepts Demonstrated

- Abstract classes and inheritance
- Method overriding
- Classes, objects, and constructors
- Arrays and loops
- Coordinate transformations
- Sine, cosine, and angle calculations
- Animation and graphical drawing

## How It Works

The application creates several geometric patterns centered on a fixed point. Each pattern progressively draws triangles at different angles, using coordinate rotation calculations to position their vertices. The scene is then played as an animation through the Code.org Theater library.

The 'Utils' class calculates rotated coordinates using sine and cosine, while 'CirclePattern' controls how the triangles are arranged and revealed.

## Learning Objectives

This project provided hands-on experience combining mathematical concepts with Java programming. It helped me practice object-oriented design, coordinate transformations, reusable methods, and the creation of graphical animations.

## Future Improvements

- Allow users to customize pattern size, colors, and rotation count.
- Add more geometric shapes and pattern variations.
- Improve animation controls and drawing efficiency.
- Create additional designs using reusable geometric components.

## Project Background

This project was developed using Code.org as a programming exercise. It demonstrates my interest in combining programming, mathematics, and visual creativity to build interactive graphical experiences.

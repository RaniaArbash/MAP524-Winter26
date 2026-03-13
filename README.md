# Android Course Repository

Welcome to the Android Course GitHub repository.  
This repository contains Android Studio projects used during the course to demonstrate core Android development concepts, starting from the traditional View system (Java + XML) and transitioning to modern Android development with Jetpack Compose.

---

## Course Overview

This repository currently includes projects aligned with specific weeks of the course:

| Week | Topic |
|-----|------|
| Week 1 | Android Basics and Android Studio Introduction |
| Week 2 | Android Layouts and Resources |
| Week 3 | Adapters and List-Based Views |
| Week 4 | Intents and Activity Lifecycle |
| Week 5 | RecyclerView and Interface Listeners (ToDo List App) |
| Week 6 | MIDTERM TEST |
| Week 7 | Introduction to Jetpack Compose (Declarative UI) |
| Week 8 | ViewModel and State Management in Jetpack Compose |
| <span style="color:red;"><strong>Week 9</strong></span> | <span style="color:red;"><strong>Navigation and Scaffold in Jetpack Compose</strong></span> |

---

# Projects

---

## Week 1 — Android Fundamentals

This project introduces the basics of Android development and Android Studio.

Topics covered:
- Android Studio overview
- Project structure
- Activities
- Views and UI components
- Basic user interaction

Official documentation:
- Activities overview  
  https://developer.android.com/guide/components/activities/intro-activities

---

## Week 2 — Android Layouts and Resources

This project focuses on building user interfaces and working with Android resources using the traditional View system.

### Layouts Covered

- LinearLayout  
  https://developer.android.com/develop/ui/views/layout/linear

- RelativeLayout  
  https://developer.android.com/develop/ui/views/layout/relative

- ConstraintLayout  
  https://developer.android.com/develop/ui/views/layout/constraint-layout

- Declaring layouts in XML  
  https://developer.android.com/develop/ui/views/layout/declaring-layout

### Android Resources

Topics covered:
- String resources
- Supporting multiple languages (localization)
- Supporting landscape layouts

Official documentation:
- Providing resources  
  https://developer.android.com/guide/topics/resources/providing-resources

- Supporting multiple languages  
  https://developer.android.com/training/basics/supporting-devices/languages

---

## Week 3 — Adapters and List-Based Views

This project introduces list-based UI components in Android and explains how data is connected to views using adapters.

Topics covered:
- Adapter concept in Android
- ListView basics
- ArrayAdapter usage
- BaseAdapter for custom list items
- View recycling and performance basics

Official documentation and resources:
- ListView overview  
  https://developer.android.com/reference/android/widget/ListView

- ArrayAdapter  
  https://developer.android.com/reference/android/widget/ArrayAdapter

- BaseAdapter  
  https://developer.android.com/reference/android/widget/BaseAdapter

- Adapters and AdapterViews  
  https://developer.android.com/reference/android/widget/Adapter

---

## Week 4 — Intents and Activity Lifecycle

This project focuses on navigation between activities, communication using intents, and understanding how Android manages activity states.

### Intents in Android

Topics covered:
- Explicit intents
- Passing data between activities
- Retrieving intent extras

Official documentation:
- Intents and Intent Filters  
  https://developer.android.com/guide/components/intents-filters

---

### Activity Lifecycle

Topics covered:
- Activity lifecycle overview
- onCreate(), onStart(), onResume()
- onPause(), onStop(), onDestroy()
- Introduction to configuration changes

Official documentation:
- Activity lifecycle  
  https://developer.android.com/guide/components/activities/activity-lifecycle

---

### Camera and Media Capture

Topics covered:
- Opening the camera using an intent
- Capturing images
- Handling returned image data
- Required permissions (overview)

Official documentation:
- Camera via intent  
  https://developer.android.com/training/camera/photobasics

---

## Week 5 — RecyclerView and Interface Listeners  
### Project: ToDo List Application

Students built a complete ToDo List application using RecyclerView.

Topics covered:
- RecyclerView setup
- LayoutManager (LinearLayoutManager)
- Custom Adapter
- ViewHolder pattern
- Interface listeners for item click handling
- Dynamic UI updates

Official documentation:
- RecyclerView overview  
  https://developer.android.com/guide/topics/ui/layout/recyclerview

- RecyclerView.Adapter  
  https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.Adapter

---

# Week 7 — Introduction to Jetpack Compose (Modern Android UI)

This week introduces modern Android development using **Jetpack Compose**, the declarative UI toolkit for Android.

Official documentation:
- Jetpack Compose overview  
  https://developer.android.com/jetpack/compose

- Compose mental model  
  https://developer.android.com/jetpack/compose/mental-model

---

## Project 1 — Student Profile App (Java + XML)

Before learning Compose, we first built the Student Profile application using the traditional View system.

### Features Implemented:
- XML-based UI layout
- EditText inputs for name and age
- Button click handling
- Manual UI updates using setText()
- Manual visibility control using setVisibility()
- findViewById() for view binding

### Concepts Reinforced:
- Imperative UI programming
- Direct manipulation of views
- Separation between XML and Java
- Event listeners
- Activity lifecycle basics

This project demonstrates how UI is manually controlled step by step.

---

## Project 2 — Student Profile App (Jetpack Compose Version)

Then we rebuilt the exact same application using Jetpack Compose in Kotlin.

### Features Implemented:
- @Composable functions
- Column layout
- OutlinedTextField
- Button composable
- remember { mutableStateOf() }
- Conditional UI rendering using if statements
- Automatic recomposition

### Concepts Introduced:
- Declarative UI programming
- UI = function of state
- State-driven rendering
- Recomposition
- No XML
- No findViewById()
- No manual visibility control

This project highlights the transition from imperative to declarative UI programming.

---

## Week 8 — ViewModel and State Management in Jetpack Compose

This week focuses on **Jetpack Compose state management** using **ViewModel** and introduces building composables that share data.

### Topics Covered

- **ViewModel Setup**
  - Creating the first ViewModel in a Jetpack Compose project
  - Adding state variables for composables in the ViewModel
  - Observing ViewModel state in composables

- **Composable Functions**
  - Counter composable
    - Uses state from ViewModel to increment and display a count
  - Login composable
    - Accepts user input (username)
    - Updates ViewModel state

- **State Handling**
  - Using `mutableStateOf()` in the ViewModel for shared state
  - Local composable state using `remember { mutableStateOf() }` if needed
  - Displaying login username in another composable via ViewModel

- **Communication Between Composables**
  - Sharing state through ViewModel to avoid direct composable coupling
  - Updating UI automatically when state changes

### Learning Outcomes

By the end of Week 8, students will be able to:

- Understand and implement a **ViewModel** in Jetpack Compose
- Manage shared state between multiple composables
- Use local state (`remember`) for composable-specific data
- Build interactive composables like counters and login forms
- Observe and react to state changes in composables seamlessly

Official documentation:

- ViewModel Overview  
  https://developer.android.com/topic/libraries/architecture/viewmodel

- State in Compose  
  https://developer.android.com/jetpack/compose/state

---

## Week 9 — Navigation and Scaffold in Jetpack Compose

This week introduces **application structure and navigation** in Jetpack Compose using **Scaffold** and the **Navigation Component**.

### Topics Covered

- **Scaffold Layout**
  - Using `Scaffold` to create the basic structure of an Android screen
  - Adding common UI elements such as:
    - TopAppBar
    - FloatingActionButton
    - Bottom Navigation
  - Managing content padding within the Scaffold layout

- **Navigation in Jetpack Compose**
  - Setting up the Navigation dependency
  - Creating a `NavController`
  - Defining navigation routes
  - Using `NavHost` to manage composable destinations

- **Screen Navigation**
  - Navigating between multiple screens
  - Using `navController.navigate()`
  - Handling the back stack with `popBackStack()`

- **Organizing Screens**
  - Structuring composable screens for navigation
  - Managing routes using constants or sealed classes
  - Reusing previously built composables as separate screens

### Learning Outcomes

By the end of Week 9, students will be able to:

- Build structured Android apps using **Scaffold**
- Implement navigation between multiple composable screens
- Use **NavController** and **NavHost** to manage app navigation
- Organize UI into reusable composable screens
- Understand the navigation flow and back stack behavior in Android apps

Official documentation:

- Navigation in Compose  
  https://developer.android.com/jetpack/compose/navigation

- Scaffold Layout  
  https://developer.android.com/reference/kotlin/androidx/compose/material/package-summary#Scaffold

---

## How to Use This Repository

1. Clone the repository:

```bash
git clone https://github.com/your-username/your-repo-name.git

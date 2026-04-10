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
| Week 9 | Navigation, Networking, and Data Layer |
| Week 10 | Location and Google Maps Integration |
| <span style="color:blue;"><strong>Week 11</strong></span> | <span style="color:blue;"><strong>Room Database and Local Persistence</strong></span> |

---

# Projects

---

## Week 1 — Android Fundamentals

Topics covered:
- Android Studio overview
- Project structure
- Activities
- Views and UI components
- Basic user interaction

Official documentation:
- https://developer.android.com/guide/components/activities/intro-activities

---

## Week 2 — Android Layouts and Resources

Topics covered:
- Layouts (Linear, Relative, Constraint)
- XML UI design
- String resources
- Localization

Resources:
- https://developer.android.com/develop/ui/views/layout/linear  
- https://developer.android.com/develop/ui/views/layout/constraint-layout  
- https://developer.android.com/guide/topics/resources/providing-resources  

---

## Week 3 — Adapters and List-Based Views

Topics covered:
- ListView
- ArrayAdapter & BaseAdapter
- View recycling

Resources:
- https://developer.android.com/reference/android/widget/ListView  
- https://developer.android.com/reference/android/widget/ArrayAdapter  

---

## Week 4 — Intents and Activity Lifecycle

Topics covered:
- Intents and navigation
- Activity lifecycle
- Camera usage

Resources:
- https://developer.android.com/guide/components/intents-filters  
- https://developer.android.com/guide/components/activities/activity-lifecycle  

---

## Week 5 — RecyclerView (ToDo App)

Topics covered:
- RecyclerView
- Adapter & ViewHolder
- Click listeners

Resources:
- https://developer.android.com/guide/topics/ui/layout/recyclerview  

---

## Week 7 — Jetpack Compose Basics

Resources:
- https://developer.android.com/jetpack/compose  

---

## Week 8 — ViewModel & State

Resources:
- https://developer.android.com/topic/libraries/architecture/viewmodel  
- https://developer.android.com/jetpack/compose/state  

---

## Week 9 — Navigation, Networking, Data Layer

Topics covered:
- Navigation (NavController)
- API calls
- Retrofit

Resources:
- https://square.github.io/retrofit/  

---

# Week 10 — Location and Google Maps Integration

This week focuses on building **location-based Android applications**.

---

## Location Services

Topics covered:
- Runtime permissions (location)
- FusedLocationProviderClient
- Getting current location
- Location updates

---

## Google Maps

Topics covered:
- Google Maps API setup
- Displaying map
- Adding markers
- Camera movement

---

## Resources

- https://developer.android.com/training/location  
- https://developer.android.com/training/location/request-updates  
- https://developers.google.com/maps/documentation/android-sdk/overview  
- https://developers.google.com/maps/documentation/android-sdk/maps-compose  

---

# Week 11 — Room Database and Local Persistence

This week focuses on **storing and managing data locally** using Room Database.

---

##  What was added in class

In this week, we **enhanced our existing apps** by integrating **Room Database** to replace temporary or in-memory data storage.

### Updates done:
- Converted app data storage to Room DB
- Persisted user data locally
- Connected Room with ViewModel
- Used LiveData / State for reactive UI updates

---

##  Room Database Concepts

Topics covered:
- Entity (table representation)
- DAO (Data Access Object)
- Database class
- CRUD operations (Insert, Update, Delete, Query)
- Integration with ViewModel

---

## Architecture Integration

- Room + ViewModel + UI
- Clean separation of concerns
- Reactive updates using LiveData / Compose State

---

## Resources

Official documentation:
- https://developer.android.com/training/data-storage/room  

Codelabs:
- https://developer.android.com/codelabs/android-room-with-a-view  

Additional guides:
- https://developer.android.com/topic/libraries/architecture  

---

##  Notes

- Room is an abstraction over SQLite
- Always run database operations off the main thread
- Use ViewModel to survive configuration changes
- Combine Room with State (Compose) for reactive UI

---

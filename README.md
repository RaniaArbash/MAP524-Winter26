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
| <span style="color:red;"><strong>Week 9</strong></span> | <span style="color:red;"><strong>Navigation, Networking, and Data Layer</strong></span> |

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

This week introduces modern Android development using Jetpack Compose.

Official documentation:
- https://developer.android.com/jetpack/compose
- https://developer.android.com/jetpack/compose/mental-model

---

## Week 8 — ViewModel and State Management in Jetpack Compose

Topics covered:
- ViewModel setup
- State management using `mutableStateOf`
- Sharing data between composables
- Reactive UI updates

Official documentation:
- https://developer.android.com/topic/libraries/architecture/viewmodel
- https://developer.android.com/jetpack/compose/state

---

## Week 9 — Navigation, Networking, and Data Layer

This week focuses on building **real-world Android apps** by combining navigation, networking, and clean architecture.

---

### 1️⃣ Navigation and Scaffold

- Scaffold layout structure
- TopBar, BottomBar, FAB
- Navigation using NavController
- NavHost and composable destinations
- Back stack handling

---

### 2️⃣ Networking in Android

Networking allows your app to **fetch data from APIs (servers)**.

Examples:
- Fetching users
- Loading products
- Displaying posts

---

### 3️⃣ Retrofit Library

**Retrofit** is a popular library used to handle networking in Android easily.

Official documentation:  
https://square.github.io/retrofit/

#### Why Retrofit?

- Simple API calls
- Converts JSON to Kotlin objects automatically
- Clean and readable code
- Works well with coroutines

#### Example:

```kotlin
interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}

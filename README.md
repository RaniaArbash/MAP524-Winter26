# Android Course Repository

Welcome to the Android Course GitHub repository.  
This repository contains Android Studio projects used during the course to demonstrate core Android development concepts.

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

---

## Projects

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

This project focuses on building user interfaces and working with Android resources.

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

This project focuses on navigation between activities, communication using intents, and understanding how Android manages activity states. It also introduces common system intents and camera integration.

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

### Common Intents

Examples covered:
- Open browser (ACTION_VIEW)
- Dial a phone number
- Send email
- Share text

Official documentation:
- Common intents  
  https://developer.android.com/guide/components/intents-common

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

In this week, students built a complete **ToDo List application** using RecyclerView. The project demonstrates how to efficiently display dynamic lists and handle user interactions using interface listeners.

### RecyclerView

Students learned how RecyclerView improves performance and flexibility compared to ListView.

Topics covered:
- RecyclerView setup
- LayoutManager (LinearLayoutManager)
- Creating a custom RecyclerView Adapter
- ViewHolder pattern
- Binding data to views
- View recycling mechanism

Official documentation:
- RecyclerView overview  
  https://developer.android.com/guide/topics/ui/layout/recyclerview

- RecyclerView.Adapter  
  https://developer.android.com/reference/androidx/recyclerview/widget/RecyclerView.Adapter

---

### Interface Listeners in Android

Students implemented custom interface listeners to communicate from the Adapter back to the Activity.

Topics covered:
- Creating a custom interface
- Implementing the interface in Activity
- Passing listener to Adapter
- Handling item click events
- Clean separation between UI and logic

---

### ToDo List Features Implemented

- Display list of tasks
- Add new tasks
- Handle item click events
- Dynamic UI updates
- Structured adapter-based architecture

---

## How to Use This Repository

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repo-name.git
